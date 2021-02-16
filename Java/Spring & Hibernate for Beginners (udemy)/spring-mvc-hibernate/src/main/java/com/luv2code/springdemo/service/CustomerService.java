package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void save(Customer theCustomer);

	public Customer getCustomer(Integer theId);

	public void deleteCustomer(Integer theId);
}
