package com.saki209.spring_BeanFactoryPostProcessor_01_10_19;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saki209.beans.Address;
import com.saki209.beans.Person;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext container = new ClassPathXmlApplicationContext("spring-config.xml");
    	Person person = container.getBean(Person.class);
    	Address address = container.getBean(Address.class);
    	
    	System.out.println(person+"   "+address);
    	ClassPathXmlApplicationContext.class.cast(container).close();
    
    }
}
