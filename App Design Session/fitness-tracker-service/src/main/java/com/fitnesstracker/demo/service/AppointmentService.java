package com.fitnesstracker.demo.service;

import java.util.ArrayList;
import java.util.List;
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
	
	public void createAppointment(Appointment appointment) {
		String customerString = convertCustomerToString(appointment.getCustomer());
		appointment.setCustomerData(customerString);
		if(appointment.getPackage_details_key() == 1) {
			appointment.setWeeks(0);
		}
		appointmentRepository.save(appointment);
	}

	private String convertCustomerToString(Customer customer) {
		return customer.toString();
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
		return appointmentRepository.findAll().stream().filter(app -> app.getCustomer().getName().equals(customer_name)).collect(Collectors.toList());
	}

	public List<Appointment> getAppointmentByCustomerEmail(String email) {
		return appointmentRepository.findAll().stream().filter(app -> app.getCustomer().getEmail().equals(email)).collect(Collectors.toList());
	}
}
