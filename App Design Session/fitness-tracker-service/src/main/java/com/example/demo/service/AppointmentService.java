package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.templates.Appointment;

@Service
public class AppointmentService {
	
	List<Appointment> appointments = new ArrayList<>();
	
	public void createAppointment(Appointment appointment) {
		appointments.add(appointment);
	}

	public List<Appointment> getAllAppointments() {
		return appointments;
	}

	public Appointment getAppointmentByCustomerName(String customer_name) {
		for (Appointment app : appointments) {
			if(app.getCustomer().getName().equals(customer_name)) {
				return app;
			}
		}
		return new Appointment();
	}
}
