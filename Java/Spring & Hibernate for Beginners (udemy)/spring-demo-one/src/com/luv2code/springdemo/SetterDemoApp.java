package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	public static void main(String[] args) {
		
		////load the spring configuration file
		ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive bran from spring container
		CricketCoach coach = context.getBean("myCricketCoach",CricketCoach.class);
		
		//no caso do setter injection ele precisa do construtor sem argumentos e do metodo setter para injetar o objeto
		
		//call bean methods
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		
		System.out.println(coach.getEmail());
		
		System.out.println(coach.getTeam());
		
		System.out.println(coach.getFileEmail());
		
		System.out.println(coach.getFileTeam());
		
		//close context
		context.close();
	}
}
