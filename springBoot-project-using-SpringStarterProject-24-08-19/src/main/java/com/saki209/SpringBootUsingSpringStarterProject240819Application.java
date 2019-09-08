package com.saki209;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootUsingSpringStarterProject240819Application {
	@Autowired
	private Person person;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootUsingSpringStarterProject240819Application.class, args);
	}
	@PostConstruct
	public void getperson() {
		System.out.println(person.getName());
		System.out.println(person.getPid());
	}

}
