package com.fitnesstracker.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fitnesstracker.demo.entities.Appointment;
import com.fitnesstracker.demo.service.AppointmentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	
	@Autowired
	AppointmentService appointment_service;
	
	@PostMapping("/create")
	@ResponseStatus(code = HttpStatus.CREATED)
	void makeAppointment(@RequestBody Appointment appointment) {
		appointment_service.createAppointment(appointment);
	}
	
	@GetMapping("/view")
	List<Appointment> fetchAllAppointments(){
		return appointment_service.getAllAppointments();
	}
	
	@GetMapping("/view/name/{name}")
	List<Appointment> fetchAppointmentByName(@PathVariable String name) {
		return appointment_service.getAppointmentByCustomerName(name);
	}
	
	@GetMapping("/view/email/{email}")
	List<Appointment> fetchAppointmentByEmail(@PathVariable String email) {
		return appointment_service.getAppointmentByCustomerEmail(email);
	}
}
