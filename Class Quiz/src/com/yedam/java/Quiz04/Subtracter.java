package com.yedam.java.Quiz04;

public class Subtracter extends Calculator{
	

	private int res;
	
	@Override
	protected int calc() {
		res = a - b;
		System.out.println(res);
		return res;
	}

}
