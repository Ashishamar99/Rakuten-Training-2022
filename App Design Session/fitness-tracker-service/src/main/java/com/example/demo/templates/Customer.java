package com.example.demo.templates;

import java.math.BigInteger;

public class Customer {
	private String name, address, email;
	private BigInteger mobile;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public BigInteger getMobile() {
		return mobile;
	}
	public void setMobile(BigInteger mobile) {
		this.mobile = mobile;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return String.format("Name = %s \n Age = %d \n Mobile = %s \n Email = %s \n Address = %s \n", this.getName(), this.getAge(), this.getMobile(), this.getEmail(), this.getAddress());
	}
	
}
