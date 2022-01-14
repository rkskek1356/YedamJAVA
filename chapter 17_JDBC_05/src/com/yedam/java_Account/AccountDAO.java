package com.yedam.java_Account;

public interface AccountDAO {
		
		//회원가입
		public void insert(Account acc);
		
		//로그인
		public Account login(int accountNo);
		
		//송금
		public void remit(Account acc);
		
		//입금
		public void deposit(Account acc);
		
		//잔액조회
		public void balance(int accountNo);

}
