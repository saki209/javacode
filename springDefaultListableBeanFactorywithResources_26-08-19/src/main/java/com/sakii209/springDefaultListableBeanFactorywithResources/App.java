package com.sakii209.springDefaultListableBeanFactorywithResources;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;



public class App 
{
    public static void main( String[] args )
    {
      DefaultListableBeanFactory container = new DefaultListableBeanFactory();
    	XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(container);
    	ClassPathResource resource = new ClassPathResource("spring-beans.xml");
    	//FileSystemResource resource = new FileSystemResource("F:\\spring-config.xml");
    	reader.loadBeanDefinitions(resource);
    	Person person = container.getBean("person", Person.class);
    	System.out.println(person);
    	
    }
    }