package com.yedam.java.Quiz_01;

public class Card {
	
	private static int serialNum = (int)(Math.random()*10000)+1;
	private String name;
	private int CardNo;
	
	public Card() {
		serialNum = (int)(Math.random()*10000)+1;
		CardNo = serialNum;
	}
	
	public Card(String name) {
		serialNum = (int)(Math.random()*10000)+1;
		CardNo = serialNum;

	}


	public static int getSerialNum() {
		return serialNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCardNo() {
		return CardNo;
	}

	public void setCardNo(int cardNo) {
		CardNo = cardNo;
	}

	public static void setSerialNum(int serialNum) {
		Card.serialNum = serialNum;
	}
	
}
