package com.saki209.spring_PropertiySource_Annotation_27_09_19;

import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource( value = "classpath:db.properties")
public class DbDetails {
	@Autowired
	private Environment environment;
	
	String password;
	public void displayDetails() {
		System.out.println("url :"+environment.getProperty("db.url"));
		System.out.println("uername :"+environment.getProperty("db.username"));
		System.out.println("password :"+environment.getProperty("db.password"));
	}
}
