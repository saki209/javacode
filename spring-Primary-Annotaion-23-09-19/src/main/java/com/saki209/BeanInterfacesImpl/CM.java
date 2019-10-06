package com.saki209.BeanInterfacesImpl;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.saki209.BeanInterfaces.Person;
@Configuration
@Primary
public class CM implements Person {

	public CM() {
		System.out.println("CM object is created by container first because it is having @Primary Annotaion");
	}
	
	@Override
	public void display() {
		System.out.println("person is implimented by CM");
		
	}

}
