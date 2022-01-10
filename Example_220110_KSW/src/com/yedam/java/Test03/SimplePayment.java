package com.yedam.java.Test03;

public class SimplePayment implements Payment{

	private double d;
	
	public SimplePayment(double d) {
		this.d = d;
	}

	@Override
	public void showInfo() {
		System.out.println("*** 간편결제 시 할인정보");
		System.out.println("온라인 결제시 총 할인율 : " + (ONLINE_PAYMENT_RATIO + d));
		System.out.println("오프라인 결제시 총 할인율 : " + (OFFLINE_PAYMENT_RATIO + d));
		
	}

	@Override
	public double online(int price) {
		double online = price - (price * ONLINE_PAYMENT_RATIO+d);
		return online;
	}

	@Override
	public double offline(int price) {
		double offline = price - (price * OFFLINE_PAYMENT_RATIO+d);
		return offline;
	}
	

}
