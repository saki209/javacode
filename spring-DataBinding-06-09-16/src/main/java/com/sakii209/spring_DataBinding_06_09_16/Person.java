package com.sakii209.spring_DataBinding_06_09_16;

import java.util.List;

public class Person {
	private List<String> names;
	

	@Override
	public String toString() {
		return "Person [names=" + names + "]";
	}

	public Person() {
		
	}

	public Person(List<String> names) {
		super();
		this.names = names;
	}
	
	
}
