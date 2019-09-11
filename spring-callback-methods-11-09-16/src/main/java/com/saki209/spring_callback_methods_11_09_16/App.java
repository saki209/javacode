package com.saki209.spring_callback_methods_11_09_16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext container=new ClassPathXmlApplicationContext("classpath:com/saki209/config/spring-config.xml");
    	System.out.println("container object is crated");
    	Person person = container.getBean(Person.class);
    	System.out.println(person);
    	System.out.println("before container object close");
    	ClassPathXmlApplicationContext.class.cast(container).close();
    }
}
