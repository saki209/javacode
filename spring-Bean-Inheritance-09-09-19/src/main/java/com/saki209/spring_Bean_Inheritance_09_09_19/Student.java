package com.saki209.spring_Bean_Inheritance_09_09_19;

public class Student {

	private String name;
	private int sid;
	private String motherName;
	private String fatherName;
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", sid=" + sid + ", motherName=" + motherName + ", fatherName=" + fatherName
				+ "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	
}
