package com.rakuten.workouttracker.entities;

import java.util.EnumMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CategoryWithCalories {
	
	public static Map<CategoryEnum, Double> categoryAndCalories = Stream.of(new Object[][] { 
	     {CategoryEnum.WALKING, 0.37},
	     {CategoryEnum.BADMINTON, 0.44},
	     {CategoryEnum.RUNNING, 0.115},
	     {CategoryEnum.SITTING_STILL, 0.009},
	     {CategoryEnum.SQUATS, 0.96}
	 }).collect(Collectors.toMap(data -> (CategoryEnum) data[0], data -> (Double) data[1]));

}
