package com.ams.AirlineManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ams.AirlineManagementSystem.entity.Login;

import java.util.Optional;

public interface LoginRepository extends JpaRepository<Login, String> {

    Optional<Login> findByUserIdAndUserPass(String userId, String userPass);

}