package com.yedam.java.Test04;

public class Schedule {
	
	private static int serialNum = 0;
	private String duty;
	private String state;
	private int borrow = 0;
	private int num;
	
	public static int getSerialNum() {
		return serialNum;
	}


	public static void setSerialNum(int serialNum) {
		Schedule.serialNum = serialNum;
	}


	public Schedule(String duty) {
		serialNum++;
		num = serialNum;
		this.duty = duty;
		borrow++;
	}
	

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getState() {
		 if(borrow == 1) {
		      state = ("미완료");
		   }else if(borrow == 0){
			  state = ("완료");
		   }
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getBorrow() {
		return borrow;
	}

	public void setBorrow(int borrow) {
		this.borrow = borrow;
	}
	
	
	

}
