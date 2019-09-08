package com.sakii209.spring_DataBinding_06_09_16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext continer = new ClassPathXmlApplicationContext("classpath:com/sakii209/configuration/spring-config.xml");
		
		Student student = continer.getBean(Student.class);
		System.out.println(student);
		Person person = continer.getBean(Person.class);
		System.out.println(person);
		
		ClassPathXmlApplicationContext.class.cast(continer).close();
	}
}
