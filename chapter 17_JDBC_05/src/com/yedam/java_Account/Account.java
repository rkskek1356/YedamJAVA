package com.yedam.java_Account;

public class Account {
	
	private int accountNo;
	private String accountOwner;
	private String accountPassword;
	private int accountBalance;
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountOwner() {
		return accountOwner;
	}
	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}
	public String getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountOwner=" + accountOwner + ", accountPassword="
				+ accountPassword + ", accountBalance=" + accountBalance + "]";
	}
	
	
	
}
