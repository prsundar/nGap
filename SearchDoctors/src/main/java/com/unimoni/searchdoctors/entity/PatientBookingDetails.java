package com.unimoni.searchdoctors.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class PatientBookingDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long BookingID;

	private long PatientsID;
	
	private long DoctorsID;
	
	private Date AppointmentDates;
	
	private int AppointmentSlots;

	private String AppointmentTime;
	
	private String PatientFirstName;
	
	private String PatientLastName;
	
	private String MobileNo;
	
	private String Email;
	
	
	public PatientBookingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
		

	public PatientBookingDetails(long BookingID,long PatientsID, long DoctorsID,
			Date AppointmentDates,String AppointmentTime, String PatientFirstName, String PatientLastName,
			String MobileNo, String Email) {
		super();
		this.BookingID = BookingID;
		this.PatientsID = PatientsID;
		this.DoctorsID = DoctorsID;
		this.AppointmentDates = AppointmentDates;
		this.AppointmentTime = AppointmentTime;
		this.PatientFirstName = PatientFirstName;
		this.PatientLastName = PatientLastName;
		this.MobileNo = MobileNo;
		this.Email = Email;
	}


	public long getPatientsID() {
		return PatientsID;
	}
	public void setPatientsID(long patientsID) {
		PatientsID = patientsID;
	}


	public long getDoctorsID() {
		return DoctorsID;
	}
	public void setDoctorsID(long doctorsID) {
		DoctorsID = doctorsID;
	}


	public Date getAppointmentDates() {
		return AppointmentDates;
	}
	public void setAppointmentDates(Date appointmentDates) {
		AppointmentDates = appointmentDates;
	}


	public int getAppointmentSlots() {
		return AppointmentSlots;
	}
	public void setAppointmentSlots(int appointmentSlots) {
		AppointmentSlots = appointmentSlots;
	}


	public String getAppointmentTime() {
		return AppointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		AppointmentTime = appointmentTime;
	}


	public String getPatientFirstName() {
		return PatientFirstName;
	}
	public void setPatientFirstName(String patientFirstName) {
		PatientFirstName = patientFirstName;
	}


	public String getPatientLastName() {
		return PatientLastName;
	}
	public void setPatientLastName(String patientLastName) {
		PatientLastName = patientLastName;
	}


	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}


	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
}
