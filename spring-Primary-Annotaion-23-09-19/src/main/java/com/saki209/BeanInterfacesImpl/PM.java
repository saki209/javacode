package com.saki209.BeanInterfacesImpl;

import org.springframework.context.annotation.Configuration;

import com.saki209.BeanInterfaces.Person;
@Configuration
public class PM implements Person {
	

	public PM() {
		System.out.println("PM object is created by container");
	}

	@Override
	public void display() {
		System.out.println("person is implemented by the PM");

	}

}
