package com.cts.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJavaConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld world=(HelloWorld) context.getBean(HelloWorldImpl.class);
		System.out.println(world.message());

	}

}
