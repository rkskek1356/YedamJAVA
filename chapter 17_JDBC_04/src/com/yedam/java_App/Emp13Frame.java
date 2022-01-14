package com.yedam.java_App;

import java.util.List;
import java.util.Scanner;

import com.yedam.java_Emp13.Emp13;
import com.yedam.java_Emp13.Emp13DAO;
import com.yedam.java_Emp13.Emp13DAOImpl;

public class Emp13Frame {
	private Emp13DAO empDAO = Emp13DAOImpl.getInstance();
	private Scanner sc = new Scanner(System.in);
	
	public Emp13Frame() {
		while(true) {
			//메뉴 출력
			menuPrint();
			
			int menuNo = menuSelect();
			
			//메뉴 선택
			if(menuNo == 1) {
				insertEmp13();
			}else if(menuNo == 2) {
				updateEmp13();
			}else if(menuNo == 3) {
				deleteEmp13();
			}else if(menuNo == 4) {
				selectOne();
			}else if(menuNo == 5) {
				selectAll();
			}else if(menuNo == 6) {
				end();
				break;
			}
		}
	}
	
	public void menuPrint() {
		System.out.println();
		System.out.println("=== 1.등룍 | 2.수정 | 3.삭제 | 4.단건조회 | 5.전체조회 | 6.종료 ===");
		System.out.print("선택 > ");
	}
	
	public int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		}catch(Exception e) {
			System.out.println("없는 번호입니다.");
		}
		return menuNo;
	}
	
	public void insertEmp13() {
		Emp13 emp = inputEmpInfo();
		
		empDAO.insert(emp);
	}
	
	public void updateEmp13() {
		Emp13 emp = inputEmpName();
		
		empDAO.update(emp);
	}
	public void deleteEmp13() {
		int employeeId = inputEmpId();
		
		empDAO.delete(employeeId);
	}
	public void selectOne() {
		int employeeId = inputEmpId();
		Emp13 emp = empDAO.selectOne(employeeId);
		
		if(emp == null) {
			System.out.println("해당 정보가 없습니다.");
		}else {
			System.out.println(emp);
		}		
	}
	public void selectAll() {
		List<Emp13> list = empDAO.selectAll();
		for(Emp13 emp : list) {
			System.out.println(emp);
		}
	}
	public void end() {
		System.out.println("프로그램 종료");
	}
	
	public Emp13 inputEmpInfo() {
		Emp13 emp = new Emp13();
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
		
		return emp;
	}
	
	public Emp13 inputEmpName() {
		Emp13 emp = new Emp13();
		System.out.println("사번 > ");
		emp.setEmployeeId(Integer.parseInt(sc.nextLine()));
		System.out.println("연봉 > ");
		emp.setSalary(Integer.parseInt(sc.nextLine()));
		return emp;
	}
	
	public int inputEmpId() {
		int empId = 0;
		System.out.println("사번 > ");
		empId = Integer.parseInt(sc.next());
		return empId;
	}
}
