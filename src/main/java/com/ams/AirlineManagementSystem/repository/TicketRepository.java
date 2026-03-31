package com.ams.AirlineManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ams.AirlineManagementSystem.entity.Ticket;
import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, String> {

    List<Ticket> findByBkId(String bkId);
}