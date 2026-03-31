package com.ams.AirlineManagementSystem.service;

import org.springframework.stereotype.Service;
import java.util.List;

import com.ams.AirlineManagementSystem.entity.Passenger;
import com.ams.AirlineManagementSystem.repository.PassengerRepository;

@Service
public class PassengerService {

    private final PassengerRepository passengerRepository;

    public PassengerService(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    public Passenger addPassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    public List<Passenger> getAllPassengers() {
        return passengerRepository.findAll();
    }

    public List<Passenger> getPassengersByUser(String usrId) {
        return passengerRepository.findByUsrId(usrId);
    }
}