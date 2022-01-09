package com.yedam.java.ch0703;

public class SmartPhone extends Phone {
	
	public SmartPhone(String owenr) {
		super(owenr);
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
