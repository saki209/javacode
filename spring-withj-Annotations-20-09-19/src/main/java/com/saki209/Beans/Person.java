package com.saki209.Beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Person {
@Value("saikiran")
private String name;
@Value("209")
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
