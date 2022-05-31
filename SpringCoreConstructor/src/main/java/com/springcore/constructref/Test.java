package com.springcore.constructref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new  ClassPathXmlApplicationContext("com/springcore/constructref/cirefconfig.xml");
		Employee e = (Employee) context.getBean("emp");
		System.out.println(e);
		
	}

}
