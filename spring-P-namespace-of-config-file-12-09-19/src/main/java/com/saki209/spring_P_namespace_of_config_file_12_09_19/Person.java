package com.saki209.spring_P_namespace_of_config_file_12_09_19;

public class Person {
private String name;
private Integer pid;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
@Override
public String toString() {
	return "Person [name=" + name + ", pid=" + pid + "]";
}


}
