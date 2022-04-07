package com.rakuten;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Import entity from javax.persistence.
@Table(name = "users") // Since "User" is a reserved keyword in sql db, we are setting the table name to "users"
public class User {
	
	@Id // Import from javax.persistence
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id; //Best practice for id is using a wrapper class so that hibernate can handle all types of data.
	
	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
