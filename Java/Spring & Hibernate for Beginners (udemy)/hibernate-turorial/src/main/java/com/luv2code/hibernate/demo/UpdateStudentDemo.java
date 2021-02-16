package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {
			int studentId = 1;
			session.beginTransaction();
			
			Student tempStudent = session.get(Student.class, studentId);
			
			tempStudent.setFirstName("OX");
			
			session.getTransaction().commit();
			
			session = factory.getCurrentSession();
			
			session.beginTransaction();
			
			session.createQuery("update Student set email ='foo@gmail.com'").executeUpdate();
			session.getTransaction().commit();
			
			session.close();
			
			
		} finally {
			factory.close();
		}

	}

}
