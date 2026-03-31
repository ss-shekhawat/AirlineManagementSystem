package com.ams.AirlineManagementSystem.entity;

import jakarta.persistence.*;
//import lombok.*;

@Entity
@Table(name = "loginpf")
//@Data
public class Login {

    @Id
    @Column(name = "userId")
    private String userId;

    @Column(name = "userPass")
    private String userPass;

    @Column(name = "userRole")
    private String userRole;

    @Column(name = "lastLogin")
    private String lastLogin;

    @Column(name = "userQstn")
    private String userQstn;

    @Column(name = "userAnswr")
    private String userAnswr;

    @Column(name = "remark")
    private String remark;

    @Column(name = "airStatus")
    private String airStatus;

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getUserPass() { return userPass; }
    public void setUserPass(String userPass) { this.userPass = userPass; }
    
	public String getUserRole() { return userRole; }
	public void setUserRole(String userRole) { this.userRole = userRole; }

	public String getLastLogin() { return lastLogin; }
	public void setLastLogin(String lastLogin) { this.lastLogin = lastLogin; }

	public String getUserQstn() { return userQstn; }
	public void setUserQstn(String userQstn) { this.userQstn = userQstn; }

	public String getUserAnswr() { return userAnswr; }
	public void setUserAnswr(String userAnswr) { this.userAnswr = userAnswr; }

	public String getRemark() { return remark; }
	public void setRemark(String remark) { this.remark = remark; }

	public String getAirStatus() { return airStatus; }
	public void setAirStatus(String airStatus) { this.airStatus = airStatus; }
}