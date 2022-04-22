package com.example.demo.templates;

import java.util.HashMap;

public class Appointment {
	private Customer customer;
	private Integer package_details_key;
	private Trainer trainer_preference;
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
	@Override
	public String toString() {
		return String.format("Customer Details = \n %s \n Trainer Preference = %s \n Physio Preference = %s, Package Details = %s \n Duration in weeks = %d", this.getCustomer(), this.getTrainer_preference(), this.getPhysio_preference(), this.getpackageDetails(), this.getWeeks());
	}
	
}
