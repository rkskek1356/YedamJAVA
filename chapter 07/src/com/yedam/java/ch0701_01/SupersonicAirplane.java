package com.yedam.java.ch0701_01;

public class SupersonicAirplane extends Airpalne {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행입니다.");
		}else {
			super.fly();
		}
	}
	
	

}
