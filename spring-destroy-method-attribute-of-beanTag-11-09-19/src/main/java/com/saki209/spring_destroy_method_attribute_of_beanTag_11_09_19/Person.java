package com.saki209.spring_destroy_method_attribute_of_beanTag_11_09_19;

public class Person {
	private String name;
	private Integer pid;

	public Person() {
		System.out.println("this is constractor");
	}


	public void destroy() {
		System.out.println("we are in destroy methode it will execute before closing container object");
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
