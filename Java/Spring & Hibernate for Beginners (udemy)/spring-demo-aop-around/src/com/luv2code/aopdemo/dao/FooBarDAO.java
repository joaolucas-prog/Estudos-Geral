package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class FooBarDAO {
	
	public void addAccount() {
		System.out.println("Apenas testando AOP");
	}
	
	public void goToSleep() {
		System.out.println("Bye bye I will go to the bed");
	}
}
