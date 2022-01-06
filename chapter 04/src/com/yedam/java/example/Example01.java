package com.yedam.java.example;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		
		//커피메뉴 4개와 각 가격을 출력하고
		//사용자가 메뉴를 선택한 만큼 가격을 합산해서 출력
		
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		String bill = "*** 영수증 ***\n";
		
		while(run) {
		//메뉴를 출력
			System.out.println("*** 커피 메뉴 ***\n");
			System.out.println("1. 아메리카노 2000원\n");
			System.out.println("2. 커피라떼 3500\n");
			System.out.println("3. 카라멜 마끼아또 3500원\n");
			System.out.println("4. 자바칩 프라푸치노 6500원\n");
			System.out.println("5. 프로그램 종료");
		//사용자가 선택하는 부분
		int menuNo = scanner.nextInt(); // 숫자만 계속 입력할 경우에는 line대신에 int사용해도 무관
				
		//선택한 메뉴에따라 가격을 합산
		switch(menuNo) {
		case 1:
			sum += 2000;
			bill += "아메리카노 2000원\n";
			break;
		case 2:
			sum += 3500;
			bill += "커피라떼 3500원\n";
			break;
		case 3:
			sum += 3500;
			bill += "카라멜 마끼아또 3500원\n";
			break;
		case 4:
			sum += 6500;
			bill += "자바칩 프라푸치노 6500원\n";
			break;
		case 5:
			run = false; //while에서 run일때 실행되는데 false로 부정하기때문에 while문이 종료됨			
		    break;
		default:
			System.out.println("메뉴를 잘못 선택하셨습니다.");
		}
		
		}
		bill += "-----------------\n";
		bill += "총 합계 : " + sum + "원";
		System.out.println(bill);
	}

}
