package com.springcore.construct;

public class Person {

	private int personId;
	private String name;
	
	public Person(int personId, String name) {
		this.personId = personId;
		this.name = name;
	}

	@Override
	public String toString() {
		
		return this.personId+" : "+this.name;
	}
	
}
