package com.fitnesstracker.demo.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fitnesstracker.demo.entities.Appointment;
import com.fitnesstracker.demo.entities.Customer;
import com.fitnesstracker.demo.repositories.AppointmentRepository;

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
		//		for (Appointment app : appointments) {
		//			if(app.getCustomer().getName().equals(customer_name)) {
		//				return app;
		//			}
		//		}
		//		return new Appointment();
		
		//Using Streams instead of the above logic.
		appointments = setCustomerEntityFromData(appointments);
		return appointments.stream().filter(app -> app.getCustomer().getName().equals(customer_name)).collect(Collectors.toList());
	}

	public List<Appointment> getAppointmentByCustomerEmail(String email) {
		setCustomerEntityFromData(appointments);
		return appointments.stream().filter(app -> app.getCustomer().getEmail().equals(email)).collect(Collectors.toList());
	}
	
	private List<Appointment> setCustomerEntityFromData(List<Appointment> fetchedAppointments){
		fetchedAppointments = appointmentRepository.findAll();
		
		fetchedAppointments.forEach(singleAppointment -> {
			String[] dataToProcess = singleAppointment.getCustomerData().split(",");
			
			String name = dataToProcess[0].split("=")[1].trim();
			int age = Integer.valueOf(dataToProcess[1].split("=")[1].trim());
			BigInteger mobile = new BigInteger(dataToProcess[2].split("=")[1].trim());
			String email = dataToProcess[3].split("=")[1].trim();
			String address = dataToProcess[4].split("=")[1].trim();
			
			singleAppointment.setCustomer(new Customer(name, address, email, mobile, age));
		});
		
		return fetchedAppointments;
	}

	public void deleteAppointmentById(Integer id) {
		appointmentRepository.deleteById(id);
	}

	public void updateAppointmentById(Appointment updatedAppointment, Integer id) {
		appointmentRepository.deleteById(id);
		appointmentRepository.save(updatedAppointment);
		
	}
}
