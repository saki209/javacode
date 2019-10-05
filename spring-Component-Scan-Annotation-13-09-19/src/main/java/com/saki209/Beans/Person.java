package com.saki209.Beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Person {

	@Value("sai")
	private String name;
	@Value("209")
	private Integer pid;
	@Value("10000")
	private Double salary;
	@Override
	public String toString() {
		return "Person [name=" + name + ", pid=" + pid + ", salary=" + salary + "]";
	}
	
	
	
	
}
