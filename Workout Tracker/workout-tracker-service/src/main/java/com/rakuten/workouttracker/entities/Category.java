package com.rakuten.workouttracker.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
@SequenceGenerator(name="PRIVATE_SEQ", sequenceName="private_sequence")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "PRIVATE_SEQ")
	private Integer Id;
	
	private String name;

	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
