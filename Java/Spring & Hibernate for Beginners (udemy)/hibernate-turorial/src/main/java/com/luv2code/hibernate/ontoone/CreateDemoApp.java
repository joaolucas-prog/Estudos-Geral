package com.luv2code.hibernate.ontoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.ontoone.entity.Instructor;
import com.luv2code.hibernate.ontoone.entity.InstructorDetail;

public class CreateDemoApp {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
	
	
		Session session = factory.getCurrentSession();
		
	
		try {
			
			Instructor theInstructor = new Instructor("Joao","Lucas","joao@lucas");
			
			InstructorDetail theInstructorDetail = new InstructorDetail("yt.com","hobby");
			
			theInstructor.setInstructorDetail(theInstructorDetail);
			
			session.beginTransaction();
			
			session.save(theInstructor);
			
			session.getTransaction().commit();
			
		}finally{
			factory.close();
		}
	
	
	}

}
