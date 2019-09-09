package com.saki209;

import java.util.List;

public class PersonWithListDataType {

	private List<String> names;

	
	
	@Override
	public String toString() {
		return "PersonWithListDataType [names=" + names + "]";
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}
	
	
}
