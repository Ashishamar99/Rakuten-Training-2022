package com.example.demo;

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
	
}
