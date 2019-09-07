package com.sakii209.spring_constractor_injection_05_09_19;

public class Person {
	private String name;
	private Integer pid;
	private Double salary;

	@Override
	public String toString() {
		return "Person [name=" + name + ", pid=" + pid + ", salary=" + salary + "]";
	}

	
	public Person() {
		
		
	}


	public Person(String name, Integer pid, Double salary) {
		super();
		this.name = name;
		this.pid = pid;
		this.salary = salary;
	}

}
