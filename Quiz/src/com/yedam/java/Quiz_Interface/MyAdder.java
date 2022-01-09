package com.yedam.java.Quiz_Interface;

public class MyAdder implements AdderInterface {

	@Override
	public int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

	@Override
	public int add(int n) {
		int sum1 = 0;
		for (int i = 0; i <= n; i++) {
			sum1 += i;
		}
		return sum1;
	}
}