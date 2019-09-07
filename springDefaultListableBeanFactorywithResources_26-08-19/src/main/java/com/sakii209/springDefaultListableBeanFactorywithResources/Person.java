package com.sakii209.springDefaultListableBeanFactorywithResources;

public class Person {
	private String name;
	private Integer pid;
	private Double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", pid=" + pid + ", salary=" + salary + "]";
	}
	

}
