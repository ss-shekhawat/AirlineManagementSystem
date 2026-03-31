package com.ams.AirlineManagementSystem.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.ams.AirlineManagementSystem.entity.Airline;
import com.ams.AirlineManagementSystem.entity.Flight;
import com.ams.AirlineManagementSystem.service.AirlineService;

@RestController
@RequestMapping("/api/airlines")
@CrossOrigin
public class AirlineController {

    private final AirlineService airlineService;

    public AirlineController(AirlineService airlineService) {
        this.airlineService = airlineService;
    }

    // ➕ Add Airline
    @PostMapping
    public Airline addAirline(@RequestBody Airline airline) {
        return airlineService.saveAirline(airline);
    }

    // 📄 View All Airlines
    @GetMapping
    public List<Airline> getAllAirlines() {
        return airlineService.getAllAirlines();
    }
    

}