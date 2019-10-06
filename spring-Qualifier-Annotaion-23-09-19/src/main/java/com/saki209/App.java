package com.saki209;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.saki209.BeanInterfacesImpl.BeanConfig;
import com.saki209.BeanInterfacesImpl.State;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext(BeanConfig.class);
    	State state = container.getBean(State.class);
    	state.toString();
    	container.close();
    }
}
