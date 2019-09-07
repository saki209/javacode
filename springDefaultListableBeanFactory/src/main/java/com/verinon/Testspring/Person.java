package com.verinon.Testspring;

public class Person {
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	private int pid;
	private String name;
	private Double salary;
	
	
}
