package com.rakuten.workouttracker.entities;

public class Workout {
	private String note, title;
	private Double calories_burnt;
	
	//For now let's use category as an enum. (We can then use an enummap)
	// Link --> https://www.baeldung.com/java-enum-map
	
	private Category category;
	
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
		return CategoryWithCalories.categoryAndCalories.get(getCategory());
	}
	public void setCalories_burnt(Double calories_burnt) {
		this.calories_burnt = calories_burnt;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
