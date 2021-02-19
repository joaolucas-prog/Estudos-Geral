package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	//@Transactional //o hibernate controla as sessoes , não precisa abrir nem fechar a transação 
	//comentei o transactional pois estou delegando-o para o service
	@Override
	public List<Customer> getCustomers() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Customer> query = 
				session.createQuery("from Customer",Customer.class);
		
		List<Customer> customers = query.getResultList();
		
		
		return customers;
	}

	@Override
	public void save(Customer theCustomer) {
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(theCustomer);
		
		
	}

	@Override
	public Customer getCustomer(Integer theId) {
		Session session = sessionFactory.getCurrentSession();
		
		return session.get(Customer.class, theId);
		
	}

	@Override
	public void deleteCustomer(Integer theId) {
		Session session = sessionFactory.getCurrentSession();
		
		//session.delete(session.get(Customer.class, theId));
		Query<Customer> theQuery = 
				session.createQuery("delete from Customer where id=:customerId",Customer.class);
		
		theQuery.setParameter("customerId", theId);
		
		theQuery.executeUpdate();
	}

}
