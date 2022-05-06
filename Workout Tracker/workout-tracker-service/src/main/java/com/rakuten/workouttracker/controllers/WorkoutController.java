package com.rakuten.workouttracker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workout")
public class WorkoutController {
	
	@GetMapping
	String demoGet() {
		return "display all workouts.";
	}
}
