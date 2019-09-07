package com.sakii209.spring_30_08_19;

public class Person {
	private String name;
	private Integer pid;
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", pid=" + pid + "]";
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
	
	

}
