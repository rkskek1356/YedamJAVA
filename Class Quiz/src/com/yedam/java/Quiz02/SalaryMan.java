package com.yedam.java.Quiz02;

public class SalaryMan {
	
	private int salary;
	
	
	SalaryMan(){
		salary = 1000000;
	} // salary는 1000000을 가지고있음 초기값
	
	SalaryMan(int salary){
		this.salary = salary;
	}
	
	
	
	
	int getAnnualGross() {
		salary = (salary * 12) + (salary * 5);
		return salary;
	}	

}
