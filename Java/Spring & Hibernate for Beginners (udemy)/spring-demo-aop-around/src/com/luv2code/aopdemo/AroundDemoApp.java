package com.luv2code.aopdemo;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.service.TrafficFortuneService;

public class AroundDemoApp {
	
	private static Logger myLogger =
			Logger.getLogger(AroundDemoApp.class.getName());

	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		TrafficFortuneService theFortuneService = context.getBean("trafficFortuneService",TrafficFortuneService.class);
		
		
		myLogger.info("main program: AroundDemoApp");
		
		myLogger.info("Calling getFortune()");
		
		String data = theFortuneService.getFortune(true);
		
		myLogger.info("My fortune is: "+ data);
		
		myLogger.info("Finished");
		
		
		//close context
		context.close();
	}

}
