package com.saki209.spring_Required_annotation_onSetters_12_09_19;

import org.springframework.beans.factory.annotation.Required;

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
	@Required
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPid() {
		return pid;
	}
	@Required
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	
	

}
