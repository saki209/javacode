package com.saki209;

import java.util.HashMap;

public class PersonWithMapDataType {

	private HashMap<String,Double> empDatails;
	
	

	@Override
	public String toString() {
		return "PersonWithMapDataType [empDatails=" + empDatails + "]";
	}

	public HashMap<String, Double> getEmpDatails() {
		return empDatails;
	}

	public void setEmpDatails(HashMap<String, Double> empDatails) {
		this.empDatails = empDatails;
	}
	
	
}
