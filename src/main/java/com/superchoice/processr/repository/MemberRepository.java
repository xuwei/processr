package com.superchoice.processr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.superchoice.processr.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
	
}
