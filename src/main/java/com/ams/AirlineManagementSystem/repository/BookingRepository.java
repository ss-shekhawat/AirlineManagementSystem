package com.ams.AirlineManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ams.AirlineManagementSystem.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, String> {
}