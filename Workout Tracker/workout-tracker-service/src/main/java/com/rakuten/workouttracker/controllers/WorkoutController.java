package com.rakuten.workouttracker.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.workouttracker.entities.Workout;

@RestController
@RequestMapping("/workout")
public class WorkoutController {
	
	List<Workout> workouts = new ArrayList<>();
	
	@PostMapping
	List<Workout> saveWorkout(@RequestBody Workout workout) {
		workouts.add(workout);
		return workouts;
	}
}
