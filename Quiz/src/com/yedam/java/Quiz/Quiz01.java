package com.yedam.java.Quiz;

import java.util.Scanner;

public class Quiz01 {

	private static int inputData;

	public static void main(String[] args) {
		// 문제1) 두 개의 정수가 주어졌을 때 두 정수의 합이 자연수이면 'Natural Number'을 출력하도록 하세요.
		int a = 1;
		int b = 2;
		int result = a+b;
		
		if(result>=0) {
			System.out.println("Natural Number");
					
		}else {
			System.out.println("NOT");
		}

		// 문제2) 두 개의 정수가 주어졌을 때 두 수의 대소관계에 따라 부등호( > or = or < )를 출력하도록 하세요.
		int c = 1;
		int d = 2;
		
		if(c<d) {
			System.out.println("c < d");
		} else if(c>d){
			System.out.println("c > d");
		} else if(c==d) {
			System.out.println("c = d");
		}

		
		/* 문제3) 체질량 지수인 BMI에 따라 비만도를 네가지 단계로 구분하여 결과값을 출력하도록 하세요.
		   BMI = 체중 / ( 키 * 키 )
		   저체중(18.5미만), 정상(18.5 이상 25미만), 과체중(25이상 30미만), 비만(30이상) */
		Scanner scanner = new Scanner(System.in);
		System.out.print("키 : ");
		Double e = Double.parseDouble(scanner.nextLine());
		System.out.print("몸무게 : ");
		Double f = Double.parseDouble(scanner.nextLine());
		double result1 = (double)f / ((e/100)*(e/100));
		
		if (result1 < 18.5) {
			System.out.println("저체중");
		}else if (result1 < 25) {
			System.out.println("정상");
		}else if (result1 < 30) {
			System.out.println("과체중");
		}else if(result1>=30) {
			System.out.println("비만");
		}
		
		/* 문제4) 선택한 단의 6번째 값을 출력하도록 하세요.
		   예를 들어, 2단일 경우 2 X 6 = 12 
		   단, 출력문에 변수를 사용하지 않는다.
		 */
		System.out.print("단수를 입력하시오 : ");
		
		int num = Integer.parseInt(scanner.nextLine());
		//System.out.println(num*6);
		switch(num) {
		case 1:
			System.out.printf("%d X 6 = %d", 1, 1*6);
			break;
		case 2:
			System.out.printf("%d X 6 = %d", 2, 2*6);
			break;
		case 3:
			System.out.printf("%d X 6 = %d", 3, 3*6);
			break;
		case 4:
			System.out.printf("%d X 6 = %d", 4, 4*6);
			break;
		case 5:
			System.out.printf("%d X 6 = %d", 5, 5*6);
			break;
		case 6:
			System.out.printf("%d X 6 = %d", 6, 6*6);
			break;
		case 7:
			System.out.printf("%d X 6 = %d", 7, 7*6);
			break;
		case 8:
			System.out.printf("%d X 6 = %d", 8, 8*6);
			break;
		case 9:
			System.out.printf("%d X 6 = %d", 9, 9*6);
			break;
		case 10:
			System.out.printf("%d X 6 = %d", 10, 10*6);
			break;
		}
		

		/* 문제5) 다음과 같이 점수 범위에 따라 등급을 구분하여 해당 점수에 대한 등급을 출력하도록 하세요.
		   90점 이상 100점 이하 : A 등급,
		   80점 이상 90점미만 : B 등급,
		   70점 이상 80점미만 : C 등급,
		   60점 이상 70점미만 : D 등급,
		   60점미만 : E등급
		 */
		System.out.println();
		System.out.print("점수를 입력하시오 : ");
		int score = Integer.parseInt(scanner.nextLine());
		
		switch(score/10) { // 소수점 아래부분은 없앰
		case 10: //break가 없기때문에 case 9 와 같이출력됨
		case 9:
			System.out.println("A등급");
			break;
		case 8:
			System.out.println("B등급");
			break;
		case 7:
			System.out.println("C등급");
			break;
		case 6:
			System.out.println("D등급");
			break;
		default:
			System.out.println("E등급");
		
		}
	
		
		
		
		
		
		
		
		
	}
}
