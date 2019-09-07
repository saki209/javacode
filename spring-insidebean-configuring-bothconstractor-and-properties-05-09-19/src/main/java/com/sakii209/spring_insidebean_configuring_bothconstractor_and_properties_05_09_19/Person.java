package com.sakii209.spring_insidebean_configuring_bothconstractor_and_properties_05_09_19;

public class Person {
private String name;
private int pid;
private double salary;
private Address address;

public Person() {

}

@Override
public String toString() {
	return "Person [name=" + name + ", pid=" + pid + ", salary=" + salary + ", address=" + address + "]";
}

public Person(double salary, Address address) {
	super();
	this.salary = salary;
	this.address = address;
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
 
	



}
