package com.yedam.java.Quiz_01;

public class CardCompany {
	
	private static CardCompany cardcompany = new CardCompany();
	
	private CardCompany() {}
	
	static CardCompany getInstance() {
		return cardcompany;
	}
	
	public Card creatCard() {
		return new Card();
	}
	
	public Card createCard(String name) {
		return new Card(name);
	}

}
