package com.fitnesstracker.demo.entities;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class packageDetails {
	public static Map<Integer, String> package_details = Stream.of(new Object[][] { 
	     { 1, "One time appointment (500/-)" }, 
	     { 2, "4 sessions per week (400/- Each)" },
	     {3, "5 sessions per week (300/- Each)"}
	 }).collect(Collectors.toMap(data -> (Integer) data[0], data -> (String) data[1]));
}
