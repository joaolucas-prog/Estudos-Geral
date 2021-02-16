package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;

@Service
public class CustumerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomers(){
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public void save(Customer theCustomer) {
		
		customerDAO.save(theCustomer);
		
	}

	@Override
	@Transactional
	public Customer getCustomer(Integer theId) {
		return customerDAO.getCustomer(theId);
	}

	@Override
	@Transactional
	public void deleteCustomer(Integer theId) {
		customerDAO.deleteCustomer(theId);
	}
	
	
}
