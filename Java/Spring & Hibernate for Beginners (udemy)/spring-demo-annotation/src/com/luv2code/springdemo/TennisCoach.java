package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired // inketando diretamente no atributo mesmo sendo privado
	@Qualifier("randomFortuneService") //indica qual implementação do FortuneService utilizar
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println(">> TennisCoach: inside the constructor method");
	}
	 
	@PostConstruct
	public void startUp() {
		System.out.println("startUp method");
	}
	@PreDestroy
	public void cleanUp() {
		System.out.println("cleanUP method");
	}
	/*
	 * constructor injection
	 * 
	 * @Autowired 
	 * public TennisCoach(FortuneService theFortuneService) {
	 * 		fortuneService = theFortuneService; 
	 * }
	 */

	@Override
	public String getDailyWorkout() {
		return "Pratice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	/*
	@Autowired setter injection
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside the setFortuneService method");
		fortuneService = theFortuneService;
	}
	
	@Autowired //injetando em qualquer método
	public void methodName(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside the methodName method");
		
	}
	*/
	
}
