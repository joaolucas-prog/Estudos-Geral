package com.luv2code.springdemo;

public class CoachQuantico implements Coach {

	private FortuneService fortuneService;
	
	public CoachQuantico(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Você vai ganhar 1 milhão de reais confia, fontes Arial";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
