package com.sakii209.spring_continerbihaver_04_09_19;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("spring-config.xml");
		container.getBean(Person.class);
		container.getBean(Person.class);
		container.getBean(Person.class);
		ClassPathXmlApplicationContext.class.cast(container).close();
	}
}
