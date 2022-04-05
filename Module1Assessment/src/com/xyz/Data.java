package com.xyz;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import reference.templates.STATUS;
import reference.templates.TYPE;


public class Data {
	
	public static Random random = new Random();
	
	// This method shuffles a list of names and returns the item at a random index
	public static String generateName() {
		String[] names = {"Chandler", "Joey", "Ross", "Jim", "Dwight", "Micheal"};
		List<String> listOfNames = Arrays.asList(names); // Converting an array to a list - https://stackoverflow.com/questions/10530353/convert-string-array-to-arraylist
		Collections.shuffle(listOfNames);
		return listOfNames.get((int) (Math.random() * names.length));
	}
	
	public static HashMap<String, String> generateAddress(){
		
		HashMap<String, String> address = new HashMap<>();
		
		int someNumber = random.nextInt(10, 20);
		
		String houseno = String.valueOf(random.nextInt(30));
		String street = String.format("%sth Main, %sth Cross", someNumber, someNumber);
		String phno = String.valueOf(random.nextLong(888888888, 999999999)) + String.valueOf(random.nextInt(1, 9));
		
		address.put("House Number", houseno);
		address.put("Street", street);
		address.put("City", "Bengaluru");
		address.put("Pincode", "5600" + String.valueOf(someNumber));
		address.put("State", "Karnataka");
		address.put("Phone Number", phno);
		
		return address;
	}
	
	
	public static long generateBalance() {
		return random.nextLong(500, 1000);
	}
	
	// Generates today's date from the number of milliseconds and generates a date using the sql.Date method.
	public static String getDate() {
		long milliseconds=System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(milliseconds);
		String dateString = String.valueOf(date);
		return dateString;
	}
	
	public static STATUS generateAccountStatus() {
		int pick = new Random().nextInt(STATUS.values().length);
		return STATUS.values()[pick];
	}

	public static TYPE generateAccountType() {
		/*
		 * https://howtodoinjava.com/java/enum/enum-tutorial/
		 * https://www.geeksforgeeks.org/enum-in-java/
		 * https://stackoverflow.com/questions/1972392/pick-a-random-value-from-an-enum
		 */
		int pick = new Random().nextInt(TYPE.values().length);
		return TYPE.values()[pick];
	}
	
}
