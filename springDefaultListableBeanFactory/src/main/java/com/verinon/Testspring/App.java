package com.verinon.Testspring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class App 
{
    public static void main( String[] args )
    {
      DefaultListableBeanFactory container = new DefaultListableBeanFactory();
    	XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(container);
    	reader.loadBeanDefinitions("spring-beans.xml");
    	Person person = container.getBean("person", Person.class);
    	System.out.println(person);
    	
    }
    }
