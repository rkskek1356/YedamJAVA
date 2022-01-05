package com.yedam.java.ch0701_01;

public class DmbCellPhone extends CellPhone{
	
	//필드
	
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel){
		super();
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 " +channel+ "번으로 바꿉니다.");
	}
	
	void changeChannalDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " +channel+ "번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}

}
