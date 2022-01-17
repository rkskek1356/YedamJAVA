package com.yedam.java_App;

import java.util.Scanner;

public class MainExample {

	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		AccountFrame account = new AccountFrame();
		account.run();
		
		
//		boolean run = true;
//		
//		
//		while(true) {
//			
//			menuPrint();
//			
//			int menuNo = menuSelect();
//			
//			if(menuNo == 1) {
//				insertUser();
//			}else if(menuNo == 2) {
//				loginUser();
//			}else if(menuNo == 3) {
//				end();
//			}
//		}
//
//	}
//	public static void menuPrint() {
//		System.out.println();
//		System.out.println("=== 1.계좌개설 | 2.잔액조회 | 3.입금 | 4.출금 | 5.계좌이체 | 6.종료 ===");
//		System.out.print("선택 > ");
//	}
//	
//	public int menuSelect() {
//		int menuNo = 0;
//		try {
//			menuNo = sc.nextInt();
//		}catch(Exception e) {
//			System.out.println("없는 메뉴입니다.");
//		}
//		return menuNo;
//	}
//	
//	public static void insertUser() {
//		User user = inputUserInfo();
//		
//		UserDAOImpl.getInstance().insert(user);
//	}
//	
//	public static void loginUser() {
//		User user = inputLoginInfo();
//		User loginUser = UserDAOImpl.getInstance().selectUserInfo(user);
//		if(loginUser == null) {
//			System.out.println("회원정보를 확인해 주세요");
//		}else {
//			new AccountFrame().run();
//		}
	}

}
