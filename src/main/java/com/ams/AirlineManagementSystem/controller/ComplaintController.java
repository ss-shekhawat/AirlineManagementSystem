package com.ams.AirlineManagementSystem.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.ams.AirlineManagementSystem.entity.Complaint;
import com.ams.AirlineManagementSystem.service.ComplaintService;

@RestController
@RequestMapping("/api/complaints")
@CrossOrigin
public class ComplaintController {

    private final ComplaintService complaintService;

    public ComplaintController(ComplaintService complaintService) {
        this.complaintService = complaintService;
    }

    // User Register Complaint
    @PostMapping
    public Complaint registerComplaint(@RequestBody Complaint complaint) {
        return complaintService.registerComplaint(complaint);
    }

    // Admin Resolve Complaint
    @PutMapping("/{id}/resolve")
    public Complaint resolveComplaint(@PathVariable String id,
                                      @RequestParam String response) {
        return complaintService.resolveComplaint(id, response);
    }

    // Get All Complaints
    @GetMapping
    public List<Complaint> getAllComplaints() {
        return complaintService.getAllComplaints();
    }

    // Get Pending Complaints
    @GetMapping("/pending")
    public List<Complaint> getPendingComplaints() {
        return complaintService.getPendingComplaints();
    }

    // Get Complaints by User
    @GetMapping("/user/{usrId}")
    public List<Complaint> getUserComplaints(@PathVariable String usrId) {
        return complaintService.getUserComplaints(usrId);
    }
}