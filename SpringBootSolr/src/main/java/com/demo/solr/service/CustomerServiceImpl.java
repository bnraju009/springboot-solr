package com.demo.solr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.solr.model.Customer;
import com.demo.solr.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> findByNameEndsWith(String name) {
		return customerRepository.findByNameEndsWith(name);
	}

	@Override
	public <S> void save(Customer customer) {
		customerRepository.save(customer);
	}

	@Override
	public <S> void save(List<Customer> entities) {
		customerRepository.save(entities);
	}

	@Override
	public void deleteAll() {
		customerRepository.deleteAll();
	}

	/*@Override
	public List<Customer> findByNameSratsWith(String name) {
		return customerRepository.findByNameSratsWith(name);
	}
	*/
	
	/*@Override
	public List<Customer> findByAgeSratsWith(Integer age) {
		return customerRepository.findByAgeSratsWith(age);
	}*/

	@Override
	public Iterable<Customer> findAll() {
		return customerRepository.findAll();
	}

}
