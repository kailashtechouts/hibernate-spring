package com.springcore.constructref;

public class Employee {

	private int employeeId;
	private String name;
	private Certificate certi;
	public Employee(int employeeId, String name, Certificate certi) {
		this.employeeId = employeeId;
		this.name = name;
		this.certi = certi;
	}
	@Override
	public String toString() {
		
		return  this.employeeId+" : "+this.name+" { "+this.certi.name+" }";
	}
	
	
}
