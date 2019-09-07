package com.sakii209.spring_object_binding_using_ref_attribute_04_09_2019;

public class Person {
	private String name;
	private Integer pid;
	private Double salary;
	private Address address;
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", pid=" + pid + ", salary=" + salary + ", address=" + address + "]";
	}
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
