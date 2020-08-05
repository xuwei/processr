package com.superchoice.processr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.superchoice.processr.model.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
