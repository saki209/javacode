package com.saki209.spring_Bean_Inheritance_09_09_19;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext container = new ClassPathXmlApplicationContext("classpath:com/saki209/config/spring-config.xml");
		Student lava = container.getBean("lava",Student.class);
		System.out.println(lava);
		Student kusa = container.getBean("kusa",Student.class);
		System.out.println(kusa);
		ClassPathXmlApplicationContext.class.cast(container).close();
    }
}
