package com.saki209.Beans;

import org.springframework.beans.factory.annotation.Value;

public class Person {
	@Value("saikiran")
private String name;
	@Value("209")
private Integer pid;

	@Override
	public String toString() {
		return "Person [name=" + name + ", pid=" + pid + "]";
	}
	
	

}
