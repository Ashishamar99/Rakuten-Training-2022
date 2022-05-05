package com.fitnesstracker.demo.service;

import java.beans.FeatureDescriptor;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fitnesstracker.demo.entities.Appointment;
import com.fitnesstracker.demo.entities.Customer;
import com.fitnesstracker.demo.repositories.AppointmentRepository;
import com.fitnesstracker.demo.tools.PersistenceUtils;
import com.fitnesstracker.demo.tools.SetCustomerData;

@Service
public class AppointmentService {
	
	@Autowired
	AppointmentRepository appointmentRepository;
	
	List<Appointment> appointments;
	
	public void createAppointment(Appointment appointment) {
		String customerString = appointment.getCustomer().toString();
		appointment.setCustomerData(customerString);
		if(appointment.getPackage_details_key() == 1) {
			appointment.setWeeks(0);
		}
		appointmentRepository.save(appointment);
	}

	public List<Appointment> getAllAppointments() {
		return appointmentRepository.findAll();
	}

	public List<Appointment> getAppointmentByCustomerName(String customer_name) {
		appointments = SetCustomerData.setCustomerEntityFromData(appointmentRepository, appointments);
		return appointments.stream().filter(app -> app.getCustomer().getName().equals(customer_name)).collect(Collectors.toList());
	}

	public List<Appointment> getAppointmentByCustomerEmail(String email) {
		appointments = SetCustomerData.setCustomerEntityFromData(appointmentRepository, appointments);
		return appointments.stream().filter(app -> app.getCustomer().getEmail().equals(email)).collect(Collectors.toList());
	}

	public void deleteAppointmentById(Integer id) {
		appointmentRepository.deleteById(id);
	}

	public void updateAppointmentById(Appointment updatedAppointment, Integer id) {
		
		//The below commented code, shows optional, partial updation of the json. 
		//Grabbed from --> https://stackoverflow.com/questions/52424734/basic-put-update-on-spring-boot
		
//		Optional<Appointment> myAppointment = appointmentRepository.findById(id);
//		updatedAppointment = (Appointment) PersistenceUtils.partialUpdate(myAppointment.get(), updatedAppointment);
//		appointmentRepository.save(updatedAppointment);
		
		
		System.out.println(updatedAppointment);
		updatedAppointment.setId(id);
		appointmentRepository.save(updatedAppointment);
		
	}
}
