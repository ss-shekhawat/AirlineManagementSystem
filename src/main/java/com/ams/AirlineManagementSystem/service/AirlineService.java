package com.ams.AirlineManagementSystem.service;

import org.springframework.stereotype.Service;
import java.util.List;

import com.ams.AirlineManagementSystem.entity.Airline;
import com.ams.AirlineManagementSystem.repository.AirlineRepository;

@Service
public class AirlineService {

    private final AirlineRepository airlineRepository;

    public AirlineService(AirlineRepository airlineRepository) {
        this.airlineRepository = airlineRepository;
    }

    public Airline saveAirline(Airline airline) {
        return airlineRepository.save(airline);
    }

    public List<Airline> getAllAirlines() {
        return airlineRepository.findAll();
    }
}