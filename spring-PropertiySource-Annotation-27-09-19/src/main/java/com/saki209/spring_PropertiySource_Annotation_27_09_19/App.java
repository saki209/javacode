package com.saki209.spring_PropertiySource_Annotation_27_09_19;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext container= new AnnotationConfigApplicationContext(BeanConfig.class);
    	DbDetails dbDetails = container.getBean(DbDetails.class);
    	dbDetails.displayDetails();
    	container.close();
    }
}
