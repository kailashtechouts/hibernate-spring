package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employees {

	@Autowired
	@Qualifier("addr")
	private Addressing address;

	public Addressing getAddress() {
		return address;
	}

	public void setAddress(Addressing address) {
		this.address = address;
	}

	public Employees() {
		super();
	}

	public Employees(Addressing address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
