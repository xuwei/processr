package com.superchoice.processr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import com.opencsv.bean.CsvBindByName;

@Component
@Entity
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id; 
	
	@CsvBindByName
	private String transactionIdentifier;
    
	@CsvBindByName
	private String employerName;
    
	@CsvBindByName
	private String employerABN;
    
	@CsvBindByName
	private String fundIdentifier;
    
	@CsvBindByName
	private String fundEmployerIdentifier;
    
	@CsvBindByName
	private String memberFirstName;
    
	@CsvBindByName
	private String memberLastName;
    
	@CsvBindByName
	private String memberDateOfBirth;
    
	@CsvBindByName
	private String memberGender;
    
	@CsvBindByName
	private String memberAddress;
    
	@CsvBindByName
	private String memberEmail;
    
	@CsvBindByName
	private String memberContactNumber;
    
	@CsvBindByName
	private String memberNumber;
    
	@CsvBindByName
	private String memberTFN;
    
	@CsvBindByName
	private String memberPayrollNumber;
    
	@CsvBindByName
	private String memberEmploymentStatus;
    
	@CsvBindByName
	private String memberFundRegistrationDate;
	
	protected Member() {
	}

	public Member(Long id, String transactionIdentifier, String employerName, String employerABN, String fundIdentifier,
			String fundEmployerIdentifier, String memberFirstName, String memberLastName, String memberDateOfBirth,
			String memberGender, String memberAddress, String memberEmail, String memberContactNumber,
			String memberNumber, String memberTFN, String memberPayrollNumber, String memberEmploymentStatus,
			String memberFundRegistrationDate) {
		super();
		this.id = id;
		this.transactionIdentifier = transactionIdentifier;
		this.employerName = employerName;
		this.employerABN = employerABN;
		this.fundIdentifier = fundIdentifier;
		this.fundEmployerIdentifier = fundEmployerIdentifier;
		this.memberFirstName = memberFirstName;
		this.memberLastName = memberLastName;
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
	}

	public Long getId() {
		return id;
	}

	public String getTransactionIdentifier() {
		return transactionIdentifier;
	}

	public String getEmployerName() {
		return employerName;
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
}
