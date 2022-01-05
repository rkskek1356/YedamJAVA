package com.yedam.java.Quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// 문제1) 책 161페이지 5번, for문을 이용해서 다음과 같이 *를 출력하는 코드를 작성해보세요.
		// *
		// **
		// ***
		// ****
		// *****
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++) {
			System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// 문제2) 책 160페이지 2번, for문을 이용해서 1부터 100까지의 정수 중에서 2의 배수가 아닌 숫자의 개수를 구하세요.
		//		 단, continue 문을 사용한다.
		int c = 0;
		for(int d=1; d<=100; d++) {
			if(d%2 != 0) {
				c++;
				continue;
			}
		}
		System.out.println(c);
		
		System.out.println();

		// 문제3) 책 161페이지 4번, 중첩 for문을 이용하여 방정식 4x+5y = 60의 모든 해 중 첫번째로 구해지는 값을 (x, y) 형태로 출력해보세요.
		//       단, x와 y는 10이하의 자연수입니다.
		
		Outter : for(int e=1; e<=10; e++) {
			for(int f=1; f<=10; f++) {
				if((4 * e)+(5 * f) == 60) {
				System.out.printf("%d , %d",e,f);
				break Outter;
			}
			}
		}
		
		System.out.println();
					
		// 문제4) do ~ while문과 Math.random()함수를 이용하여 1 ~ 10의 정수 중 7이라는 수가 나올때까지 숫자를 출력하는 코드를 작성해보세요.
		System.out.println();
		int num;
		do{
			num = (int)(Math.random()*10)+1;
			System.out.println(num);
		}while(num != 7);
		
		System.out.println();
		
		// 문제5) 책 161페이지 3번, while문과 Math.random() 함수를 이용해서 2개의 주사위를 던졌을때 나오는 숫자를 (숫자1, 숫자2) 형태로 출력하고,
		//		 숫자의 합이 5가 아니면 계속 주사위를 던지고, 숫자의 합이 5이면 실행을 멈추는 코드를 작성해보세요.
		//		 또한 주사위를 몇번 던졌는지 횟수를 출력하세요.
		//		 숫자의 합이 5가 되는 조합은 (1,4), (4,1), (2,3),(3,2)
		
		int g;
		int h;
		int count = 0;
		
		while(true) {
			g = (int)(Math.random()*6)+1;
			h = (int)(Math.random()*6)+1;
			if(g+h == 5) {
				System.out.printf("%d,%d",g,h);
				break;
			}
			count++;
		}
		System.out.println();
		System.out.println(count);
		
		//문제6) 161p 7번문제
		System.out.println();
		
		boolean run = true;
		int balance = 0;
		int number;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.println("선택 > ");
			number = Integer.parseInt(scanner.nextLine());
			
			switch(number) {
			case 1:
				System.out.print("예금액 > ");
				number = Integer.parseInt(scanner.nextLine());
				balance += number;
				number = 0;
				break;
			case 2:
				System.out.print("출금액 > ");
				number = Integer.parseInt(scanner.nextLine());
				balance -= number;
				number = 0;
				break;
			case 3:
				System.out.println("잔고 > "+ balance);
				number = 0;
				break;
			case 4:
				run = false;
				number = 0;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}		

	}

