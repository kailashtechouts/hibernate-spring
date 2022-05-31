package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
    public static void main( String[] args) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/config.xml");
         Student students =  context.getBean("s1", Student.class);
    
         System.out.println(students);
         
         
    }
}
