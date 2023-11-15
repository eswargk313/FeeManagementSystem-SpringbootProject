package com.project.dao;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="StudentDetails")
public class StudentDetails  {

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_gen")
    @SequenceGenerator(name = "student_gen", sequenceName = "student_seq", allocationSize = 1)
	private Integer sRollNo;
	private String sName;
	private String sBranch;
	private Integer sYear;
	private Long sContact;
	private Double sFee;
	private String sAddress;

	public Integer getsRollNo() {
		return sRollNo;
	}

	public void setsRollNo(Integer sRollNo) {
		this.sRollNo = sRollNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsBranch() {
		return sBranch;
	}

	public void setsBranch(String sBranch) {
		this.sBranch = sBranch;
	}

	public Integer getsYear() {
		return sYear;
	}

	public void setsYear(Integer sYear) {
		this.sYear = sYear;
	}

	public Long getsContact() {
		return sContact;
	}

	public void setsContact(Long sContact) {
		this.sContact = sContact;
	}

	public Double getsFee() {
		return sFee;
	}

	public void setsFee(Double sFee) {
		this.sFee = sFee;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	@Override
	public String toString() {
		return "StudentDetails [sRollNo=" + sRollNo + ", sName=" + sName + ", sBranch=" + sBranch + ", sYear="
				+ sYear + ", sContact=" + sContact + ", sFee=" + sFee + ", sAddress=" + sAddress + "]";
	}

}
