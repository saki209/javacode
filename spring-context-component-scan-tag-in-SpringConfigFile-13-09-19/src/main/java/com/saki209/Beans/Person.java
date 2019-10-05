package com.saki209.Beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Person {
@Value("saikiran")
private String name;
@Value("209")
private Integer pid;
@Value("20000")
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
