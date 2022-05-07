package com.rakuten.workouttracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakuten.workouttracker.entities.Workout;

public interface WorkoutRepository extends JpaRepository<Workout, Integer>{

}
