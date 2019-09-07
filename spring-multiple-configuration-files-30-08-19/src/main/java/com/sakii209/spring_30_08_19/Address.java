package com.sakii209.spring_30_08_19;

public class Address {
	private String state;

	
	@Override
	public String toString() {
		return "Address [state=" + state + "]";
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	

}
