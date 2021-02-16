package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {
	public static void main(String[] args) {
		// create session factory
				SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Student.class)
										.buildSessionFactory();

				// create session
				Session session = factory.getCurrentSession();

				try {
					session.beginTransaction();
					
					List<Student> studentList = session.createQuery("from Student",Student.class).getResultList();
					
					displayStudents(studentList);
					
					studentList = session.createQuery("from Student s where s.lastName='Lucas'",Student.class).getResultList();
					
					System.out.println("Students who have last name of Lucas");
					displayStudents(studentList);
					studentList = session.createQuery("from Student s where s.lastName='Lucas' OR firstName='Ingrid'",Student.class).getResultList();
					
					System.out.println("Students who have last name of Lucas or firs name of Ingrid");
					displayStudents(studentList);
					studentList = session
							.createQuery("from Student s where s.email LIKE '%@email'",Student.class)
							.getResultList();
					
					System.out.println("Students who email ends of @email");
					displayStudents(studentList);
					
					session.getTransaction().commit();
					

					session.close();
				} finally {
					factory.close();
				}
	}

	private static void displayStudents(List<Student> studentList) {
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
}
