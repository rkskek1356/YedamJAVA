package com.yedam.java.Test03;

public interface Payment {
	double ONLINE_PAYMENT_RATIO = 0.05;
	double OFFLINE_PAYMENT_RATIO = 0.03;
	
	


	public abstract void showInfo();
	public abstract double online(int price);
	public abstract double offline(int price);
}

