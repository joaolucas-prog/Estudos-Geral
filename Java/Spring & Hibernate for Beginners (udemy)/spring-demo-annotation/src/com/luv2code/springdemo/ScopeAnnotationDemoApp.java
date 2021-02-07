package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeAnnotationDemoApp {

	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring config
		Coach theCoach =  context.getBean("tennisCoach",Coach.class);
		Coach theCoach2 =  context.getBean("tennisCoach",Coach.class);
				
		//call bean methods
		System.out.println(theCoach);
		
		System.out.println(theCoach2);
		
		//close context
		context.close();
	}

}
