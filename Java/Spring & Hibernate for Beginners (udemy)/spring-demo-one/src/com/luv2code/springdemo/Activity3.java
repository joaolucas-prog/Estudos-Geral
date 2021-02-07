package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Activity3 {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		Coach theCoach = context.getBean("myFutebolCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myFutebolCoach",Coach.class);
		
		//por padrão o scopo do bean é sigleton , ou seja, para cada objeto criado ele guardará a refêrencia para o mesmo objeto, ou seja,
		//o mesmo objeto já no escopo prototype para cada objeto uma nova referência é criada , ou seja  , um novo objeto
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("são iguais: "+ result );
		System.out.println("Local da memória do theCoach: "+ theCoach );
		System.out.println("Local da memória do alphaCoach: "+ alphaCoach );
		
		context.close();
	}

}
