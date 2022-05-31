package com.springcore.javaconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new  AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student s =context.getBean("getStudent",Student.class);
		System.out.println(s);
		s.study();
	}

}
