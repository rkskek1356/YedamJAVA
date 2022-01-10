package com.yedam.java.Test04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		List<Schedule> schedule = new ArrayList<Schedule>();
		
		while(run) {
			System.out.println("=== 1.할일입력 | 2.전체조회 | 3.할일조회 | 4.할일완료 | 5.종료 ===");
			System.out.print("선택 > ");
			int menuNo = sc.nextInt();
			
			switch(menuNo){
			case 1:
				System.out.print("할일 > ");
				schedule.add(new Schedule(sc.next()));
				System.out.println();
				break;
				
			case 2:
				for(int i=0; i<schedule.size(); i++) {
					String duty = schedule.get(i).getDuty();
					int num = schedule.get(i).getNum();
					String state = schedule.get(i).getState();
					
					System.out.println(num + "번 " +duty+ " " + state);
					
				}
				break;
				
			case 3:
				for(int i=0; i<schedule.size(); i++) {
					if(schedule.get(i).getBorrow() == 1) {
						String duty = schedule.get(i).getDuty();
						int num = schedule.get(i).getNum();
						String state = schedule.get(i).getState();
						
						System.out.println(num + "번 " +duty+ " " + state);
					}
				}
				break;
			case 4:
				System.out.println("완료할 할 일을 선택해주세요");
				int scheduleNum = sc.nextInt();
				for(int i=0; i<schedule.size(); i++) {
					if((scheduleNum == schedule.get(i).getNum()) && (schedule.get(i).getBorrow() == 1)) {
					System.out.println("해당 할일을 완료처리하였습니다.");
					schedule.get(i).setBorrow(0);
					}else if((scheduleNum == schedule.get(i).getNum()) && (schedule.get(i).getBorrow() == 0)) {
						System.out.println("해당 할 일은 이미 완료되었습니다.");
					}
				}
				break;
			case 5:
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
