package com.saki209.spring_init_method_attribure_of_beanTag_12_09_19;

public class Person {
private String name;
private Integer pid;

public Person() {
	System.out.println("this is constractor");
}


public void init() throws Exception{
	System.out.println("in side the init method");
	if(name == null || pid == null) {
		throw new Exception();
	}
	
}


@Override
public String toString() {
	return "Person [name=" + name + ", pid=" + pid + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	System.out.println("this is setter method");
	this.name = name;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}


}
