package com.fitnesstracker.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fitnesstracker.demo.entities.Appointment;
import com.fitnesstracker.demo.service.AppointmentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/v1.0/fitnesstracker/appointments")
public class AppointmentController {
	
	@Autowired
	AppointmentService appointment_service;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	void makeAppointment(@RequestBody Appointment appointment) {
		appointment_service.createAppointment(appointment);
	}
	
	@GetMapping
	List<Appointment> fetchAllAppointments(){
		return appointment_service.getAllAppointments();
	}
	
	//Additional end point, can use it too.
	@GetMapping("/view/{name}")
	List<Appointment> fetchAppointmentByName(@PathVariable String name) {
		return appointment_service.getAppointmentByCustomerName(name);
	}
	
	@GetMapping("/{email}")
	List<Appointment> fetchAppointmentByEmail(@PathVariable String email) {
		return appointment_service.getAppointmentByCustomerEmail(email);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	void deleteAppointmentById(@PathVariable Integer id) {
		appointment_service.deleteAppointmentById(id);
	}
	
	@ExceptionHandler(EmptyResultDataAccessException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public void handleEmptyResultDataAccessException() {
		
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	void updateAppointmentById(@PathVariable Integer id, @RequestBody Appointment appointment) {
		appointment_service.updateAppointmentById(appointment, id);
	}
}
