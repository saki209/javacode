package com.sakii209.spring_object_binding_using_ref_attribute_04_09_2019;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext container=new ClassPathXmlApplicationContext("spring-config.xml");
    	Person person = container.getBean(Person.class);
    	System.out.println(person);
    	ClassPathXmlApplicationContext.class.cast(container);
    }
}
