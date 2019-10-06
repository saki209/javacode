package com.saki209.Beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Address {
	@Value("hyd")
private String city;
	@Value("TS")
private String state;
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	public Address() {
		System.out.println("this address constractor");
	}
}
