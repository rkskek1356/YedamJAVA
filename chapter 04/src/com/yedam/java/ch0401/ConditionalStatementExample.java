package com.yedam.java.ch0401;

public class ConditionalStatementExample {

	public static void main(String[] args) {
		// 기본 IF문
		int score = 93;

		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}

		if (score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		
		System.out.println();
		// IF ~ ELSE문
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		
		System.out.println();
		//IF ~ ELSE IF ~ ELSE문
		score = 75;
		
		if(score >= 90) {
			System.out.println("점수가 100 ~ 90점입니다.");
			System.out.println("등급은 A입니다.");
		}
		else if (score >= 80) {
			System.out.println("점수가 80 ~ 89점입니다.");
			System.out.println("등급은 B입니다.");
		}
		else if(score >= 70) {
			System.out.println("점수가 70 ~ 79점입니다.");
			System.out.println("등급은 C입니다.");
		}
		else {
			System.out.println("점수가 70점 미만입니다.");
			System.out.println("등급은 D입니다.");
		}
		
		System.out.println();
		
		// 0.0 <= Math.random() < 1.0
		// 0.0 * 10 <= Math.random() * 10 < 1.0 * 10
		// 0.0 <= Math.random() * 10 < 10.0
		// 0.0 + 1 <= Math.random() * 10 + 1 < 10.0 + 1
		// 1.0 <= (Math.random() * 10) + 1 < 11.0
		// 1 <= (int)(Math.random() * 10) + 1 < 11
		
		// 최소 n부터 m개의 정수 중에서 랜덤하게 값을 구하고싶을때
		// (int)(Math.random() * m) + n
		// ex) (int)(Math.random()*5) + 5; -> 5,7,8,9,10 (5부터 5개의 정수)
		
		int num = (int)(Math.random() * 6) + 1;
		if(num ==1) {
			System.out.println("1번");
		}
		else if(num == 2) {
			System.out.println("2번");
		}
		else if(num == 3) {
			System.out.println("3번");
		}
		else if(num == 4) {
			System.out.println("4번");
		}
		else if(num == 5) {
			System.out.println("5번");
		}
		else if(num == 6) {
			System.out.println("6번");
		}
		
		System.out.println();
		//switch문
		int num1 = (int)(Math.random()*6)+1;
		
		switch(num1) {
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		case 6:
			System.out.println("6번");
		}
		
		System.out.println();
		int time = (int)(Math.random()*12)+8;
		System.out.println("현재시각 : " + time + "시");
		
		switch(time) {
		case 8:
			System.out.println("출근");
		case 9:
			System.out.println("회의");
		case 10:
			System.out.println("업무");
		default:
			System.out.println("외근");
		}
		
		System.out.println();
		//char타입
		char grade = 'B';
		
		switch(grade) {
		case'A':
		case'a':
			System.out.println("우수회원");
			break;
		case'B':
		case'b':
			System.out.println("일반회원");
			break;
	    default:
			System.out.println("손님");
		}
	}
}