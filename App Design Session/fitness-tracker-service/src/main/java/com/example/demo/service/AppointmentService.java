package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Appointment;

@Service
public class AppointmentService {
	
	List<Appointment> appointments = new ArrayList<>();
	
	public void createAppointment(Appointment appointment) {
		if(appointment.getPackage_details_key() == 1) {
			appointment.setWeeks(0);
		}
		appointments.add(appointment);
	}

	public List<Appointment> getAllAppointments() {
		return appointments;
	}

	public List<Appointment> getAppointmentByCustomerName(String customer_name) {
		//		for (Appointment app : appointments) {
		//			if(app.getCustomer().getName().equals(customer_name)) {
		//				return app;
		//			}
		//		}
		//		return new Appointment();
		
		//Using Streams instead of the above logic.
		return appointments.stream().filter(app -> app.getCustomer().getName().equals(customer_name)).collect(Collectors.toList());
	}

	public List<Appointment> getAppointmentByCustomerEmail(String email) {
		return appointments.stream().filter(app -> app.getCustomer().getEmail().equals(email)).collect(Collectors.toList());
	}
}
