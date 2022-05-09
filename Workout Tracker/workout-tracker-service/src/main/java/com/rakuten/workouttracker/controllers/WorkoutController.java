package com.rakuten.workouttracker.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.workouttracker.entities.Workout;
import com.rakuten.workouttracker.services.WorkoutService;
import com.rakuten.workouttracker.userdefined.exceptions.CategoryNotFoundException;
import com.rakuten.workouttracker.userdefined.exceptions.WorkoutNotFoundException;

@RestController
@RequestMapping("/workout")
public class WorkoutController {
	
	@Autowired
	WorkoutService workoutService;
	
	@GetMapping
	List<Workout> getAllWorkouts(){
		return workoutService.fetchAllWorkouts();
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	void saveWorkout(@RequestBody Workout workout) {
		workoutService.addWorkout(workout);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	void updateWorkoutById(@PathVariable Integer id, @RequestBody Workout workout) {
		workoutService.updateWorkoutFromId(id, workout);
	}
	
	@GetMapping("/{id}")
	Optional<Workout> getWorkoutById(@PathVariable Integer id) {
		return workoutService.fetchWorkoutById(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	void removeWorkoutById(@PathVariable Integer id) {
		workoutService.deleteWorkoutById(id);
	}
	
	@GetMapping("/search")
	List<Workout> getAllWorkoutsOfSameCategory(@RequestParam String category){
		return workoutService.fetchAllWorkoutsOfSameCategory(category);
	}
	
	@GetMapping("/start/{id}")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	void startWorkout(@PathVariable Integer id) {
		workoutService.startWorkoutFromId(id);
	}
	
	@GetMapping("/end/{id}")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	void endWorkout(@PathVariable Integer id) {
		workoutService.endWorkoutFromId(id);
	}
	@ExceptionHandler(EmptyResultDataAccessException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	void handleDeleteInvalidWorkout() { }
	
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
	
	@ExceptionHandler(WorkoutNotFoundException.class)
	@ResponseStatus(code = HttpStatus.NOT_ACCEPTABLE)
	public String handleWorkoutNotFoundException(WorkoutNotFoundException exception) {
		return exception.toString();
	}
}
