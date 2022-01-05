package com.yedam.java.example;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		
			
		int[] arr1 = {10, 20, 30, 50, 3, 60, -5};
		
		//예제 1 - 주어진 배열 안의 값을 전부 더하고 합과 평균을 출력하시오
		int sum = 0;
		
		for(int i=0; i<arr1.length; i++) {
			sum += arr1[i];
		}
		System.out.println("총 합 : " + sum);
		
		double avg = (double)sum / arr1.length;
		System.out.println("평균 : " + avg);
		
		//예제 2 - 주어진 배열 안의 값을 출력하는데 인덱스가 2의 배수인 경우에만 출력한다.
		
		for(int i=0; i<arr1.length; i+=2) {
				System.out.printf("arr1[%d] = %d\n",i,arr1[i]);
		}
		
		
		//문제 2 교수님 풀이
//		for(int i=0; i<arr1.length; i++) {
//			if(i%2 == 0) {
//				System.out.println(arr1[i]);
//			}
//		}
		
		
		//예제 3 - 인덱스번호 2개를 입력받아, 그 값을 서로 바꿔보시오
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("인덱스 번호를 고르시오 0~6 : ");
		int index1 = Integer.parseInt(scanner.nextLine());
		
		System.out.print("인덱스 번호를 고르시오 0~6 : ");
		int index2 = Integer.parseInt(scanner.nextLine());
		
		
		int temp = arr1[index1];  // 변수 temp를 새로 만들어서 arr1[index1]을 복사
		arr1[index1] = arr1[index2]; // index1을 index2로 바꿈
		arr1[index2] = temp; // 저장해둔 index1을 끌고와서 index2로 바꿈
		
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

	}

}
