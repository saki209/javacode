package com.sakii209.spring_insidebean_configuring_bothconstractor_and_properties_05_09_19;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext container = new ClassPathXmlApplicationContext("spring-config.xml");
		Person person = container.getBean(Person.class);
		System.out.println(person);
	
		ClassPathXmlApplicationContext.class.cast(container).close();
    }
}
