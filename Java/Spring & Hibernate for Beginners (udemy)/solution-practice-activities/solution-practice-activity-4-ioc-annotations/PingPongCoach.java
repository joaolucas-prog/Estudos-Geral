package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {

	// define a default constructor
	public PingPongCoach() {
		System.out.println(">> PingPongCoach: inside default constructor");
	}
		
	@Override
	public String getDailyWorkout() {
		return "Practice your pingpong drop shot";
	}

}
