package com.sakii209.spring_constractor_injection_understanding_05_09_19;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext container= new ClassPathXmlApplicationContext("spring-config.xml");
    	Demo demo = container.getBean(Demo.class);
    	
    	System.out.println(demo);
    	
    	ClassPathXmlApplicationContext.class.cast(container).close();
    }
}
