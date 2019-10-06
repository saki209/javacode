package com.saki209.spring_FactoryBeans_24_09_19;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.saki209.Beans.BeanConfig;
import com.saki209.Beans.Person;


public class App 
{
    public static void main( String[] args )
    {

    	AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext(BeanConfig.class);
    	Person person = container.getBean(Person.class);
    	System.out.println(person);
    	container.close();
    }
}
