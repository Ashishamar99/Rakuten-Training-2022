package com.rakuten.workouttracker.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakuten.workouttracker.entities.Workout;

public interface WorkoutRepository extends JpaRepository<Workout, Integer>{

	List<Workout> findAllBycategory(String category);

}
