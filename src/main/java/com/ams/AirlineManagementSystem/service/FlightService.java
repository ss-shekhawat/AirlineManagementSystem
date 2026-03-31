package com.ams.AirlineManagementSystem.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.ams.AirlineManagementSystem.entity.Flight;
import com.ams.AirlineManagementSystem.repository.FlightRepository;

@Service
public class FlightService {

    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public Flight saveFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }
    
    public List<Flight> searchFlights(String origin, String dest) {
        return flightRepository.findByFltOriginAndFltDestAndFltStatus(
                origin,
                dest,
                "A"   // Only Active Flights
        );
    }
}