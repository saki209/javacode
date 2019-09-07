package com.sakii209.spring_30_08_19;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
   
	public static void main( String[] args )
    {
		
		//below code is to creating continer while crating till will read two configuraion files.
     // ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml","spring-beans.xml");
		
		
		//calling spring-beans.xml form spring-config.xml file using import tag
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
     
      //Person person = context.getBean(Person.class);
     // System.out.println(Person.class.cast( context.getBean("kiran")));
		System.out.println(Person.class.cast(context.getBean("sai")));
		System.out.println(Person.class.cast(context.getBean("kiran")));
      
      ClassPathXmlApplicationContext.class.cast(context).close();
    }
}
