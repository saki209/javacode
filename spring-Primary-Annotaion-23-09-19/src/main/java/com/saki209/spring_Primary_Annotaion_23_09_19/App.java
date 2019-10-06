package com.saki209.spring_Primary_Annotaion_23_09_19;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.saki209.BeanInterfaces.Person;
import com.saki209.BeanInterfacesImpl.BeanConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext container= new AnnotationConfigApplicationContext(BeanConfig.class);
    	container.getBean(Person.class);
    	container.close();
    }
}
