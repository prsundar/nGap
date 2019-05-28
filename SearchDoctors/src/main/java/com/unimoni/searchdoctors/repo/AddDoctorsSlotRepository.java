
package com.unimoni.searchdoctors.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.unimoni.searchdoctors.entity.DoctorSlotID;
import com.unimoni.searchdoctors.entity.DoctorsSlots;

public interface AddDoctorsSlotRepository extends JpaRepository<DoctorsSlots , Long>{

}