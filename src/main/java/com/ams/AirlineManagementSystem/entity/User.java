package com.ams.AirlineManagementSystem.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "usermaster")
public class User {

    @Id
    @Column(length = 5)
    private String usrId;

  
	@Column(length = 20)
    private String usrName;

    private LocalDate usrDOB;

    @Column(length = 1)
    private String usrGender;

    @Column(length = 10)
    private String usrMobNum;

    @Column(length = 50)
    private String usrEmail;

    @Column(length = 20)
    private String usrCity;

    private Integer usrPinCode;

    @Column(length = 20)
    private String usrState;

    @Column(length = 100)
    private String usrAddress;

    private Long usrAadhar;

    @Column(length = 1)
    private String usrStatus;

    @Column(length = 15)
    private String usrRemark;

    // Getters & Setters
    
    public String getUsrId() {
  		return usrId;
  	}

  	public void setUsrId(String usrId) {
  		this.usrId = usrId;
  	}

  	public String getUsrName() {
  		return usrName;
  	}

  	public void setUsrName(String usrName) {
  		this.usrName = usrName;
  	}

  	public LocalDate getUsrDOB() {
  		return usrDOB;
  	}

  	public void setUsrDOB(LocalDate usrDOB) {
  		this.usrDOB = usrDOB;
  	}

  	public String getUsrGender() {
  		return usrGender;
  	}

  	public void setUsrGender(String usrGender) {
  		this.usrGender = usrGender;
  	}

  	public String getUsrMobNum() {
  		return usrMobNum;
  	}

  	public void setUsrMobNum(String usrMobNum) {
  		this.usrMobNum = usrMobNum;
  	}

  	public String getUsrEmail() {
  		return usrEmail;
  	}

  	public void setUsrEmail(String usrEmail) {
  		this.usrEmail = usrEmail;
  	}

  	public String getUsrCity() {
  		return usrCity;
  	}

  	public void setUsrCity(String usrCity) {
  		this.usrCity = usrCity;
  	}

  	public Integer getUsrPinCode() {
  		return usrPinCode;
  	}

  	public void setUsrPinCode(Integer usrPinCode) {
  		this.usrPinCode = usrPinCode;
  	}

  	public String getUsrState() {
  		return usrState;
  	}

  	public void setUsrState(String usrState) {
  		this.usrState = usrState;
  	}

  	public String getUsrAddress() {
  		return usrAddress;
  	}

  	public void setUsrAddress(String usrAddress) {
  		this.usrAddress = usrAddress;
  	}

  	public Long getUsrAadhar() {
  		return usrAadhar;
  	}

  	public void setUsrAadhar(Long usrAadhar) {
  		this.usrAadhar = usrAadhar;
  	}

  	public String getUsrStatus() {
  		return usrStatus;
  	}

  	public void setUsrStatus(String usrStatus) {
  		this.usrStatus = usrStatus;
  	}

  	public String getUsrRemark() {
  		return usrRemark;
  	}

  	public void setUsrRemark(String usrRemark) {
  		this.usrRemark = usrRemark;
  	}

}