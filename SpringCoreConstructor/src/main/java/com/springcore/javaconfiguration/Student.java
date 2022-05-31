package com.springcore.javaconfiguration;

import org.springframework.stereotype.Component;


public class Student {
	
	private Pen pens;
	
	public Student(Pen pens) {
		super();
		this.pens = pens;
	}

	public Pen getPens() {
		return pens;
	}

	public void setPens(Pen pens) {
		this.pens = pens;
	}

	public void study() {
		this.pens.display();
		System.out.println("student is reading book");
	}

}
