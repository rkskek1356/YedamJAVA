package com.yedam.java.Quiz_01;

public class BeanCafe {
	
	private String name;
	private int money;
	
	
	public BeanCafe(String name) {
		this.name = name;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void ShowInfo() {
		System.out.println(name + "의 매출은 " +money+ "입니다.");
	}

}
