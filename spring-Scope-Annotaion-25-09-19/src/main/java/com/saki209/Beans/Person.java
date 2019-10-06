package com.saki209.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Scope(value = "prototype")
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
	
	public Person() {
		System.out.println("this person constractor");
	}

}
