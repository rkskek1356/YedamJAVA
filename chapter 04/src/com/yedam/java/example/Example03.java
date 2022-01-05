package com.yedam.java.example;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		
		
		// 1부터 10사이의 임의의 숫자를 발생시킵니다.
		// 총 3번의 기회가 있고
		// 기회내에 미성공시 프로그램 종료
		
		Scanner scanner = new Scanner(System.in);
		int count=0;
		
		int num = (int)(Math.random()*10)+1;
		
		for(int i=2; i>=0; i--) {
			System.out.println("1~10까지의 숫자를 선택하세요 - ");
			int intputnum = Integer.parseInt(scanner.nextLine());
			
		if(num == intputnum) {
			System.out.println("정답입니다.");
		}else if (num < intputnum){
			System.out.println("정답보다 숫자가 높습니다.");
			count--;
			System.out.println("남은기회 : " + i);
		}else if (num > intputnum) {
			System.out.println("정답보다 숫자가 작습니다.");
			count--;
			System.out.println("남은기회 : " + i);
		}
		
		if(i == 0) {
			System.out.println("실패! 다음에 다시 도전하세요");
		}
		}

	}

}
