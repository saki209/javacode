package com.saki209;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext continer = new ClassPathXmlApplicationContext("classpath:com/saki209/config/spring-config.xml");
		PersonWithListDataType list = continer.getBean(PersonWithListDataType.class);
		System.out.println(list);
		PersonWithSetDataType set = continer.getBean(PersonWithSetDataType.class);
		System.out.println(set);
		PersonWithMapDataType map = continer.getBean(PersonWithMapDataType.class);
		System.out.println(map);
		PersonWithProperties properties = continer.getBean(PersonWithProperties.class);
		System.out.println(properties);
		
		ClassPathXmlApplicationContext.class.cast(continer).close();
	}
}
