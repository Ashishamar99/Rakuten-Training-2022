package com.rakuten.workouttracker.entities;

import java.util.EnumMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CategoryWithCalories {
	
	public static Map<Category, Double> categoryAndCalories = Stream.of(new Object[][] { 
	     {Category.WALKING, 0.37}, 
	     {Category.BADMINTON, 0.44},
	     {Category.RUNNING, 0.115},
	     {Category.SITTING_STILL, 0.009},
	     {Category.SQUATS, 0.96}
	 }).collect(Collectors.toMap(data -> (Category) data[0], data -> (Double) data[1]));

}
