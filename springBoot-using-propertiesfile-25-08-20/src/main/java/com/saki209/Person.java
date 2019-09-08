package com.saki209;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Person {
	@Value(value = "${name}")
	private String name;
	@Value(value = "${pid}")
	private int pid;
	@Value(value = "${salary}")
	private double salary;
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", pid=" + pid + ", salary=" + salary + "]";
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
