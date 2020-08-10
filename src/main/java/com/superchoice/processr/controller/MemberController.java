package com.superchoice.processr.controller;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.superchoice.processr.exception.InvalidRequestException;
import com.superchoice.processr.model.Member;
import com.superchoice.processr.repository.MemberRepository;

@RestController
public class MemberController {
	
	final private int MaxMembersListSize = 500;
	
	@Autowired
	private MemberRepository memberRepository;
	
	
	
	@CrossOrigin(origins = "*")
	@GetMapping("/members")
	public List<Member> retrieveAllMembers() {
		return memberRepository.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:80")
	@GetMapping("/members/cleanup")
	public CompletableFuture<List<Member>> deleteMembers() {
		memberRepository.deleteAll();
		List<Member> remaining = memberRepository.findAll();
		return CompletableFuture.completedFuture(remaining);
	}
	
	@Async
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/member")
	public CompletableFuture<Member> createMember(@RequestBody Member member) {
		Member savedMember = memberRepository.save(member);
		return CompletableFuture.completedFuture(savedMember);
	}
	
	@Async
	@CrossOrigin(origins = "http://localhost:3000, http://processr.wisetreeapps.com")
	@PostMapping("/members")
	public CompletableFuture<List<Member>> createMembers(@RequestBody List<Member> members) {
		if(members.size() > MaxMembersListSize) { throw new InvalidRequestException("List size exceeded maximum of " + MaxMembersListSize); }
		List<Member> savedList = memberRepository.saveAll(members);
		return CompletableFuture.completedFuture(savedList);
	}
}
