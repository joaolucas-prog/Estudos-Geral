package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.FooBarDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		AccountDAO theAccount = context.getBean("accountDAO",AccountDAO.class);
		FooBarDAO theAccount2 = context.getBean("fooBarDAO",FooBarDAO.class);
		
		//call the business method
		theAccount.addAccount();
		
		theAccount2.addAccount();
		//close the context
		context.close();
	}

}
