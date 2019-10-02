package com.saki209.Beans;

public class Address {
	private String city;
	private String street;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Address(String city, String street) {
		System.out.println("address constuctor");
		this.city = city;
		this.street = street;
	}

}
