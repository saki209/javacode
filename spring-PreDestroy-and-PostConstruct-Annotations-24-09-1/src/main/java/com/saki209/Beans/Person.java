package com.saki209.Beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Person {
	@Value("saikiran")
private String name;
	@Value("209")
private Integer pid;
	@Resource
private Address address;
	@Override
	public String toString() {
		return "Person [name=" + name + ", pid=" + pid + ", address=" + address + "]";
	}
	public Person() {
		System.out.println("this is person constractor ");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("this is postconstruct methode execute after constractor execution");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("this is preDestroy methode execute before container closeing");
	}

}
