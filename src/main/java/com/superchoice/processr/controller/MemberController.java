package com.superchoice.processr.controller;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.superchoice.processr.exception.InvalidRequestException;
import com.superchoice.processr.model.Member;
import com.superchoice.processr.repository.MemberRepository;

@RestController
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	final private int MaxMembersListSize = 500;
	
	@Autowired
	private MemberRepository memberRepository;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/members")
	public List<Member> retrieveAllMembers() {
		return memberRepository.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:80")
	@DeleteMapping("/members/cleanup")
	public CompletableFuture<List<Member>> deleteMembers() {
		memberRepository.deleteAll();
		List<Member> remaining = memberRepository.findAll();
		logger.info("clean up all members");
		return CompletableFuture.completedFuture(remaining);
	}
		
	@Async
	@CrossOrigin(origins = "${client.dev}")
	@PostMapping("/members")
	public CompletableFuture<List<Member>> createMembers(@Valid @RequestBody List<Member> members) throws Exception {
		if(members.size() > MaxMembersListSize) { 
			RuntimeException e = new InvalidRequestException("List size exceeded maximum of " + MaxMembersListSize); 
			logger.error(e.getLocalizedMessage());
			throw e;
		}
		List<Member> savedList = memberRepository.saveAll(members);
		return CompletableFuture.completedFuture(savedList);
	}
}
