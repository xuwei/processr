package com.superchoice.processr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.superchoice.processr.model.Member;
import com.superchoice.processr.repository.MemberRepository;

@RestController
public class MemberController {
	
	@Autowired
	private MemberRepository memberRepository;
	
	@GetMapping("/member")
	public String retrieveAllMembers() {
		return "hello world";
	}
}
