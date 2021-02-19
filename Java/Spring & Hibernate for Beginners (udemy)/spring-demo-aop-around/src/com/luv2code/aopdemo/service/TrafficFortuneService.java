package com.luv2code.aopdemo.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TrafficFortuneService {
	
	public String getFortune(boolean b) {	
		if(b) {
			throw new RuntimeException("Travou foi tudo amigão");
		}
		
		try {
			TimeUnit.SECONDS.sleep(5);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return "Expect heavy traffic this morning";
	}
}
