package com.saki209.BeanInterfacesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

import com.saki209.BeanInterfaces.Person;

@Configuration
public class State {
	
	@Autowired
	@Qualifier(value = "pm")
	private Person person;
}
