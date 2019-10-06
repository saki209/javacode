package com.saki209.spring_propertiesFile_25_09_19;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.saki209.Beans.BeanConfig;


public class App 
{
	public static void main( String[] args )
    {
    	ApplicationContext container=new AnnotationConfigApplicationContext(BeanConfig.class);
    	String url = container.getMessage("db.url", null, null);
    	String username = container.getMessage("db.username", null, null);
    	String password = container.getMessage("db.password",null,null);
    	System.out.println(url);
    	System.out.println(username);
    	System.out.println(password);
    	AnnotationConfigApplicationContext.class.cast(container).close();
}  
    
}
