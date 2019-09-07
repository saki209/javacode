package com.sakii209.SpringWithLog4j;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext continer=new ClassPathXmlApplicationContext("spring-config.xml");
    
    }
}
