package com.yedam.java.example;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		
		
		//ATM기 - 입금, 출금, 잔액조회, 종료
		//1. 출금을 할때 잔액보다 많을 경우 잔액부족 출력
		//2. 입금, 출금, 잔액조회시 비밀번호 입력
		
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		int number;
		int password;
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			
			System.out.print("선택 > ");
			number = Integer.parseInt(scanner.nextLine());
			
			switch(number) {
			case 1:
				System.out.print("비밀번호 4자리를 입력하시오 > ");
				password = Integer.parseInt(scanner.nextLine());
				if(password == 1234) {
					System.out.print("예금액 > \n");
					balance += Integer.parseInt(scanner.nextLine());
					number = 0;
					break;					
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
				
				
			case 2:
				System.out.print("비밀번호 4자리를 입력하시오 > ");
				password = Integer.parseInt(scanner.nextLine());
				if(password == 1234) {
					System.out.print("출금액 > \n");
					balance -= Integer.parseInt(scanner.nextLine());
					if(balance < 0) {
						System.out.println("잔액이 부족합니다.");
					}
					number = 0;
					break;
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
				
				
			case 3:
				System.out.print("비밀번호 4자리를 입력하시오 > ");
				password = Integer.parseInt(scanner.nextLine());
				if(password == 1234) {
					System.out.println("잔고 > "+balance);
					number = 0;
					break;					
				}else {
					System.out.println("비밀번호가 틀렸습니다.\n");
				}
				
				
			case 4:
				run = false;
				System.out.println("종료합니다.");
				number = 0;
				break;
			}			
		}
		
		

	}

}
