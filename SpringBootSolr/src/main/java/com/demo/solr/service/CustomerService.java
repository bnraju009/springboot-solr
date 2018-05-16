package com.demo.solr.service;

import java.util.List;

import com.demo.solr.model.Customer;

public interface CustomerService {
	
	List<Customer> findByNameEndsWith(String name);

	public <S> void save(List<Customer> entities);
	
	public <S> void save(Customer customer);

	public void deleteAll();

//	List<Customer> findByNameSratsWith(String name);
	
	//List<Customer> findByAgeSratsWith(Integer age);
	
	public Iterable<Customer> findAll();
}
