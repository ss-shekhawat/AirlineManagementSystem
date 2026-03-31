package com.ams.AirlineManagementSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ams.AirlineManagementSystem.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, String> {
	
	List<Flight> findByFltOriginAndFltDestAndFltStatus(
	        String fltOrigin,
	        String fltDest,
	        String fltStatus
	);
}