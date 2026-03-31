package com.ams.AirlineManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ams.AirlineManagementSystem.entity.Airline;

public interface AirlineRepository extends JpaRepository<Airline, String> {
}