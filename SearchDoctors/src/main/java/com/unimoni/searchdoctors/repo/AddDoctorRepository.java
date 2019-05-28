package com.unimoni.searchdoctors.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unimoni.searchdoctors.entity.Doctors;

public interface AddDoctorRepository extends JpaRepository<Doctors, Long>{

}


