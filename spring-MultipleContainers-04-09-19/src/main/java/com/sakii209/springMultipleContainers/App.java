package com.sakii209.springMultipleContainers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext parentcontainer = new ClassPathXmlApplicationContext("spring-config.xml");
       ApplicationContext childcontainer =new ClassPathXmlApplicationContext(new String[] {"another-config.xml"}, parentcontainer);
       
       childcontainer.getBean(Person.class);
       childcontainer.getBean(Address.class);
       
       //parentcontainer.getBean(Person.class);
       //parentcontainer.getBean(Address.class);
       
       ClassPathXmlApplicationContext.class.cast(parentcontainer).close();
       ClassPathXmlApplicationContext.class.cast(childcontainer).close();
    }
}
