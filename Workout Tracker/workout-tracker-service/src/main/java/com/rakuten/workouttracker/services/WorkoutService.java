package com.rakuten.workouttracker.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rakuten.workouttracker.entities.Category;
import com.rakuten.workouttracker.entities.Workout;
import com.rakuten.workouttracker.exceptions.CategoryNotFoundException;
import com.rakuten.workouttracker.repositories.WorkoutRepository;

@Service
public class WorkoutService {
	
	@Autowired
	WorkoutRepository workoutRepository;
	
	@Autowired
	RestTemplate restTemplate;

	public List<Workout> fetchAllWorkouts() {
		return workoutRepository.findAll();
	}

	public void addWorkout(Workout workout) {
		//Fetching category names from category end point, solved using this link --> https://www.baeldung.com/spring-rest-template-list
		ResponseEntity<Category[]> response = restTemplate.getForEntity("http://localhost:8080/category", Category[].class);
		Category[] categoriesList = response.getBody();
		Boolean categoryFound = false;
		
		if(categoriesList.length != 0) {
			for(int i=0; i< categoriesList.length; i++) {
				if(categoriesList[i].getName().equals(workout.getCategory())) {
					workoutRepository.save(workout);
					categoryFound = true;
					break;
				}
			}
			if(!categoryFound) {
				throw new CategoryNotFoundException();
			}
		}
		else {
			throw new CategoryNotFoundException();
		}
	}

	public Optional<Workout> fetchWorkoutById(Integer id) {
		return workoutRepository.findById(id);
	}

	public void deleteWorkoutById(Integer id) {
		workoutRepository.deleteById(id);
	}

	public void updateWorkoutFromId(Integer id, Workout workout) {
		workout.setId(id);
		workoutRepository.save(workout);
		
	}
	
	
}
