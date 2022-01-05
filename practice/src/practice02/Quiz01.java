package practice02;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		        //주어진 배열을 이용하여 다음 내용을 구현하세요.
				int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
				
				
				
				//문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
				for(int i=0; i<arr1.length; i++) {
					if(arr1[i] == 60) {
						System.out.println("문제1번\n" + i);
				}
				}
				
				
				//문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
				System.out.println("문제2번");
				
				for(int i=0; i<arr1.length; i++) {
					if (i != 3) {						
						System.out.print(arr1[i] + " ");
					}
				}
				
				//문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
		  		//   입력) 인덱스: 3 ->   {10, 20, 30, 1000, 3, 60, -3}
				System.out.println();
				System.out.println("문제3번");
				
				Scanner scanner = new Scanner(System.in);
				System.out.println("변경할 인덱스를 고르시오 : ");
				int indexnum = scanner.nextInt();
				
				int temp = arr1[indexnum];
				arr1[indexnum] = 1000;
				
				for(int i=0; i<arr1.length; i++) {
					System.out.print(arr1[i]+" ");
				}
				arr1[indexnum] = temp;
				
				//문제4. 주어진 배열의 요소에서 최대값과 최소값을 구해보자.
				System.out.println();
				System.out.println("문제 4번");
				
				int max = 0;
				int min = 0;
				
				for(int i=0; i<arr1.length; i++) {
					if(max < arr1[i]) {
						max = arr1[i];
					}else if(min > arr1[i]) {
						min = arr1[i];
					}	
				}
				System.out.printf("최대값 : %d, 최소값 : %d", max, min);
				
				
				//문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
				System.out.println();
				System.out.println("문제 5번");
				System.out.println("양의정수 10개를 입력하시오"); 
				
				int [] arr2 = new int[10];
				for(int i=1; i<=10; i++) {
					arr2[i-1] = scanner.nextInt();
				}
				for(int i=0; i<arr2.length; i++) {
					if(arr2[i]%3 == 0) {
						System.out.printf(arr2[i]+" ");
				}
				}
				
				//추가문제)
				// 문제1) 다음은 키보드로부터 학생수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램입니다.
				//		 실행결과를 보고, 알맞게 작성해보세요.
				//		 문제출처, 이것이 자바다 183페이지 9번
				System.out.println();
				System.out.println("추가문제");
				
				boolean run = true;
				int studentnum = 0;
				int[] scores = null;
				
				while(run) {
					System.out.println("---------------------------------------------");
					System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
					System.out.println("---------------------------------------------");
					System.out.println("선택 > ");
					
					int selectno = scanner.nextInt();
					
					if(selectno == 1) {
						System.out.println("학생수 > ");
						studentnum = scanner.nextInt();
						scores = new int[studentnum];
					}else if(selectno == 2) {
						for(int i=0; i<studentnum; i++) {
							System.out.println("scores[" +i+ "] : ");
							int score = scanner.nextInt();
							scores[i] = score;
						}
					}else if(selectno == 3) {
						for(int i=0; i<studentnum; i++) {
							System.out.println("scores[" +i+ "] : " + scores[i]);
						}
					}else if(selectno == 4) {
						int max1 = 0;
						int sum = 0;
						double avg = 0.0;
						
						for(int i=0; i<studentnum; i++) {
							sum += scores[i];
							if(scores[i] > max){
								max = scores[i];
							}
						}
						avg = (double) sum / studentnum;
						System.out.println("최고점수 : " + max);
						System.out.println("평균 점수 : " + avg);
					}else if(selectno == 5) {
						run = false;
					}
				}
				System.out.println("프로그램 종료");
		
	
	}
}

