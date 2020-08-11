package com.superchoice.processr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

/**
 * @author xuweiliang
 *
 */
@Component
@Entity
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id; 
	
	@NotNull
	@NotEmpty 
	private String transactionIdentifier;
    
	@NotNull
	@NotEmpty 
	private String employerNames;
    
	@NotNull
	@NotEmpty 
	private String employerABN;
    
	@NotNull
	@NotEmpty 
	private String fundIdentifier;
    
	@NotNull
	@NotEmpty 
	private String fundEmployerIdentifier;
    
	@NotNull
	@NotEmpty 
	private String memberFirstName;
    
	@NotNull
	@NotEmpty 
	private String memberLastName;
	 
	private String memberOtherNames;
    
	@NotNull
	@NotEmpty 
	private String memberDateOfBirth;
    
	@NotNull
	@NotEmpty 
	private String memberGender;
    
	@NotNull
	@NotEmpty 
	private String memberAddress;
    
	@NotNull
	@NotEmpty 
	@Email
	private String memberEmail;
    
	private String memberContactNumber;
    
	@NotNull
	@NotEmpty 
	private String memberNumber;
    
	@NotNull
	@NotEmpty 
	private String memberTFN;
    
	@NotNull
	@NotEmpty 
	private String memberPayrollNumber;
    
	@NotNull
	@NotEmpty 
	private String memberEmploymentStatus;
    
	@NotNull
	@NotEmpty 
	private String memberFundRegistrationDate;
	
	@NotNull
	@NotEmpty 
	@Email
	private String postedBy;
	
	protected Member() {
	}

	public Member(Long id, @NotNull @NotEmpty String transactionIdentifier, @NotNull @NotEmpty String employerNames,
			@NotNull @NotEmpty String employerABN, @NotNull @NotEmpty String fundIdentifier,
			@NotNull @NotEmpty String fundEmployerIdentifier, @NotNull @NotEmpty String memberFirstName,
			@NotNull @NotEmpty String memberLastName, String memberOtherNames,
			@NotNull @NotEmpty String memberDateOfBirth, @NotNull @NotEmpty String memberGender,
			@NotNull @NotEmpty String memberAddress, @NotNull @NotEmpty @Email String memberEmail,
			String memberContactNumber, @NotNull @NotEmpty String memberNumber, @NotNull @NotEmpty String memberTFN,
			@NotNull @NotEmpty String memberPayrollNumber, @NotNull @NotEmpty String memberEmploymentStatus,
			@NotNull @NotEmpty String memberFundRegistrationDate, @NotNull @NotEmpty @Email String postedBy) {
		super();
		this.id = id;
		this.transactionIdentifier = transactionIdentifier;
		this.employerNames = employerNames;
		this.employerABN = employerABN;
		this.fundIdentifier = fundIdentifier;
		this.fundEmployerIdentifier = fundEmployerIdentifier;
		this.memberFirstName = memberFirstName;
		this.memberLastName = memberLastName;
		this.memberOtherNames = memberOtherNames;
		this.memberDateOfBirth = memberDateOfBirth;
		this.memberGender = memberGender;
		this.memberAddress = memberAddress;
		this.memberEmail = memberEmail;
		this.memberContactNumber = memberContactNumber;
		this.memberNumber = memberNumber;
		this.memberTFN = memberTFN;
		this.memberPayrollNumber = memberPayrollNumber;
		this.memberEmploymentStatus = memberEmploymentStatus;
		this.memberFundRegistrationDate = memberFundRegistrationDate;
		this.postedBy = postedBy;
	}

	public Long getId() {
		return id;
	}

	public String getTransactionIdentifier() {
		return transactionIdentifier;
	}

	public String getEmployerNames() {
		return employerNames;
	}

	public String getEmployerABN() {
		return employerABN;
	}

	public String getFundIdentifier() {
		return fundIdentifier;
	}

	public String getFundEmployerIdentifier() {
		return fundEmployerIdentifier;
	}

	public String getMemberFirstName() {
		return memberFirstName;
	}

	public String getMemberLastName() {
		return memberLastName;
	}

	public String getMemberOtherNames() {
		return memberOtherNames;
	}

	public String getMemberDateOfBirth() {
		return memberDateOfBirth;
	}

	public String getMemberGender() {
		return memberGender;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public String getMemberContactNumber() {
		return memberContactNumber;
	}

	public String getMemberNumber() {
		return memberNumber;
	}

	public String getMemberTFN() {
		return memberTFN;
	}

	public String getMemberPayrollNumber() {
		return memberPayrollNumber;
	}

	public String getMemberEmploymentStatus() {
		return memberEmploymentStatus;
	}

	public String getMemberFundRegistrationDate() {
		return memberFundRegistrationDate;
	}

	public String getPostedBy() {
		return postedBy;
	}
}
