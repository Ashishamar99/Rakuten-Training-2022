package com.example.demo.templates;

import java.math.BigInteger;

public class ContactUs {
	private String name, message, email;
	private BigInteger phone_number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public BigInteger getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(BigInteger phone_number) {
		this.phone_number = phone_number;
	}
	@Override
	public String toString() {
		return String.format("Name = %s, Mail = %s, Phone = %d, \n Message = %s", this.getName(), this.getEmail(), this.getPhone_number(), this.getMessage());
	}
	
}
