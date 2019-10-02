package com.saki209.spring_BeanPostProcessor_01_10_19;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saki209.Beans.Address;
import com.saki209.Beans.Person;

public class App 
{
	public static void main( String[] args )
    {
    	ApplicationContext container = new ClassPathXmlApplicationContext("spring-config.xml");
    	container.getBean(Person.class);
    	container.getBean(Address.class);
    	ClassPathXmlApplicationContext.class.cast(container).close();
    }
}
