package com.ams.AirlineManagementSystem.service;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.Optional;

import com.ams.AirlineManagementSystem.entity.Login;
import com.ams.AirlineManagementSystem.repository.LoginRepository;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final LoginRepository loginRepository;
    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }
    public Optional<Login> authenticate(String userId, String userPass) {
        return loginRepository.findByUserIdAndUserPass(userId, userPass);
    }
}