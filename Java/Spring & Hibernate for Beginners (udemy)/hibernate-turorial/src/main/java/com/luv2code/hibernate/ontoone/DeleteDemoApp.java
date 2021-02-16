package com.luv2code.hibernate.ontoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.ontoone.entity.Instructor;
import com.luv2code.hibernate.ontoone.entity.InstructorDetail;

public class DeleteDemoApp {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
	
	
		Session session = factory.getCurrentSession();
		
	
		try {
			
			session.beginTransaction();
			
			int id = 1;
			
			Instructor instructor = session.get(Instructor.class, id);
			
			
			
			if( instructor != null) {
				//perceba que tb deleta o objeto associado pois o tipo da cascade é ALL
				session.delete(instructor);
			}else {
				System.out.println("instrutor == null");
			}
			session.getTransaction().commit();
			
		}finally{
			factory.close();
		}
	
	
	}

}
