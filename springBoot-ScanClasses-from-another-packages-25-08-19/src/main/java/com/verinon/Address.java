package com.verinon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Address {
	@Value("bulkampet")
	private String street;
	@Value("TS")
	private String state;
	@Value("hyd")
	private String city;
	
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", state=" + state + ", city=" + city + "]";
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
