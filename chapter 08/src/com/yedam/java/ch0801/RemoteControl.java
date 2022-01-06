package com.yedam.java.ch0801;

public interface RemoteControl {
	
	//상수
	public final static int MAX_VALUME = 10;
	public int MIN_VALUME = 0;
	
	
	//추상 메소드
	public abstract void turnOn();
	public void turnOff();
	public void setVolume(int volume);

}
