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

	//TODO: FIX THIS!!!!
	public Appointment getAppointmentByCustomerName(String customer_name) {
		for (Appointment appointment : appointments) {
			if(appointment.getCustomer().getName().equals(customer_name)) {
				return appointment;
			}
		}
		return new Appointment();
	}
}
