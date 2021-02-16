package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {
			Student theStudent = new Student("Joao","Lucas","email@email");
			session.beginTransaction();
			session.save(theStudent);
			session.getTransaction().commit();
			
			System.out.println(theStudent.getId());
			
			session = factory.getCurrentSession();
			
			session.beginTransaction();
			Student student2 = session.get(Student.class, theStudent.getId());
			
			System.out.println(student2);
			
			session.getTransaction().commit();
			

			session.close();
		} finally {
			factory.close();
		}
	}
}
