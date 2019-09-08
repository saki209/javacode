package com.saki209.springBoot_project_using_mavenproject_24_08_19;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App{
	@Autowired
	private Person person;
	
    public static void main( String[] args )
    {
       SpringApplication.run(App.class, args);
   
    }
    
    @PostConstruct
    public void getPerson() {
    	String name = person.getName();
    	System.out.println(name);
    }
}
