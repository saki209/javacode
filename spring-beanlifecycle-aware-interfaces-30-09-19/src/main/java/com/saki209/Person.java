package com.saki209;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

public class Person implements BeanClassLoaderAware, BeanNameAware, BeanFactoryAware, ApplicationContextAware,
		MessageSourceAware, ResourceLoaderAware {
	private String name;
	private Integer pid;

	public Person() {
		System.out.println("person construction execution");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setter method execution");
		this.name = name;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Beanname Aware interface ****: " + name);

	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("BeanClassLoader Aware interface ***:" + classLoader);

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactory Aware interface ***:" + beanFactory);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("ApplicationContext Aware interface ***:" + applicationContext);
	}

	@Override
	public void setMessageSource(MessageSource messageSource) {
		System.out.println("MessageSource Aware interface ***:" + messageSource);
	}

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		System.out.println("ResourceLoader Aware interface ***:" + resourceLoader);
	}

}
