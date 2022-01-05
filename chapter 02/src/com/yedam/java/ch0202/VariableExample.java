package com.yedam.java.ch0202;

public class VariableExample {

	public static void main(String[] args) {
		// 정수 리터럴
		int var1 = 0b1011; // 2진수
		int var2 = 0206; // 8진수
		int var3 = 0xb3; //16진수
		int var4 = 365; //10진수
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		
		//byte 타입
		byte v1 = -128;
		byte v2 = -30;
		byte v3 = 0;
		byte v4 = 30;
		byte v5 = 127;
		
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		System.out.println("v3: " + v3);
		System.out.println("v4: " + v4);
		System.out.println("v5: " + v5);
		
		//long 타입
		long var10 = 20;
		long var11 = 100000000000000L; // long타입 int범위를 벗어날경우 L을 붙이면 됨 (p.62)
		
		System.out.println("var10: " + var10);
		System.out.println("var11: " + var11);
		
		//char 타입
		char c1 = 'A';       //문자
		char c2 = 65;        //10진수
		char c3 = '\u0041';  //16진수
		
		char c4 = '가';       //문자
		char c5 = 44032;     //10진수
		char c6 = '\uac00';  //16진수
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
		System.out.println("c4: " + c4);
		System.out.println("c5: " + c5);
		System.out.println("c6: " + c6);
		
		//string 타입
		
		String name = "홍길동";
		String job = "도사";
		String str = ("내이름은 홍길동 \"도사\"지."); // 문자열 내부 특수문자를 사용할때 역슬래쉬 사용
		
		System.out.println("이름: " + name);
		System.out.println("직업: " + job);
		System.out.println(str);
		
		//실수타입
		float f1 = 3.14F;
		double d1 = 3.14;
		float varF = 0.1234567890123456789F;
		double varD = 0.1234567890123456789;
		
		System.out.println("f1 : " + f1);
		System.out.println("d1 : " + d1);
		System.out.println("varF : " + varF);
		System.out.println("varD : " + varD);
		
		//논리타입
		boolean stop = false;
		if(stop) {
			System.out.println("중지합니다.");
		}
		else {
			System.out.println("시작합니다.");
		}
				
	}

}
