package com.ams.AirlineManagementSystem.controller;

import org.springframework.web.bind.annotation.*;
//import lombok.RequiredArgsConstructor;
import java.util.Optional;

import com.ams.AirlineManagementSystem.dto.LoginResponse;
import com.ams.AirlineManagementSystem.entity.Login;
import com.ams.AirlineManagementSystem.service.LoginService;

@RestController
@RequestMapping("/api/auth")
//@RequiredArgsConstructor
@CrossOrigin
public class AuthController {

    private final LoginService loginService ;
    
    public AuthController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public Object login(@RequestBody Login request) {

        Optional<Login> user = loginService.authenticate(
                request.getUserId(),
                request.getUserPass()
        );

        if (user.isPresent()) {
        	Login u = user.get();
        	
        	return new LoginResponse(
        			u.getUserId(),
        			u.getUserRole(),
        			"Login Successful");
        } else {
            return "Invalid Credentials";
        }
    }
}