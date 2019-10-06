package com.saki209.BeanInterfacesImpl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

import com.saki209.BeanInterfaces.Person;
@Configuration
@Qualifier(value = "pm")
public class PM implements Person {
	

	public PM() {
		System.out.println("PM object is created by container");
	}

	@Override
	public void display() {
		System.out.println("person is implemented by the PM");

	}

}
