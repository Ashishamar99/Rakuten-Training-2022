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
//Both tables were sharing the id generation numbers, solved using this link. --> https://stackoverflow.com/questions/6878093/issue-with-sequence-why-two-entity-are-sharing-the-same-sequence-when-generating
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
