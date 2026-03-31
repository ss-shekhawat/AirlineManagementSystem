package com.ams.AirlineManagementSystem.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.ams.AirlineManagementSystem.entity.Flight;
import com.ams.AirlineManagementSystem.service.FlightService;

@RestController
@RequestMapping("/api/flights")
@CrossOrigin
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @PostMapping
    public Flight addFlight(@RequestBody Flight flight) {
        return flightService.saveFlight(flight);
    }

    @GetMapping
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }
    
    @GetMapping("/search")
    public List<Flight> searchFlights(
            @RequestParam String origin,
            @RequestParam String dest
    ) {
        return flightService.searchFlights(origin, dest);
    }
}