package com.sakii209.springClassPathXmlBeanFactoryandFileSystemXmlBeanFactory;


public class Person {
	private Integer pid;
	private String name;
	private Double salary;
	
	
	public Person() {
		System.out.println("person object is created");
	}
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
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

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
