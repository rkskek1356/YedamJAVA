package com.yedam.java.Test02;

public class Card {
	
	private int cardNo;
	private int validDate;
	private int cvc;
	
	
	public Card(int cardNo, int validDate, int cvc) {
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.cvc = cvc;
	}
	

	public int getCardNo() {
		return cardNo;
	}
	public int getValidDate() {
		return validDate;
	}
	public int getCVC() {
		return cvc;
	}

	public void showCardInfo() {
		return;
	}
	
	
	
	

}
