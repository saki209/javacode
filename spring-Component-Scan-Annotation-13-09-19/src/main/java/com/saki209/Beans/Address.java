package com.saki209.Beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Address {

	@Value("hyd")
	private String city;
	@Value("Ts")
	private String state;
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
}
