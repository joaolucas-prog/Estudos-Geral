package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring configuration file| carregando o arquivo de configuração spring
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		//retrieve bean from spring container | recuperando o bran do spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		//call methods on the beans | chamando os medodos do bean
		System.out.println(theCoach.getDailyWorkout());
		
		//let's call your new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		//close the context | fechando o contexto
		context.close();

	}

}
