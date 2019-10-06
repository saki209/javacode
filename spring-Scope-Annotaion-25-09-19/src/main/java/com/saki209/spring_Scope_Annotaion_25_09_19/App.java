package com.saki209.spring_Scope_Annotaion_25_09_19;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.saki209.Beans.BeanConfig;
import com.saki209.Beans.Person;

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(BeanConfig.class);
		Person person = container.getBean(Person.class);
		Person person2 = container.getBean(Person.class);
		Person person3 = container.getBean(Person.class);
		Person person4 = container.getBean(Person.class);
		System.out.println(person);
		System.out.println(
				"address object is created only once because it's scope is singleton where as person object created many time when ever we call gerBean(Person.class) because its scope is prototype");
		container.close();
	}
}
