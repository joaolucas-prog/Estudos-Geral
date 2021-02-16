package com.luv2code.hibernate.ontomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.ontomany.entity.Course;
import com.luv2code.hibernate.ontoone.entity.Instructor;
import com.luv2code.hibernate.ontoone.entity.InstructorDetail;

public class DeleteCoursesDemoApp {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();

			int id = 1;

			Course tempCourse = session.get(Course.class, id);

			session.delete(tempCourse);
			
			session.getTransaction().commit();

		} finally {
			session.close();
			factory.close();
		}
	}
}
