package com.saki209;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.verinon.Address;

import info.inetsolv.Person;

@SpringBootApplication(scanBasePackages = {"info.inetsolv","com.saki209"})
public class SpringBootScanClassesFromAnotherPackages250819Application {
	@Autowired
	private Person person;
	@Autowired
	private Address address;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootScanClassesFromAnotherPackages250819Application.class, args);
	}
	
	@PostConstruct
	public void getDetails() {
		System.out.println(person.getName()+"  "+person.getPid()+"   "+person.getSalary());
		System.out.println(address.getCity()+"    "+address.getState()+"    "+address.getStreet());
	}

}
