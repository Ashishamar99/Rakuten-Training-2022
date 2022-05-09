package com.rakuten.workouttracker.userdefined.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_ACCEPTABLE, reason = "Workout not found.")
public class WorkoutNotFoundException extends RuntimeException{

	@Override
	public String toString() {
		return "Workout not found, kindly check if workout exists and try again.";
	}

}
