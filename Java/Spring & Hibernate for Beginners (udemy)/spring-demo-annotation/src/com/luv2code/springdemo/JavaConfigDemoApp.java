package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfiguration.class);
		
		//retrieve bean from spring config
		Coach theCoach =  context.getBean("tennisCoach",Coach.class);
				
		//call bean methods
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//close context
		context.close();
	}

}
