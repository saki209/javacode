package com.saki209.spring_init_method_attribure_of_beanTag_12_09_19;

import java.awt.Container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext container=new ClassPathXmlApplicationContext("classpath:com/saki209/config/spring-config.xml");
        System.out.println("container object is created");
    	Person person = container.getBean(Person.class);
    	System.out.println(person);
    	ClassPathXmlApplicationContext.class.cast(container).close();
    }
}
