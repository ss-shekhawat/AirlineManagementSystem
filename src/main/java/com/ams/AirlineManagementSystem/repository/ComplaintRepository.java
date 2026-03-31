package com.ams.AirlineManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ams.AirlineManagementSystem.entity.Complaint;
import java.util.List;

public interface ComplaintRepository extends JpaRepository<Complaint, String> {

    List<Complaint> findByStatus(String status);
    List<Complaint> findByUsrId(String usrId);
}