package com.yedam.java.ch0701_01;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNO) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
	

}
