package com.superchoice.processr.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.superchoice.processr.repository.MemberRepository;

@RunWith(SpringRunner.class)
@WebMvcTest(MemberController.class)
public class MemberControllerTest {

	@Autowired
    private MockMvc mvc;
	
	@MockBean
    private MemberRepository memberRepository;
	
	@Test
	public void getMembers()
	  throws Exception {
	    mvc.perform(get("/members")
	      .contentType(MediaType.APPLICATION_JSON))
	      .andExpect(status().isOk());
	}
	
	@Test
	public void cleanupMembers()
	  throws Exception {
	    mvc.perform(delete("/members/cleanup")
	      .contentType(MediaType.APPLICATION_JSON))
	      .andExpect(status().isOk());
	}
	
	@Test
	public void postMembers()
	  throws Exception {
	    mvc.perform(post("/members")
	      .content("[{\"transactionIdentifier\":\"1\",\"employerNames\":\"ACME Inc\",\"employerABN\":\"55 794 738 187\",\"fundIdentifier\":\"FUND123\",\"fundEmployerIdentifier\":\"FEID1\",\"memberFirstName\":\"John\",\"memberLastName\":\"Smith\",\"memberOtherNames\":\"\",\"memberDateOfBirth\":\"1990-12-23\",\"memberGender\":\"M\",\"memberAddress\":\"12 Alcott Street Sydney NSW 2000\",\"memberEmail\":\"jsmith@email.com\",\"memberContactNumber\":\"0401234567\",\"memberNumber\":\"M12345\",\"memberTFN\":\"123456782\",\"memberPayrollNumber\":\"P12345\",\"memberEmploymentStatus\":\"Permanent\",\"memberFundRegistrationDate\":\"2017-10-21\",\"postedBy\":\"xuwei@wisetreeapps.com\"}]")
	      .contentType(MediaType.APPLICATION_JSON))
	      .andExpect(status().isOk());
	}
	
}
