package com.sakii209.spring_continerbihaver_04_09_19;

public class Address {
private String street;
private String city;
private String state;


public Address() {
	System.out.println("addrss object is crated");
}
@Override
public String toString() {
	return "Address [street=" + street + ", city=" + city + ", state=" + state + "]";
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
