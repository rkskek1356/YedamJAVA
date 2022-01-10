package com.yedam.java.ProQuiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		List<Library> book = new ArrayList<Library>();
		
		
		while(run) {
			System.out.println("1.책정보 입력 | 2.전체조회 | 3.단건조회 | 4.책 대여 | 5.책 반납 | 6.종료");
			System.out.println("-----------------------------------------------------------");
			System.out.print("선택 > ");
			int menuNo = scanner.nextInt();
			
			switch(menuNo){
				case 1:
					System.out.print("1.책 정보 입력 > ");
					
					break;
					
				case 2:
					System.out.println("2.전체조회");
					
					break;
					
				case 3:
					System.out.println("3.단건조회");
				
					break;
					
				case 4:
					System.out.println("4.책 대여");
					
					break;
					
				case 5:
					System.out.println("5.책 반납");
					System.out.println("반납하실 책 이름을 입력하세요");
					
					break;
					
				case 6:
					run = false;
					System.out.println("프로그램 종료");
					break;
					
				default:
						System.out.println("다시선택하세요");
					break;
			}
		}

	}
		

	}
