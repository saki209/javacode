package com.saki209;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootExternalization010920Application {
	@Autowired
	private Person person;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootExternalization010920Application.class, args);
	}
	
	@PostConstruct
	public void getMassage() {
		/*
		 * 1)run as runconfiguration and pass command line args
		 * --msg="welcome form the command line args" 
		 * 2)run as runconfiguraion and pass system propties
		 * -Dmsg="welcome form system properties"
		 * 3)place msg in properties file
		 * 4)place msg in yaml file
		 * try all above types
		 */
		
		String msg = person.getMsg();
		System.out.println(msg);
	}
}
