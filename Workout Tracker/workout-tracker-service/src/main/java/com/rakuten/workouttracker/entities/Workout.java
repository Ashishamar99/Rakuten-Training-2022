package com.rakuten.workouttracker.entities;

public class Workout {
	private String note, title, category;
	private Double calories_burnt;
	// Calories to category --> https://whatscookingamerica.net/information/calorieburnchart.htm
	// Check this link for the hashmap of enum values and calories burnt per minute. --> https://github.com/Ashishamar99/Rakuten-Training-2022/commit/15b6cb782330305822806dbf99c0be066cbc6335
	
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getCalories_burnt() {
		return calories_burnt;
	}
	public void setCalories_burnt(Double calories_burnt) {
		this.calories_burnt = calories_burnt;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
