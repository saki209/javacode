package com.saki209;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringBootExclusion010919Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext continer = SpringApplication.run(SpringBootExclusion010919Application.class, args);
		int count = continer.getBeanDefinitionCount();
		System.out.println(count);
		
		continer.close();
	}

}
