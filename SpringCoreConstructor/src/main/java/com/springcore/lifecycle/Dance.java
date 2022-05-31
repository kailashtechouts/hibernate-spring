package com.springcore.lifecycle;

public class Dance {

	private double priceD;

	public double getPriceD() {
		return priceD;
	}

	public void setPriceD(double priceD) {
		System.out.println("Setting price");
		this.priceD = priceD;
	}

	public Dance(double priceD) {
		super();
		this.priceD = priceD;
	}

	public Dance() {
		super();
	}

	@Override
	public String toString() {
		return "Dance [priceD=" + priceD + "]";
	}
	public void init() {
		System.out.println("inside init");
	}
	public void destroy() {
		System.out.println("inside destroy");
	}
}
