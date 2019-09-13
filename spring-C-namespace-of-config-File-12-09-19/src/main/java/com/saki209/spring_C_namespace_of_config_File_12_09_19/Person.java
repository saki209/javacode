package com.saki209.spring_C_namespace_of_config_File_12_09_19;

public class Person {

	private String name;
	private Integer pid;
	
	public Person(String name, Integer pid) {
		super();
		this.name = name;
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", pid=" + pid + "]";
	}
	
	
}
