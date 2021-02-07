package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwinCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("foo.email")
	private String email;
	@Value("foo.team")
	private String team;
	
	public SwinCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swin 1000 meters as a warm up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

}
