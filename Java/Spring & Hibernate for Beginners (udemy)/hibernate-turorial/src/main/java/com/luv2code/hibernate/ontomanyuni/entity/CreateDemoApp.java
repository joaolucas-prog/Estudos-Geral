package com.luv2code.hibernate.ontomanyuni.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.ontomany.entity.Course;
import com.luv2code.hibernate.ontoone.entity.Instructor;
import com.luv2code.hibernate.ontoone.entity.InstructorDetail;

public class CreateDemoApp {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();

			Course lol =  new Course("League of Legends course");

			Review rev = new Review("Que cara bom");
			Review rev2 = new Review("Na Curso");
			Review rev3 = new Review("Dale dele dele doly");
			
			lol.addReview(rev);
			lol.addReview(rev2);
			lol.addReview(rev3);

			session.save(lol);
			
			
			session.getTransaction().commit();

		} finally {
			session.close();
			factory.close();
		}
	}
}
