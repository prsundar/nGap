package com.unimoni.searchdoctors.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Doctors {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long ID;
	
	@NotBlank
	@NotEmpty
	@NotNull
	@Size(min = 1, max = 60, message = "{EV100}")
	private String location;
	@NotBlank
	@NotEmpty
	@NotNull
	private String specialist;
	
	private String hospitalName;
	private String dName;
	
	private String email;
	private String contactNo;
	private String address;
	
	private String openingTime;
	private String closingTime;
	private int appointmentGap;
	
	
	private Date createdOn = new Date();
	
	
	public Doctors() {
		super();
		// TODO Auto-generated constructor stub
	}
		

	public Doctors(long iD,
			@NotBlank @NotEmpty @NotNull @Size(min = 1, max = 60, message = "{EV100}") String location,
			@NotBlank @NotEmpty @NotNull String specialist, String hospitalName, 
			String dName,String email, String contactNo, String address, String openingTime,
			String closingTime, int appointmentGap) {
		super();
		ID = iD;
		this.location = location;
		this.specialist = specialist;
		this.hospitalName = hospitalName;
		this.dName = dName;
		//this.createdOn = createdOn;
		this.email = email;
		this.contactNo = contactNo;
		this.address = address;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
		this.appointmentGap = appointmentGap;
	}


	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}


	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}


	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}


	public String getOpeningTime() {
		return openingTime;
	}
	public void setOpeningTime(String openingTime) {
		this.openingTime = openingTime;
	}


	public String getClosingTime() {
		return closingTime;
	}
	public void setClosingTime(String closingTime) {
		this.closingTime = closingTime;
	}


	public int getAppointmentGap() {
		return appointmentGap;
	}
	public void setAppointmentGap(int appointmentGap) {
		this.appointmentGap = appointmentGap;
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}


	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
}
