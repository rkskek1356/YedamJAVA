package com.yedam.java.List;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class MainExample {

	public static void main(String[] args) {
		
		
		// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		//	출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.

		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		List<Menu> menu = new ArrayList<Menu>();
		
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.상품 및 가격입력 | 2.제품별 가격 | 3.분석 | 4.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택 > ");
			int menuNo = scanner.nextInt();
			
			switch(menuNo) {
			case 1:
				System.out.println("상품 및 가격입력 > ");
				menu.add(new Menu(scanner.next(), scanner.nextInt()));
				break;
		
			case 2:
				for(int i=0; i<menu.size(); i++){
					String name = menu.get(i).getName();
					int price = menu.get(i).getPrice();
					System.out.println(name + " : " + price + "원");
				}
				break;
		
			case 3:
				int max = 0;
				for(int i=0; i<menu.size(); i++) {
					
					if(max < menu.get(i).getPrice()) {
						max = menu.get(i).getPrice();
					}
				} //최고가격 구하기
		
				String name = null;
				
				int sum = 0;
				
				for(int i=0; i<menu.size(); i++) {
					if(max == menu.get(i).getPrice()) {
						name = menu.get(i).getName();
						continue;
					}
					sum += menu.get(i).getPrice();
				} // 최고가격을 제외한총합 구하기
		
				System.out.println("최고 가격을 가진 제품은 " +name+ "입니다.");
				System.out.println("최고 가격을 제외한 제품의 총합은 " +sum+ "입니다.");
				break;
		
			case 4:
				run = false;
				System.out.println("프로그램 종료");			
				break;
				
				default :
					System.out.println("다시 선택하세요");
					
	}
	
}

}

}
