package com.unimoni.searchdoctors.service;

import org.springframework.stereotype.Component;

@Component
public interface SearchDoctorService {
	
	public String listsDoctors(String location, String Specialist);

}
