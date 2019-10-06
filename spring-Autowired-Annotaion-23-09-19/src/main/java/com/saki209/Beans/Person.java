package com.saki209.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Person {
	@Value("saikiran")
private String name;
	@Value("209")
private Integer pid;
	@Autowired
private Address address;
	@Override
	public String toString() {
		return "Person [name=" + name + ", pid=" + pid + ", address=" + address + "]";
	}
	
	

}
