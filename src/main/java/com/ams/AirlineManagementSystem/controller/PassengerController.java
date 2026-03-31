package com.ams.AirlineManagementSystem.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.ams.AirlineManagementSystem.entity.Passenger;
import com.ams.AirlineManagementSystem.service.PassengerService;

@RestController
@RequestMapping("/api/passengers")
@CrossOrigin
public class PassengerController {

    private final PassengerService passengerService;

    public PassengerController(PassengerService passengerService) {
        this.passengerService = passengerService;
    }

    @PostMapping
    public Passenger addPassenger(@RequestBody Passenger passenger) {
        return passengerService.addPassenger(passenger);
    }

    @GetMapping
    public List<Passenger> getAllPassengers() {
        return passengerService.getAllPassengers();
    }

    @GetMapping("/user/{usrId}")
    public List<Passenger> getPassengersByUser(@PathVariable String usrId) {
        return passengerService.getPassengersByUser(usrId);
    }
}