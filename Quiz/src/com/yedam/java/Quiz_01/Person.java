package com.yedam.java.Quiz_01;

public class Person {
	
	//필드
	private String name;
	private int money;
	
	
	//생성자
	public Person(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	
	//메소드
	public void buyCoffee(StarCafe starcafe) {
		this.money -= 4000;
		starcafe.take(4000);
	}
	
	public void buyCoffee(BeanCafe beancafe) {
		this.money -= 4500;
		beancafe.take(4500);
	}
	
	public void showInfo() {
		System.out.println(name + "님의 남은 돈은 " +money+ "입니다.");
	}

}
