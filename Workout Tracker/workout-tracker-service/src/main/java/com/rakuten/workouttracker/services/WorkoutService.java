package com.rakuten.workouttracker.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.rakuten.workouttracker.entities.Workout;
import com.rakuten.workouttracker.exceptions.CategoryNotFoundException;

@Service
public class WorkoutService {
	
	List<Workout> workouts = new ArrayList<>();

	public List<Workout> fetchAllWorkouts() {
		return workouts;
	}

	public void addWorkout(Workout workout) {
		if(CategoryService.categories.size() != 0) {
			CategoryService.categories.forEach(category -> {
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
	
	
}
