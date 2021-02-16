package com.luv2code.hibernate.manytomany.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;
import com.luv2code.hibernate.ontomany.entity.Course;
import com.luv2code.hibernate.ontomanyuni.entity.Review;
import com.luv2code.hibernate.ontoone.entity.Instructor;
import com.luv2code.hibernate.ontoone.entity.InstructorDetail;

public class CreateCourseAndStudentsDemo {	
	
	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Review.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();
			
		
			Student tempStudent2 = session.get(Student.class, 9);
			
			
			session.delete(tempStudent2);
			
		
			session.getTransaction().commit();

		} finally {
			session.close();
			factory.close();
		}
	}

}
