package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanConfigDemoApp {

	public static void main(String[] args) {
		//read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfiguration.class);
		
		//retrieve bean from spring config
		SwinCoach theCoach =  context.getBean("swinCoach",SwinCoach.class);
				
		//call bean methods
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		
		//close context
		context.close();
	}

}
