package com.saki209.spring_Component_Scan_Annotation_13_09_19;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.saki209.Beans.Address;
import com.saki209.Beans.BeanConfig;
import com.saki209.Beans.Person;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext container=new AnnotationConfigApplicationContext(BeanConfig.class);
    	Person person = container.getBean(Person.class);
    	System.out.println(person);
    	Address address = container.getBean(Address.class);
    	System.out.println(address);
    	AnnotationConfigApplicationContext.class.cast(container).close();
    }
}
