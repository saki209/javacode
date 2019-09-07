package com.sakii209.propertiesfile;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		AnnotationConfigApplicationContext continer = new AnnotationConfigApplicationContext(spConfig.class);
		MessageSource messageSource = continer.getBean(MessageSource.class);
		String message = messageSource.getMessage("name", null, null);
		String number = messageSource.getMessage("number", null, null);
		System.out.println(message+"   "+number);
	}
}
