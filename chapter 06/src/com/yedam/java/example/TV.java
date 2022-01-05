package com.yedam.java.example;

public class TV {
	
	TV(String Color, int inch){}
	
	
	String company = "";
	int year = 0;
	int inch = 0;
	
	
	TV(String company, int year, int inch){
		this.company = company;
		this.year = year;
		this.inch = inch;
	}
	
	void showInfo() {
		System.out.println(company+"에서만든 " +year+ "년형 " +inch+ "인치 TV");
	}

}
