package com.saki209;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.saki209.Beans.BeanConfig;
import com.saki209.Beans.Person;

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
		container.register(BeanConfig.class);
		container.refresh();

		Person person = container.getBean(Person.class);
		System.out.println(person);

		container.close();
	}
}
