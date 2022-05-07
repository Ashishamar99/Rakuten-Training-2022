package com.rakuten.workouttracker.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "workouts")
public class Workout {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	
	private String note, title, category;
	private Double calories_burnt;
	// Calories to category --> https://whatscookingamerica.net/information/calorieburnchart.htm
	// Check this link for the hashmap of enum values and calories burnt per minute. --> https://github.com/Ashishamar99/Rakuten-Training-2022/commit/15b6cb782330305822806dbf99c0be066cbc6335
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getCalories_burnt() {
		return calories_burnt;
	}
	public void setCalories_burnt(Double calories_burnt) {
		this.calories_burnt = calories_burnt;
	}
	
}
