package com.ams.AirlineManagementSystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "psngrpf")
public class Passenger {

    @Id
    @Column(length = 5)
    private String psgId;

    @Column(length = 5)
    private String usrId;

    @Column(length = 20)
    private String psgName;

    @Column(length = 1)
    private String psgGender;

    private Integer psgAge;

    @Column(length = 10)
    private String psgRltn;

	public String getPsgId() {
		return psgId;
	}

	public void setPsgId(String psgId) {
		this.psgId = psgId;
	}

	public String getUsrId() {
		return usrId;
	}

	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}

	public String getPsgName() {
		return psgName;
	}

	public void setPsgName(String psgName) {
		this.psgName = psgName;
	}

	public String getPsgGender() {
		return psgGender;
	}

	public void setPsgGender(String psgGender) {
		this.psgGender = psgGender;
	}

	public Integer getPsgAge() {
		return psgAge;
	}

	public void setPsgAge(Integer psgAge) {
		this.psgAge = psgAge;
	}

	public String getPsgRltn() {
		return psgRltn;
	}

	public void setPsgRltn(String psgRltn) {
		this.psgRltn = psgRltn;
	}

    
    
    
}