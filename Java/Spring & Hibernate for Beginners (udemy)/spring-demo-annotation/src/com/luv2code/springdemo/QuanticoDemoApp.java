package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class QuanticoDemoApp {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(QuanticoJavaConfiguration.class);

		Coach quantico = context.getBean("coachQuantico",Coach.class);
		
		System.out.println(quantico.getDailyFortune());
		System.out.println(quantico.getDailyWorkout());
		
		context.close();
	}
	
	
	
}
