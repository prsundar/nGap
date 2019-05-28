package com.unimoni.searchdoctors.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unimoni.searchdoctors.entity.Doctors;

//public interface SearchDoctorRepository extends CrudRepository<ListsDoctors, Long>{
public interface SearchDoctorRepository extends JpaRepository<Doctors, Long>{

	List<Doctors> findByLocationAndSpecialist(String location, String specialist);
}
