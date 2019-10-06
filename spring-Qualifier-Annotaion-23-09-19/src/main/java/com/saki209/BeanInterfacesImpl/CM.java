package com.saki209.BeanInterfacesImpl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.saki209.BeanInterfaces.Person;
@Configuration
@Qualifier(value = "cm")
public class CM implements Person {

	public CM() {
		System.out.println("CM object is created by container");
	}
	
	@Override
	public void display() {
		System.out.println("person is implimented by CM");
		
	}

}
