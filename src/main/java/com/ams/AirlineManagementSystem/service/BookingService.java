package com.ams.AirlineManagementSystem.service;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import com.ams.AirlineManagementSystem.entity.Booking;
import com.ams.AirlineManagementSystem.repository.BookingRepository;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking createBooking(Booking booking) {
        booking.setBkDate(LocalDate.now());
        booking.setBkStatus("U"); // Default Upcoming
        booking.setBkRemark("Booked");
        return bookingRepository.save(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
}