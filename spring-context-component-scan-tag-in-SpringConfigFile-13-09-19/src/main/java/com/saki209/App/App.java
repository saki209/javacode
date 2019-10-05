package com.saki209.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saki209.Beans.Person;

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
