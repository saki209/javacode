package com.saki209.Entity;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.context.annotation.Configuration;

@XmlRootElement
public class Employee {

	private Integer eid;
	private String ename;
	private Double salary;
	
	public Employee() {
								
	}

	public Employee(Integer eid, String ename, Double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	
}
