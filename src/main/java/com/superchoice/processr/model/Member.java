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
	private String employeeName;
	
	@CsvBindByName
	private String employeeABN;
	
	@CsvBindByName
	private String fundIdentifier;
	
	@CsvBindByName
	private String fundEmployeeIdentifier;
	
	@CsvBindByName
	private String memberFirstname;
	
	@CsvBindByName
	private String memberLastname;
	
	@CsvBindByName
	private String memberDOB;
	
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
	private String memberEmployeeStatus;
	
	@CsvBindByName
	private String memberFundRegistrationDate;
	
	
	protected Member() {
	}

	public Member(String transactionIdentifier, String employeeName, String employeeABN, String fundIdentifier,
			String fundEmployeeIdentifier, String memberFirstname, String memberLastname, String memberDOB,
			String memberGender, String memberAddress, String memberEmail, String memberContactNumber,
			String memberNumber, String memberTFN, String memberPayrollNumber, String memberEmployeeStatus,
			String memberFundRegistrationDate) {
		super();
		this.transactionIdentifier = transactionIdentifier;
		this.employeeName = employeeName;
		this.employeeABN = employeeABN;
		this.fundIdentifier = fundIdentifier;
		this.fundEmployeeIdentifier = fundEmployeeIdentifier;
		this.memberFirstname = memberFirstname;
		this.memberLastname = memberLastname;
		this.memberDOB = memberDOB;
		this.memberGender = memberGender;
		this.memberAddress = memberAddress;
		this.memberEmail = memberEmail;
		this.memberContactNumber = memberContactNumber;
		this.memberNumber = memberNumber;
		this.memberTFN = memberTFN;
		this.memberPayrollNumber = memberPayrollNumber;
		this.memberEmployeeStatus = memberEmployeeStatus;
		this.memberFundRegistrationDate = memberFundRegistrationDate;
	}


	public Long getId() {
		return id;
	}


	public String getTransactionIdentifier() {
		return transactionIdentifier;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public String getEmployeeABN() {
		return employeeABN;
	}


	public String getFundIdentifier() {
		return fundIdentifier;
	}


	public String getFundEmployeeIdentifier() {
		return fundEmployeeIdentifier;
	}


	public String getMemberFirstname() {
		return memberFirstname;
	}


	public String getMemberLastname() {
		return memberLastname;
	}


	public String getMemberDOB() {
		return memberDOB;
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


	public String getMemberEmployeeStatus() {
		return memberEmployeeStatus;
	}


	public String getMemberFundRegistrationDate() {
		return memberFundRegistrationDate;
	}
}
