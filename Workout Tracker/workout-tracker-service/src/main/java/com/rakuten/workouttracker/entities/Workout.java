package com.rakuten.workouttracker.entities;

import java.time.LocalDate;
import java.time.LocalTime;

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
	private LocalDate start_date, end_date;
	private LocalTime start_time, end_time;
	private Boolean inProgress = false;
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
	public LocalDate getStart_date() {
		return start_date;
	}
	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}
	public LocalDate getEnd_date() {
		return end_date;
	}
	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	}
	public LocalTime getStart_time() {
		return start_time;
	}
	public void setStart_time(LocalTime start_time) {
		this.start_time = start_time;
	}
	public LocalTime getEnd_time() {
		return end_time;
	}
	public void setEnd_time(LocalTime end_time) {
		this.end_time = end_time;
	}
	public Boolean getInProgress() {
		return inProgress;
	}
	public void setInProgress(Boolean inProgress) {
		this.inProgress = inProgress;
	}
	
}
