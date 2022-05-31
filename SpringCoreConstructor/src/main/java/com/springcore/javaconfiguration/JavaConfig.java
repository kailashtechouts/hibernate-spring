package com.springcore.javaconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaConfig {
	
	@Bean
	public Pen getPen() {
		
		return new Pen();
	}
	
	@Bean
	public Student getStudent() {	
	Student s = new  Student(getPen());
	return s;
	}

}
