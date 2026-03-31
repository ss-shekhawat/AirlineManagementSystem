package com.ams.AirlineManagementSystem.dto;

public class LoginResponse {

    private String userId;
    private String userRole;
    private String message;

    public LoginResponse(String userId, String userRole, String message) {
        this.userId = userId;
        this.userRole = userRole;
        this.message = message;
    }



    // getters
	public String getUserId() { return userId; }
    public String getUserRole() { return userRole; }
    public String getMessage() { return message; }
}