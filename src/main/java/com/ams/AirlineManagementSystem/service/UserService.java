package com.ams.AirlineManagementSystem.service;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.ams.AirlineManagementSystem.entity.User;
import com.ams.AirlineManagementSystem.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Register User
    public User registerUser(User user) {
        user.setUsrStatus("A");
        user.setUsrRemark("Active User");
        return userRepository.save(user);
    }

    // Get All Users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get User By ID
    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    // Update User
    public User updateUser(String id, User updatedUser) {
        return userRepository.findById(id).map(user -> {
            user.setUsrName(updatedUser.getUsrName());
            user.setUsrDOB(updatedUser.getUsrDOB());
            user.setUsrGender(updatedUser.getUsrGender());
            user.setUsrMobNum(updatedUser.getUsrMobNum());
            user.setUsrEmail(updatedUser.getUsrEmail());
            user.setUsrCity(updatedUser.getUsrCity());
            user.setUsrPinCode(updatedUser.getUsrPinCode());
            user.setUsrState(updatedUser.getUsrState());
            user.setUsrAddress(updatedUser.getUsrAddress());
            return userRepository.save(user);
        }).orElseThrow(() -> new RuntimeException("User not found"));
    }
}