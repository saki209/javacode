package com.saki209;

import java.util.HashSet;

public class PersonWithSetDataType {

	private HashSet<String> names;

	
	
	@Override
	public String toString() {
		return "PersonWithSetDataType [names=" + names + "]";
	}

	public HashSet<String> getNames() {
		return names;
	}

	public void setNames(HashSet<String> names) {
		this.names = names;
	}
	
	
}
