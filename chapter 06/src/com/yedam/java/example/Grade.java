package com.yedam.java.example;

public class Grade {
	
	int math = 0;
	int science = 0;
	int english = 0;
	
	
	Grade(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	double average() {
		double avg = 0;
		avg = (math + science + english) / 3;
		return avg;
	}

}
