package com.unimoni.searchdoctors.Controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unimoni.searchdoctors.entity.Doctors;
import com.unimoni.searchdoctors.entity.DoctorsSlots;
import com.unimoni.searchdoctors.entity.ListsDoctors;
import com.unimoni.searchdoctors.entity.PatientBookingDetails;
import com.unimoni.searchdoctors.repo.AddDoctorRepository;
import com.unimoni.searchdoctors.repo.AddDoctorsSlotRepository;
import com.unimoni.searchdoctors.repo.DoctorSlotsRepository;
import com.unimoni.searchdoctors.repo.PatientBookingRepository;
import com.unimoni.searchdoctors.repo.SearchDoctorRepository;
import com.unimoni.searchdoctors.service.SearchDoctorService;

@RestController
@CrossOrigin
@Validated
public class SearchDoctorsController {

	@Autowired
	private SearchDoctorService searchDoctorService;
	

	@Autowired
	private SearchDoctorRepository searchDoctorRepository;
	
	@Autowired
	private AddDoctorRepository addDoctorRepository;
	
	@Autowired
	private AddDoctorsSlotRepository addDoctorsSlotRepository;
	
	@Autowired
	private DoctorSlotsRepository doctorSlotsRepository;
	
	@Autowired
	private PatientBookingRepository patientBookingRepository;
	
	@GetMapping("/searchdoctor/{location}/{specialist}")
	public String listsDoctors(@Size(min = 1) @NotBlank @PathVariable("location")  String location,
			 @Size(min = 5) @PathVariable("specialist") String specialist){
		return "Sundar";
	}
	
	@GetMapping("/search/")
	public ListsDoctors listsDoctors(@Valid @ModelAttribute ListsDoctors list ){
		return list;
	}
	
	@GetMapping("/listDoc/{location}/{specialist}")
	public String listsDoc(@Size(min = 1) @NotBlank @PathVariable("location")  String location,
			 @Size(min = 5) @PathVariable("specialist") String specialist){
		return searchDoctorService.listsDoctors(location, specialist);
	}
	
//	@GetMapping("/add/")
//	public ListsDoctors addListsDoctors(@Valid @ModelAttribute ListsDoctors list ){
//		return searchDoctorRepository.save(list);
//	}
	
	@PostMapping("/doctors/")
	public Doctors addDoctors(@Valid @ModelAttribute Doctors list ){
		return addDoctorRepository.save(list);
	}
	
	@GetMapping("/patientBooking/")
	public PatientBookingDetails patientBooking(@Valid @ModelAttribute PatientBookingDetails list ){
		return patientBookingRepository.save(list);
	}
	
	@PostMapping("/doctorSlots/")
	public DoctorsSlots addDoctorsSlot(@Valid @ModelAttribute DoctorsSlots list){
		return addDoctorsSlotRepository.save(list);
	}
	
	/*@GetMapping("/find/{id}")
	public ListsDoctors findListsDoctors(@PathVariable("id") Long id){
		Optional<ListsDoctors> listsDoctors = searchDoctorRepository.findById(id);
		return listsDoctors.isPresent() ? listsDoctors.get() : null;
	}*/
	
	@GetMapping("/find/{location}/{specialist}")
	public List<Doctors> findListsDoctors(@Size(min = 1) @NotBlank @PathVariable("location")  String location,
			 @Size(min = 5) @PathVariable("specialist") String specialist){
		return searchDoctorRepository.findByLocationAndSpecialist(location, specialist);
	}
	
	@GetMapping("/slots/{doctorID}/{bookingDate}")
	public List<DoctorsSlots> findListsDoctors(@PathVariable("doctorID")  long doctorID,
			 @PathVariable("bookingDate") Date bookingDate){
		return doctorSlotsRepository.findByIdDoctorIDAndIdBookingDate(doctorID, bookingDate);
	}
	
	@PostMapping("/slotBooking/{doctorID}/{bookingDate}/{session}/{slotId}/{blocked}")
	public void updateDoctorsSlot(@PathVariable("doctorID")  long doctorID,
			 @PathVariable("bookingDate") Date bookingDate,@PathVariable("session")  String session,
			 @PathVariable("slotId") long slotId, @PathVariable("blocked") boolean blocked){
		doctorSlotsRepository.setBlocked(doctorID, bookingDate, session, slotId, blocked);
	}
	
	
}
