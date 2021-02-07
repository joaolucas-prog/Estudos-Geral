package com.luv2code.springdemo;

public class FutebolCoach implements Coach {

	private FortuneService fortuneService;

	public FutebolCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService; 
	}

	@Override
	public String getDailyWorkout() {
		return "spend 30 minutes into pass ball practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
