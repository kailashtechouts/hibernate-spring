package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing {

	public static void main(String[] args) {

		ApplicationContext context = new  ClassPathXmlApplicationContext("com/springcore/autowire/annotation/autoannotationconfig.xml");
		Employees e = context.getBean("emp1", Employees.class);
		System.out.println(e);
	}

}
