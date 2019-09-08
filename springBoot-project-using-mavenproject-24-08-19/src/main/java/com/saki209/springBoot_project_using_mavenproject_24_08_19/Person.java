package com.saki209.springBoot_project_using_mavenproject_24_08_19;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Person {
	@Value("saikiran")
	private String name;
	@Value("209")
	private int pid;
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
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	

}
