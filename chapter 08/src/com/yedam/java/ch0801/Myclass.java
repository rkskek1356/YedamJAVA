package com.yedam.java.ch0801;

import java.rmi.Remote;

public class Myclass {
	
	//필드
	RemoteControl rc = new Television();
		
	
	//생성자
	public Myclass(Audio audio) {
		// TODO Auto-generated constructor stub
	}

	Myclass(){}
	
	Myclass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//메소드

	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
