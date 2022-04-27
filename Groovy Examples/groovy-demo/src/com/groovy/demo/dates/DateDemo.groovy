package com.groovy.demo.dates

class DateDemo {
	static void main(String[] args) {
		
		Date date = new Date();
		Date olddate = new Date("05/11/2015");
		Date anotherdate = new Date("05/11/2015")
		
		// display time and date using toString()
		println(date.toString());
		
		//get time in milliseconds
		println(date.getTime())
		println(olddate.getTime())
		
		//calendar date
		println(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds())
		println(olddate.getHours()+":"+olddate.getMinutes()+":"+olddate.getSeconds())
		
		//before
		println(olddate.before(date))
		
		//compareTo
		println(olddate.compareTo(anotherdate) + "      date comparision, old is equal to anotherdate")
		println(olddate.compareTo(date) + "      date comparision, old is less than today, so negative")
		println(date.compareTo(olddate) + "      date comparision, today is greater than old, so positive")
	}
}
