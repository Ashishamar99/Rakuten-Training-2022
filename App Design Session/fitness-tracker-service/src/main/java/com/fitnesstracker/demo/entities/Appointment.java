package com.fitnesstracker.demo.entities;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "appointments")
public class Appointment{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Transient
	private Customer customer; 
	//using this annotation "transient" to ignore this member while creating the db.
	//https://www.baeldung.com/jpa-transient-ignore-field
	
	private String customerData;
	
	private Integer package_details_key;
	
	@Enumerated(EnumType.STRING)
	private Trainer trainer_preference;
	
	@Enumerated(EnumType.STRING)
	private Physiotherapist physio_preference;
	
	private Integer weeks;
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Integer getPackage_details_key() {
		return package_details_key;
	}
	public void setPackage_details_key(Integer package_details_key) {
		this.package_details_key = package_details_key;
	}
	public Trainer getTrainer_preference() {
		return trainer_preference;
	}
	public void setTrainer_preference(Trainer trainer_preference) {
		this.trainer_preference = trainer_preference;
	}
	public Physiotherapist getPhysio_preference() {
		return physio_preference;
	}
	public void setPhysio_preference(Physiotherapist physio_preference) {
		this.physio_preference = physio_preference;
	}
	public Integer getWeeks() {
		return weeks;
	}
	public void setWeeks(Integer weeks) {
		this.weeks = weeks;
	}
	public String getpackageDetails() {
		return packageDetails.package_details.get(this.getPackage_details_key());
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCustomerData() {
		return customerData;
	}
	public void setCustomerData(String customerData) {
		this.customerData = customerData;
	}
	@Override
	public String toString() {
		return String.format("Customer Details = \n %s \n Trainer Preference = %s \n Physio Preference = %s, \n Package Details = %s \n Duration in weeks = %d", this.getCustomer(), this.getTrainer_preference(), this.getPhysio_preference(), this.getpackageDetails(), this.getWeeks());
	}
	
}
