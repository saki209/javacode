package com.sakii209.spring_DataBinding_06_09_16;

import java.util.Arrays;

public class Student {
	private String name;
	private int Sid;
	private String[] courses;
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", Sid=" + Sid + ", courses=" + Arrays.toString(courses) + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}

}
