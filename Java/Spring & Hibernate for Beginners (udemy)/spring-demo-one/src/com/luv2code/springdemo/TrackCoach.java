package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public TrackCoach() {
	}
	public TrackCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService; 
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void doStartUpStuff() {
		System.out.println("TrackCoach: inside the method - doStartUpStuff");
	}
	public void doCleanUpStuff() {
		System.out.println("TrackCoach: inside the method - doCleanUpStuff");
		
	}
}
