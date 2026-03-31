package com.ams.AirlineManagementSystem.service;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.ams.AirlineManagementSystem.entity.Complaint;
import com.ams.AirlineManagementSystem.repository.ComplaintRepository;

@Service
public class ComplaintService {

    private final ComplaintRepository complaintRepository;

    public ComplaintService(ComplaintRepository complaintRepository) {
        this.complaintRepository = complaintRepository;
    }

    // User registers complaint
    public Complaint registerComplaint(Complaint complaint) {
        complaint.setStatus("P"); // Pending
        complaint.setResponse("Not Responded Yet");
        return complaintRepository.save(complaint);
    }

    // Admin resolves complaint
    public Complaint resolveComplaint(String id, String response) {
        return complaintRepository.findById(id).map(comp -> {
            comp.setResponse(response);
            comp.setStatus("R");
            return complaintRepository.save(comp);
        }).orElseThrow(() -> new RuntimeException("Complaint not found"));
    }

    public List<Complaint> getAllComplaints() {
        return complaintRepository.findAll();
    }

    public List<Complaint> getPendingComplaints() {
        return complaintRepository.findByStatus("P");
    }

    public List<Complaint> getUserComplaints(String usrId) {
        return complaintRepository.findByUsrId(usrId);
    }
}