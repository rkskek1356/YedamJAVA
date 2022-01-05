package com.yedam.java.package03;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.setspeed(-50);
		
		System.out.println("현재속도 : " + myCar.getSpeed());
		
		myCar.setspeed(60);
		
		System.out.println("현재속도 : " + myCar.getSpeed());
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재속도 : " + myCar.getSpeed());

	}

}
