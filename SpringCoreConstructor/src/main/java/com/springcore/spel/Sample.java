package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sample {

	@Value("#{23+73}")
	private int x;
	
	@Value("#{2+6+73+12}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(625)}")
	private double z;
	
	@Value("#{T(java.lang.Math).PI}")
	private int w;
	
	@Value("#{new java.lang.String('Kailash Chaitankar')}")
	private String name;
	
	@Value("#{8>5}")
	private boolean isActive;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	@Override
	public String toString() {
		return "Sample [x=" + x + ", y=" + y + ", z=" + z + ", w=" + w + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}	
	
}
