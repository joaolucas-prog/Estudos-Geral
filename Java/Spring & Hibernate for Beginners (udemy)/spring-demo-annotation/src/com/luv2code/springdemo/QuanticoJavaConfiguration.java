package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuanticoJavaConfiguration {
	
	@Bean
	public FortuneService quanticoService() {
		return new QuanticoFortuneService();
	}
	
	@Bean
	public Coach coachQuantico() {
		return new CoachQuantico(quanticoService());
	}
	
}
