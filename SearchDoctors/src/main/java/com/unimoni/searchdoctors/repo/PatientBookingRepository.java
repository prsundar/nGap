package com.unimoni.searchdoctors.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unimoni.searchdoctors.entity.PatientBookingDetails;

public interface PatientBookingRepository extends JpaRepository<PatientBookingDetails, Long>{

}
