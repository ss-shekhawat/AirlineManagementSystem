package com.ams.AirlineManagementSystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "grievpf")
public class Complaint {

    @Id
    @Column(length = 5)
    private String grvId;

    @Column(length = 5)
    private String usrId;

    @Column(length = 5)
    private String fltId;

    @Column(length = 100)
    private String complaint;

    @Column(length = 100)
    private String response;

    @Column(length = 1)
    private String status;

	public String getGrvId() {
		return grvId;
	}

	public void setGrvId(String grvId) {
		this.grvId = grvId;
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

	public String getComplaint() {
		return complaint;
	}

	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

    
    
}