package com.ams.AirlineManagementSystem.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "bookingpf")
public class Booking {

    @Id
    @Column(length = 5)
    private String bkId;

    public String getBkId() {
		return bkId;
	}

	public void setBkId(String bkId) {
		this.bkId = bkId;
	}

	public String getUsrId() {
		return usrId;
	}

	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}

	public String getFltId() {
		return fltId;
	}

	public void setFltId(String fltId) {
		this.fltId = fltId;
	}

	public LocalDate getBkDate() {
		return bkDate;
	}

	public void setBkDate(LocalDate bkDate) {
		this.bkDate = bkDate;
	}

	public LocalDate getBkDepDate() {
		return bkDepDate;
	}

	public void setBkDepDate(LocalDate bkDepDate) {
		this.bkDepDate = bkDepDate;
	}

	public String getBkStatus() {
		return bkStatus;
	}

	public void setBkStatus(String bkStatus) {
		this.bkStatus = bkStatus;
	}

	public String getBkRemark() {
		return bkRemark;
	}

	public void setBkRemark(String bkRemark) {
		this.bkRemark = bkRemark;
	}

	@Column(length = 5)
    private String usrId;

    @Column(length = 5)
    private String fltId;

    private LocalDate bkDate;

    private LocalDate bkDepDate;

    @Column(length = 1)
    private String bkStatus;

    @Column(length = 15)
    private String bkRemark;

    // Getters & Setters
}