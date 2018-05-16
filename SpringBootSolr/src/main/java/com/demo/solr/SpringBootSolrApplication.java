package com.demo.solr;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringBootSolrApplication implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		System.out.println("We can add load on startup stuff here!!!");
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootSolrApplication.class, args);
	}
}