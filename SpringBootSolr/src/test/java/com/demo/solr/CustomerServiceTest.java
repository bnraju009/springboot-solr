package com.demo.solr;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demo.solr.SpringBootSolrApplication;
import com.demo.solr.model.Customer;
import com.demo.solr.service.CustomerService;

@Test
@DirtiesContext
@SpringBootTest(classes = SpringBootSolrApplication.class)
public class CustomerServiceTest extends AbstractTestNGSpringContextTests {

	@Autowired
	private CustomerService customerService;
	
	@BeforeClass
	private void set() {
		customerService.deleteAll();
		// Store customers
		customerService.save(Arrays.asList(new Customer("1", "Krathi", 42), 
											new Customer("2", "Nagaraju", 38),
											new Customer("3", "Varun", 27), 
											new Customer("4", "Praveen", 34), 
											new Customer("5", "Anudeep", 34)));
	}
	
	@Test
	public void testfindByNameEndsWith() {
		for (Customer customer : this.customerService.findByNameEndsWith("hi")) {
			System.out.println(customer);
		}
	}
}
