package com.rakuten.workouttracker.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.workouttracker.entities.Category;
import com.rakuten.workouttracker.entities.Workout;
import com.rakuten.workouttracker.exceptions.CategoryNotFoundException;

@RestController
@RequestMapping("/workout")
public class WorkoutController {
	
	List<Workout> workouts = new ArrayList<>();
	
	@GetMapping
	List<Workout> getAllWorkouts(){
		return workouts;
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	void saveWorkout(@RequestBody Workout workout) {
		if(CategoryController.categories.size() != 0) {
			CategoryController.categories.forEach(category -> {
				if(category.getName().equals(workout.getCategory())) {
					workouts.add(workout);
				}
				else {
					 throw new CategoryNotFoundException();
				}
			});
		}
		else {
			throw new CategoryNotFoundException();
		}
	}
	
	@ExceptionHandler(CategoryNotFoundException.class)
	@ResponseStatus(code = HttpStatus.NOT_ACCEPTABLE)
	public String handleCategoryNotFoundException(CategoryNotFoundException exception) {
		/*
		 * Links used -->
		 * https://spring.io/blog/2013/11/01/exception-handling-in-spring-mvc
		 * https://stackoverflow.com/questions/24292373/spring-boot-rest-controller-how-to-return-different-http-status-codes
		 * https://www.baeldung.com/exception-handling-for-rest-with-spring
		 */
		return exception.toString();
	}
}
