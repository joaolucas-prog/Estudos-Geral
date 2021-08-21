package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FutebolCoach implements Coach {
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	private List<String> list;
	
	private Random myRandom = new Random(); 

	public FutebolCoach() {
		System.out.println(">> FutebolCoach: inside the constructor method");
	}
	
	//@PostConstruct
	public void startUp() {
		System.out.println("postcontruct");
		list = new ArrayList<>();
		try(BufferedReader reader = new BufferedReader(
				new FileReader(
						new File("C:/Users/joao_/Desktop/Estudos/Estudos-Geral/Java/Spring & Hibernate for Beginners (udemy)/spring-demo-annotation/src/fortune.txt")))){
			String textLine;
			while((textLine = reader.readLine())!= null) {
				System.out.println(textLine);
				list.add(textLine);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getDailyWorkout() {
		System.out.println(list.size());
		int index = myRandom.nextInt(list.size());
		return list.get(index);
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
