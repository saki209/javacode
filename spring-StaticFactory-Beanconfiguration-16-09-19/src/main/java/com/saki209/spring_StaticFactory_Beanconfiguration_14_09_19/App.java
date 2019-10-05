package com.saki209.spring_StaticFactory_Beanconfiguration_14_09_19;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saki209.Beans.Person;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext container=new ClassPathXmlApplicationContext("spring-config.xml");
    	Person person = container.getBean(Person.class);
    	person.display();
    	ClassPathXmlApplicationContext.class.cast(container).close();
    }
}
