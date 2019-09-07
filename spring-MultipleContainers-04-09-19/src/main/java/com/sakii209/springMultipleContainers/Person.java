package com.sakii209.springMultipleContainers;

public class Person {

	private String name;
	private int pid;
	private Double salary;
	
	
	public Person() {
		System.out.println("person object is created");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	
}
