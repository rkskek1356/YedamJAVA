package com.yedam.java.Quiz04;


public class Adder extends Calculator {
	
	private int res;
	
	@Override
	protected int calc() {
		
		res = a + b;
		
		return res;
	}


}
