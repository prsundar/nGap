package com.unimoni.searchdoctors.impl;

import org.springframework.stereotype.Service;

import com.unimoni.searchdoctors.service.SearchDoctorService;

@Service
public class SearchDoctorServiceImpl implements SearchDoctorService{

	@Override
	public String listsDoctors(String location, String Specialist) {
		// TODO Auto-generated method stub
		return location+Specialist;
	}

}
