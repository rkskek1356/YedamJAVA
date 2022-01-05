package com.yedam.java.example01;

public class Subway {
	
	//필드
	public String lineNumber;
	public int money;
	public int passengerCount;
	
	
	
	//생성자
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	
	//메소드
	public void take(int money) {
		this.money += 1000;
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("지하철 " +lineNumber+ "내의 승객은 " +passengerCount+ "명이고, 총 수입은 " +money+ "원 입니다.");
		
	}

}
