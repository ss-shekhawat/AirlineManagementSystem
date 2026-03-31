package com.ams.AirlineManagementSystem.service;

import org.springframework.stereotype.Service;
import java.util.List;

import com.ams.AirlineManagementSystem.entity.Ticket;
import com.ams.AirlineManagementSystem.repository.TicketRepository;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Ticket createTicket(Ticket ticket) {
        ticket.setTktStatus("U");
        ticket.setTktRemark("Upcoming Ticket");
        return ticketRepository.save(ticket);
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    public List<Ticket> getTicketsByBooking(String bkId) {
        return ticketRepository.findByBkId(bkId);
    }

    public Ticket cancelTicket(String id) {
        return ticketRepository.findById(id).map(ticket -> {
            ticket.setTktStatus("C");
            ticket.setTktRemark("Cancelled");
            return ticketRepository.save(ticket);
        }).orElseThrow(() -> new RuntimeException("Ticket not found"));
    }
}