package com.saki209.spring_autowire_byName_10_09_19;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("classpath:com/saki209/config/spring-config.xml");
		Person person = container.getBean(Person.class);
		System.out.println(person);
		ClassPathXmlApplicationContext.class.cast(container).close();
	}
}
