package com.sakii209.springClassPathXmlBeanFactoryandFileSystemXmlBeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		//ClassPathXmlApplicationContext continer = new ClassPathXmlApplicationContext("spring-config.xml");
		ApplicationContext continer = new FileSystemXmlApplicationContext("F:\\spring-config.xml");
		Person person = continer.getBean("person", Person.class);
		//Object object = continer.getBean("saikiran");
		//System.out.println(person);

		FileSystemXmlApplicationContext.class.cast(continer).close();
	}
}
