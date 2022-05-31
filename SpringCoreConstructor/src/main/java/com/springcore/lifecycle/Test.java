package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/beanconfig.xml");
		Dance d = (Dance) context.getBean("d1");
		System.out.println(d);
		
		//registring shutdown hook using abstractapllicationContext
		context.registerShutdownHook();
		
		System.out.println("---------------------------------------------------------");
		
		Pepsi p = (Pepsi) context.getBean("p1");
		System.out.println(p);
		
		System.out.println("---------------------------------------------------------");
		SampleA s = (SampleA) context.getBean("smp");
		System.out.println(s);
	}

}
