package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class AfterThrowingDemoApp {

	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		AccountDAO theAccount = context.getBean("accountDAO",AccountDAO.class);
		
		List<Account> theAccounts = null;
		try {
			theAccounts = theAccount.findAccount(false);
		}catch(Exception e) {
			System.out.println("Main program ... caught a exception: " + e);
		}
		System.out.println("\n\nMain Program: AfterReturningDemoApp");
		System.out.println(theAccounts);
		System.out.println("\n");
		
		//close the context
		context.close();
	}

}
