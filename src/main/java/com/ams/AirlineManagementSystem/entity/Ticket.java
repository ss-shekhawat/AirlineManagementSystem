package com.ams.AirlineManagementSystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ticketpf")
public class Ticket {

    @Id
    @Column(length = 5)
    private String tktId;

    @Column(length = 5)
    private String bkId;

    @Column(length = 5)
    private String psgId;

    private Integer tktSeatNum;

    @Column(length = 1)
    private String tktStatus;

    @Column(length = 15)
    private String tktRemark;

	public String getTktId() {
		return tktId;
	}

	public void setTktId(String tktId) {
		this.tktId = tktId;
	}

	public String getBkId() {
		return bkId;
	}

	public void setBkId(String bkId) {
		this.bkId = bkId;
	}

	public String getPsgId() {
		return psgId;
	}

	public void setPsgId(String psgId) {
		this.psgId = psgId;
	}

	public Integer getTktSeatNum() {
		return tktSeatNum;
	}

	public void setTktSeatNum(Integer tktSeatNum) {
		this.tktSeatNum = tktSeatNum;
	}

	public String getTktStatus() {
		return tktStatus;
	}

	public void setTktStatus(String tktStatus) {
		this.tktStatus = tktStatus;
	}

	public String getTktRemark() {
		return tktRemark;
	}

	public void setTktRemark(String tktRemark) {
		this.tktRemark = tktRemark;
	}

}