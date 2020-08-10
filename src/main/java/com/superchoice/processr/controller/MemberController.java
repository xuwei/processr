package com.superchoice.processr.controller;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.superchoice.processr.model.Member;
import com.superchoice.processr.repository.MemberRepository;

@RestController
public class MemberController {
	
	@Autowired
	private MemberRepository memberRepository;
	
	@GetMapping("/members")
	public List<Member> retrieveAllMembers() {
		return memberRepository.findAll();
	}
	
	@Async
	@PostMapping("/member")
	public CompletableFuture<Member> createMembers(@RequestBody Member member) {
		Member savedMember = memberRepository.save(member);
		return CompletableFuture.completedFuture(savedMember);
	}
}
