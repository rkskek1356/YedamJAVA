package com.yedam.java.Quiz02;

public class Account {
	
	private String name;
	private long balance;
	
	
	Account(String name) {
		this.name = name;
	}

	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) {
		balance -= money;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	
	

}
