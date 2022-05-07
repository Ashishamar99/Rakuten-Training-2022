package com.rakuten.workouttracker.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_ACCEPTABLE, reason = "Category not found.")
public class CategoryNotFoundException extends RuntimeException{

	@Override
	public String toString() {
		return "Category not found, add the category and try adding the workout.";
	}

}
