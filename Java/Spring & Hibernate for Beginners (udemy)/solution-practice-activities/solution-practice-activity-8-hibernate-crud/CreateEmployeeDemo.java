package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateEmployeeDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			// create a employee object
			System.out.println("Creating new employee object...");
			Employee tempEmployee = new Employee("Anup", "Joshi", "Acme Inc");
			
			// start a transaction
			session.beginTransaction();
			
			// save the employee object
			System.out.println("Saving the employee...");
			session.save(tempEmployee);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}





