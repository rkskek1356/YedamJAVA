package com.yedam.java.quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 문제 01
		int a = 10;
		int b = 50;
		int c = 90;
		
		int temp = a;
		a = b;
		b = c;
		c = temp;
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("c= " + c);
		
		System.out.println("a= "+a +",b="+b +",c= "+c);
		
		
		//마무리 문제 9
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		
		int result = (int)(var1+var2+var3 + (int)Double.parseDouble(var4));
		System.out.println(result);
		
		
		String name = "감자바";
		int age = 25;
		String tel1="010", tel2="123", tel3="4567";
		
		System.out.println("이름:"+name);
		System.out.print("나이:"+age+"\n");
		System.out.printf("전화:%s-%s-%s",tel1, tel2, tel3);

		System.out.println();
		
		//마무리문제 2~3
		Scanner scanner = new Scanner(System.in);
		
		/*
		String inputData1;
		String inputData2;
		String inputData3;
		while(true) {
			inputData1 = scanner.nextLine();
			inputData2 = scanner.nextLine();
			inputData3 = scanner.nextLine();
			System.out.println("이름:"+inputData1);
			System.out.println("주민번호 앞 6자리:"+inputData2);
			System.out.println("전화번호:"+inputData3);
			*/ //책보고 다시풀기
		}
	}
