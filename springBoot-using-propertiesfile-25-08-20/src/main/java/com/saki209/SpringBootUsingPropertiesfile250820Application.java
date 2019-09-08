package com.saki209;

import javax.annotation.PostConstruct;

import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootUsingPropertiesfile250820Application {
	@Autowired
	private Address address;
	@Autowired
	private Person person;
	@Autowired
	private Environment environment;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootUsingPropertiesfile250820Application.class, args);
	}
	
	@PostConstruct
	public void show() {
		System.out.println(person);
		System.out.println(address);
		System.out.println(environment.getProperty("db.username"));
		System.out.println(environment.getProperty("db.password"));
		
	}

}
