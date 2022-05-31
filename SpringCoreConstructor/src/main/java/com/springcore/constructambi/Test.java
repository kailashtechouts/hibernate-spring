package com.springcore.constructambi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new  ClassPathXmlApplicationContext("com/springcore/constructambi/ciambiconfig.xml");
		Addition add = (Addition) context.getBean("add");
		add.doSum();
		
	}

}
