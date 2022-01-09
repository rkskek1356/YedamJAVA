package com.yedam.java.Quiz03;

public class NamedCircle extends Circle {

	
	
	private int radius;
	private String name;
	
	public NamedCircle(int radius, String name) {
		super(radius);
		
		this.name = name;
		this.radius = radius;
	}

	public void show() {
		System.out.println(name +", 반지름 = "+ radius);
		
	}
	
	

}
