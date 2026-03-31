package com.ams.AirlineManagementSystem.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.ams.AirlineManagementSystem.entity.Booking;
import com.ams.AirlineManagementSystem.service.BookingService;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public Booking addBooking(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }
}