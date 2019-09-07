package com.sakii209.springMultipleContainers;

public class Address {
	private String street;
	private String city;
	private String state;
	
	
	
	public Address() {
		System.out.println("address object is created");
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
