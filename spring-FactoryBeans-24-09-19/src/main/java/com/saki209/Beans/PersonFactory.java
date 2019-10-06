package com.saki209.Beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonFactory {
	@Bean
	public Person person() {
		return new Person();
		
	}
}
