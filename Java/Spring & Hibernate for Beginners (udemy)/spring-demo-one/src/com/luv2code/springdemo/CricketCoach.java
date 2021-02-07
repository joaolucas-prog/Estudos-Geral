package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	private String email;
	private String team;
	private String fileEmail;
	private String fileTeam;

	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Pratice fast blowing for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("CricketCoach: inside setter method - setEmail");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}

	public String getFileEmail() {
		return fileEmail;
	}

	public void setFileEmail(String fileEmail) {
		this.fileEmail = fileEmail;
	}

	public String getFileTeam() {
		return fileTeam;
	}

	public void setFileTeam(String fileTeam) {
		this.fileTeam = fileTeam;
	}

}
