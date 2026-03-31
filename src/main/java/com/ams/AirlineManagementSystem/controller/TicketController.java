package com.ams.AirlineManagementSystem.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.ams.AirlineManagementSystem.entity.Ticket;
import com.ams.AirlineManagementSystem.service.TicketService;

@RestController
@RequestMapping("/api/tickets")
@CrossOrigin
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketService.createTicket(ticket);
    }

    @GetMapping
    public List<Ticket> getAllTickets() {
        return ticketService.getAllTickets();
    }

    @GetMapping("/booking/{bkId}")
    public List<Ticket> getTicketsByBooking(@PathVariable String bkId) {
        return ticketService.getTicketsByBooking(bkId);
    }

    @PutMapping("/{id}/cancel")
    public Ticket cancelTicket(@PathVariable String id) {
        return ticketService.cancelTicket(id);
    }
}