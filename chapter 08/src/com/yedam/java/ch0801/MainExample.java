package com.yedam.java.ch0801;

public class MainExample {

	public static void main(String[] args) {
		
		RemoteControl rc1;
		rc1 = new Television();
		rc1.turnOn();
		rc1 = new Audio();
		rc1.turnOff();
		
		SmartTelevision tv = new SmartTelevision();
		RemoteControl rc = tv;
		rc.turnOff();
		Searchable searchable = tv;
		searchable.search("naver");
		
		System.out.println();
		
		System.out.println("1)--------------------------");
		Myclass myClass1 = new Myclass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		System.out.println("2)--------------------------");
		Myclass myClass2 = new Myclass(new Audio());
		
		System.out.println("3)--------------------------");
		Myclass myClass3 = new Myclass();
		myClass3.methodA();
		
		System.out.println("4)--------------------------");
		Myclass myClass4 = new Myclass();
		myClass4.methodB(new Television());
		
		
	}

}
