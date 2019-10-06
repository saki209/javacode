package com.saki209.spring_PreDestroy_and_PostConstruct_Annotations_24_09_1;

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
