package com.saki209.spring_callback_methods_11_09_16;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean,DisposableBean{

	private String name;
	private Integer pid;
	
	@Override
	public void destroy() throws Exception {
		System.out.println("tihs is predefind destroy method of DisposableBean");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("this is init method of initializingBean");
		
		if(name == null || pid == null){
			throw new Exception();
		}
		
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", pid=" + pid + "]";
	}
	
}
