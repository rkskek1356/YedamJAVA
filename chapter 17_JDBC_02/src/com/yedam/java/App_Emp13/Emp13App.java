package com.yedam.java.App_Emp13;

import java.util.List;
import java.util.Scanner;

public class Emp13App {

	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		Emp13DAO dao = Emp13DAO.getInstance();
		
		Emp13 emp = null;
		int employeeId = 0;
		
		while(run) {
			System.out.println();
			System.out.println("=== 1.등록 | 2.수정 | 3.삭제 | 4.부서조회 | 5.전체조회 | 6.종료 ===");
			System.out.print("선택 > ");
			int menuNo = Integer.parseInt(sc.nextLine());
			
			switch(menuNo) {
			case 1:
				emp = new Emp13();
				System.out.println("사번 > ");
				emp.setEmployeeId(Integer.parseInt(sc.nextLine()));
				System.out.println("이름 > ");
				emp.setFirstName(sc.nextLine());
				System.out.println("직급 > ");
				emp.setJobId(sc.nextLine());
				System.out.println("연봉 > ");
				emp.setSalary(Integer.parseInt(sc.nextLine()));
				System.out.println("상여 > ");
				emp.setCommissionPct(sc.nextLine());
				System.out.println("직종 > ");
				emp.setDepartmentName(sc.nextLine());
				System.out.println("지역번호 > ");
				emp.setLocationId(Integer.parseInt(sc.nextLine()));
				
				dao.insert(emp);
				break;
			
			case 2:
				emp = new Emp13();
				System.out.println("사번 > ");
				emp.setEmployeeId(Integer.parseInt(sc.nextLine()));
				System.out.println("연봉 > ");
				emp.setSalary(Integer.parseInt(sc.nextLine()));
				
				dao.update(emp);
				break;
				
			case 3:
				System.out.print("사번 > ");
				employeeId = Integer.parseInt(sc.nextLine());
				break;
				
			case 4:
				System.out.print("사번 > ");
				employeeId = Integer.parseInt(sc.nextLine());
				emp = dao.selectOne(employeeId);
				System.out.println(emp);
				break;
				
			case 5:
				List<Emp13> list = dao.selectAll();
				for(Emp13 emp13 : list) {
					System.out.println(emp13);
				}
				break;
				
			case 6:
				run = false;
				System.out.println("프로그램 종료");
				break;
				
			default:
				System.out.println("다시선택하시오");
				break;
			}
		}

	}

}
