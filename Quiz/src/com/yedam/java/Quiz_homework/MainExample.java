package com.yedam.java.Quiz_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.java.List.Menu;

public class MainExample {


	public static void main(String[] args) {
		//문제) 다음은 도서관리프로그램 중 일부입니다.
		//	1) 메뉴는 다음과 같이 구성하세요.
		//	1.책정보 입력 | 2.전체조회 | 3.단건조회 | 4.책 대여 | 5.책 반납 | 6.종료
		//	2) 입력되는 책정보는 책이름과 저자명입니다.
		//	3) 전체 조회 및 단건 조회 시 책번호, 책이름, 저자명, 해당 책의 대여여부(대여중, 대여가능)도 함께 출력되도록 하세요.
		//	4) 책 대여 시 해당 책의 대여여부를 확인해서
		//	   이미 대여 중인 책일 경우 "대여 중입니다."라는 안내문구를 출력하고
		//	   대여가 가능한 책일 경우 대여처리 후 "대여되었습니다"라고 출력하도록 하세요.
		//	5) 책 반납 시 반납처리 후 "반납되었습니다."라고 출력하도록 하세요.
		//  6) 종료시 "프로그램 종료"를 출력하도록 하세요.
		
		/*
		 중앙로 도서관에서 근무 중인 김씨의 오늘 업무일지는 다음과 같습니다.
		 - 당일 들어온 책에 대해 입고처리
		 (참고, 책마다 고유번호가 자동으로 부여됩니다. )
		 	1) 혼자공부하는자바, 신용권      
		 	2) 이것이자바다, 신용권	      
		 	3) 자바스크립트파워북, 에이포스트  
		 	4) 나는프로그래머다, 이상순     
		 	5) 오늘부터개발자, 김용닥       
		 	6) SQL의 비밀노트, 김예담      
		 - 현재 보유 중인 책 목록 확인
		 - 이용자가 요청한 책 정보 확인
		 	1) 이것이자바다
		 	2) 오늘부터개발자
		 - 책 대여
		 	1) 나는프로그래머다 -> 정상대여
		 	2) 혼자공부하는자바 -> 정상대여
		 	3) 나는프로그래머다 -> 대여 중
		 - 책 반납
		 	1) 혼자공부하는자바
		 */
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		List<Book> bookstate = new ArrayList<Book>();
		
		
		while(run) {
			System.out.println("1.책정보 입력 | 2.전체조회 | 3.단건조회 | 4.책 대여 | 5.책 반납 | 6.종료");
			System.out.println("-----------------------------------------------------------");
			System.out.print("선택 > ");
			int menuNo = scanner.nextInt();
			
			switch(menuNo){
				case 1:
					System.out.print("1.책 정보 입력 > ");
					bookstate.add(new Book(scanner.next(), scanner.next()));
					System.out.println();
					break;
					
				case 2:
					System.out.println("2.전체조회");
					for(int i=0; i<bookstate.size(); i++){
						
						String bookname = bookstate.get(i).getBookname();
						String name = bookstate.get(i).getName();
						int booknum = bookstate.get(i).getBooknum();
						String state = bookstate.get(i).getState();
						
						
						System.out.println(booknum +")"+ bookname +", "+ name +" "+ state);
					}
					break;
					
				case 3:
					System.out.println("3.단건조회");
					System.out.println("조회할 책 이름을 입력하세요 > ");
					String search = scanner.next();
					for(int i=0; i<bookstate.size(); i++) {
						if(search.equals(bookstate.get(i).getBookname())) {
							String bookname = bookstate.get(i).getBookname();
							String name = bookstate.get(i).getName();
							int booknum = bookstate.get(i).getBooknum();
							String state = bookstate.get(i).getState();
							
							System.out.println(i +")"+ bookname +", "+ name +" "+ state);
							System.out.println();
						}
					}
					break;
					
				case 4:
					System.out.println("4.책 대여");
					System.out.println("대여하실 책 이름을 입력하세요");
					String booklend = scanner.next();
					for(int i=0; i<bookstate.size(); i++) {
						if((booklend.equals(bookstate.get(i).getBookname()) && (bookstate.get(i).getBorrow() == 1))) {
							System.out.println(booklend + "책을 대여합니다.");
							bookstate.get(i).setBorrow(0);
						}else if ((booklend.equals(bookstate.get(i).getBookname()) &&(bookstate.get(i).getBorrow() == 0))){
							System.out.println(booklend + "책은 대여중입니다.");
						}
					}
					break;
					
				case 5:
					System.out.println("5.책 반납");
					System.out.println("반납하실 책 이름을 입력하세요");
					String bookreturn = scanner.next();
					for(int i=0; i<bookstate.size(); i++) {
						if(bookreturn.equals(bookstate.get(i).getBookname())){
							System.out.println(bookreturn + "책을 반납합니다.");
							bookstate.get(i).setBorrow(+1);
						}
					}
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
