package com.saki209;

import java.util.Properties;

public class PersonWithProperties {

	private Properties data;

	@Override
	public String toString() {
		return "PersonWithProperties [data=" + data + "]";
	}

	public Properties getData() {
		return data;
	}

	public void setData(Properties data) {
		this.data = data;
	}
	
	
}
