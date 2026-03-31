package com.ams.AirlineManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ams.AirlineManagementSystem.entity.Passenger;
import java.util.List;

public interface PassengerRepository extends JpaRepository<Passenger, String> {

    List<Passenger> findByUsrId(String usrId);
}