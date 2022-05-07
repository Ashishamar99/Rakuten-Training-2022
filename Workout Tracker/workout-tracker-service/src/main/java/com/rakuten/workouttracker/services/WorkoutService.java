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
import com.rakuten.workouttracker.repositories.WorkoutRepository;
import com.rakuten.workouttracker.userdefined.exceptions.CategoryNotFoundException;
import com.rakuten.workouttracker.userdefined.tools.PersistenceUtils;

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

	public void updateWorkoutFromId(Integer id, Workout updatedWorkout) {
		// Tried a bit with partial updation of workout JSON. --> https://github.com/Ashishamar99/Rakuten-Training-2022/blob/1b29b7d06c7c3192bafc3fd955251d69e5344bf1/App%20Design%20Session/fitness-tracker-service/src/main/java/com/fitnesstracker/demo/service/AppointmentService.java#L59-L73
		Optional<Workout> currentWorkout = workoutRepository.findById(id);
		updatedWorkout = (Workout) PersistenceUtils.partialUpdate(currentWorkout.get(), updatedWorkout);
		workoutRepository.save(updatedWorkout);
		
	}
	
	
}
