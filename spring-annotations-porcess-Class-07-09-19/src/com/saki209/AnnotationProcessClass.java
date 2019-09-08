package com.saki209;

import java.lang.annotation.Annotation;

public class AnnotationProcessClass {
public static void main(String[] args) {
	//getting class object from person class
	Class<?> cls =Person.class;
	
	//geting annotations on top of person class
	Annotation[] annotations = cls.getAnnotations();
	
	//get one by one annotation using foreach loop
	for (Annotation annotation : annotations) {
		
		//converting annotaion to appropriate type
		if (annotation instanceof Details) {
			Details details = (Details) annotation;
			//geting elements values wich you provided in person class annotaion
			int age = details.age();
			String name = details.name();
			System.out.println("name :"+name+"   "+"age :"+age);
			
		}
	}
}
}
