package com.saki209.Beans;

public class Person {
	private String name;
	private Integer pid;

	public Person(String name, Integer pid) {
		System.out.println("person constuctor");
		
		this.name = name;
		this.pid = pid;
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
