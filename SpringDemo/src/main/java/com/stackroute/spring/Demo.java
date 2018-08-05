package com.stackroute.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		Demo1 obj = new Demo1();
//		obj.hello();
		Demo1 obj=(Demo1)context.getBean("abc");
		obj.hello();

	}
}
