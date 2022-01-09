package com.yedam.java.Quiz02;

public class StudentScores {
	
	private String name;
	private int grade;
	private int Korean;
	private int English;
	private int Math;
	
	int Total;
	double avg = 0;
	
	
	StudentScores(String name, int grade){
		this.name = name;
		this.grade = grade;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public int getKorean() {
		return Korean;
	}


	public void setKorean(int korean) {
		System.out.println("국어점수는 " +korean+ "입니다.");
		Korean = korean;
	}


	public int getEnglish() {
		return English;
	}


	public void setEnglish(int english) {
		System.out.println("영어점수는 " +english+ "입니다.");
		English = english;
	}


	public int getMath() {
		return Math;
	}


	public void setMath(int math) {
		System.out.println("수학점수는 " +math+ "입니다.");
		Math = math;
	}

	
	
	
	
	
	
	
	
	
	
	
	public int getTotal() {
//		Total = Korean + English + Math;
//		
//		return Total;
		
		return Korean + English + Math;
	}
	public double getAverage() {
//		avg = Total / 3.0;
//		return avg;
		
		return (double)getTotal() / 3;
	}

	
	
	

}
