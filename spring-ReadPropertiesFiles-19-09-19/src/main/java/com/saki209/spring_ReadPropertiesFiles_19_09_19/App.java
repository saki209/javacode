package com.saki209.spring_ReadPropertiesFiles_19_09_19;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext container=new ClassPathXmlApplicationContext("spring-config.xml");
    	String url = container.getMessage("db.url", null, null);
    	String username = container.getMessage("db.username", null, null);
    	String password = container.getMessage("db.password",null,null);
    	System.out.println(url);
    	System.out.println(username);
    	System.out.println(password);
    	ClassPathXmlApplicationContext.class.cast(container).close();
}
}
