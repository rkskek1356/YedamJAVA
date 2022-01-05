package com.yedam.java.Quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		
		//for 문
		
		//예제 1 - 0부터 90까지 10단위로 출력
		
//		int a = 0;
//		
//		for(a=0; a<=90; a+=10) {
//		System.out.println(a);
//		}
		
		//예제 2 - 0에서부터 20까지 짝수만 출력
//		int a = 0;
//		for(a=0; a<=20; a+=2) {
//			System.out.println(a);
//		}
		
		
		//예제 3 - 숫자를 5번 입력하고, 입력받을때마다 더해지는 값을 출력
		Scanner scanner = new Scanner(System.in);
//		int sum = 0;
//		for(int i=0; i<5; i++) {
//			int a = scanner.nextInt();
//			sum += a;
//			System.out.println("출력 : " + sum);
//			
//		}
		
		//예제 4 - 1부터 사용자가 입력한 숫자까지의 합계
		System.out.println("숫자를 입력하시오 : ");
		int a = scanner.nextInt();
		int sum = 0;
		for(int i=0; i<=a; i++) {
			sum += i;
		}
		System.out.println("1 ~ " + a +"까지의 합 : "+sum);
		

	}

}
