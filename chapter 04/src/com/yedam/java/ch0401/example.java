package com.yedam.java.ch0401;

import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		//############################## if 문 ##################################
		/*
		//예제 1 - 점수를 입력받아서 70점이상이면 출력 미만이면 불합격 출력
		int score = Integer.parseInt(scanner.nextLine());
		
		if(score >= 70) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		//예제 2 - 정수 한개를 입력받아 해당 정수가 2의 배수인지 확인
		int num = Integer.parseInt(scanner.nextLine());
		
		if(num%2 == 0) {
			System.out.println("2의 배수입니다.");
		} else {
			System.out.println("2의 배수가 아닙니다.");
		}
		
		//예제 3 - 점수는 0~100점 사이 값이여야하며 벗어날경우 "점수 입력 오류!" 출력
		//        60점 이상일경우 합격, 미만이면 불합격
		int score1 = Integer.parseInt(scanner.nextLine());
		
		if((score1>=0) && (score1<=100)) {
			if(score1 >= 60) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		}else {
			System.out.println("점수입력오류!");
		}
		
		//예제 4 - 놀이기구, 키 110cm 이상일 경우 라바 트위스터를 탑승할수 있음
		//        미만일 경우 보호자가 있는지 체크 -> 있으면 탑승
		//                                    없으면 보호자 동행
		
		System.out.print("키를 입력해주세요 : ");
		double height = Double.parseDouble(scanner.nextLine());
		
		if(height>=110) {
			System.out.println("라바 트위스터를 탑승할 수 있습니다.");
		}else {
			System.out.println("보호자와 함께 오셨나요?");
			System.out.println("1:보호자와 동행 \n2:혼자");
			int selected = Integer.parseInt(scanner.nextLine());
			if(selected ==1 ) {
				System.out.println("보호자와 함께 라바 트위스터를 탑승할 수 있습니다.");
				} else {
					System.out.println("보호자와 함께 오세요");				
			}
		}
		
		//########################### switch 문 ###################################
		//예제 1 - 정수를 입력받아 0일경우 false, 1일경우 true, 둘다 아닐경우 "체크오류"
		
		int num = Integer.parseInt(scanner.nextLine());
		switch(num) {
		case 0:
			System.out.println("false");
			break;
		case 1:
			System.out.println("true");
			break;
			default:
				System.out.println("체크오류");
		}
		*/		
		
		//예제 2 - 정수를 입력받아 홀수인지 짝수인지를 판별
		//        default에 해당될경우 무엇을 출력할것인지 생각해보시오
		int num = Integer.parseInt(scanner.nextLine());
		
		switch(num%2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		default:
			System.out.println("정수가 아닙니다.");
		}
		
	}
}
