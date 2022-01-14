package com.yedam.java_App;

import java.util.Scanner;

import com.yedam.java_Account.AccountDAO;
import com.yedam.java_Account.AccountDAOImpl;

public class AccountFrame {
	private AccountDAO accDAO = AccountDAOImpl.getInstace();
	private Scanner sc = new Scanner(System.in);
	
	public AccountFrame() {
		while(true) {
			menuPrint();
			
			int menuNo = menuSelect();
			
			if(menuNo == 1) {
				insertAccount();
			}else if(menuNo == 2) {
				loginAccount();
			}else if(menuNo == 3) {
				remitAccount();
			}else if(menuNo == 4) {
				depositAccount();
			}else if(menuNo == 5) {
				balanceAccount();
			}else if(menuNo == 6) {
				end();
				break;
			}
		}
	}
	public void menuPrint() {
		System.out.println();
		System.out.println("=== 1.회원가입 | 2.로그인 | 3.송금 | 4.입금 | 5.잔액조회 | 6.종료 ===");
		System.out.print("선택 > ");
	}
	
	public int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		}catch(Exception e) {
			System.out.println("없는 메뉴입니다.");
		}		
		return menuNo;
	}
	
	public void insertAccount() {
		Account acc = inputAccInfo();
		accDAO.insert(acc);
	}
	public void loginAccount() {
		Account acc = inputAccId();
		accDAO.login(acc);
	}
	public void remitAccount() {
		Account acc = inputAccId();
		accDAO.remit(acc);
	}
	public void depositAccount() {
		Account acc = inputAccid();
		accDAO.deposit(acc);
	}
	public void balanceAccount() {
		Account acc = intputAccid();
		accDAO.balance(acc);
	}

}
