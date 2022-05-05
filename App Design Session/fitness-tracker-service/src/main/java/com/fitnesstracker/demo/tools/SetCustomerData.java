package com.fitnesstracker.demo.tools;

import java.math.BigInteger;
import java.util.List;

import com.fitnesstracker.demo.entities.Appointment;
import com.fitnesstracker.demo.entities.Customer;
import com.fitnesstracker.demo.repositories.AppointmentRepository;

public class SetCustomerData {
	public static List<Appointment> setCustomerEntityFromData(AppointmentRepository appointmentRepository, List<Appointment> fetchedAppointments){
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
}
