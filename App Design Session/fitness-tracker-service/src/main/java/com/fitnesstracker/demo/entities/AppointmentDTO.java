package com.fitnesstracker.demo.entities;

import javax.persistence.Transient;

public class AppointmentDTO {
	
	private Integer id;
	private Customer customer;
	private String customerData;
	private Integer package_details_key;
	private Trainer trainer_preference;
	private Physiotherapist physio_preference;
	private Integer weeks;

}
