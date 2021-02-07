package com.luv2code.springdemo;

public class MyApp {
	public static void main(String[] args) {
		
		//create a new Object
		Coach theCoach = new TrackCoach();
		// using the object created
		System.out.println(theCoach.getDailyWorkout());
	}
}
