package com.demo.solr.repo;

import java.util.List;

import org.springframework.data.solr.repository.SolrCrudRepository;

import com.demo.solr.model.Customer;

public interface CustomerRepository extends SolrCrudRepository<Customer, String> {
	
	List<Customer> findByNameEndsWith(String name);

//	List<Customer> findByNameSratsWith(String name);
	
//	List<Customer> findByAgeSratsWith(Integer age);
}
