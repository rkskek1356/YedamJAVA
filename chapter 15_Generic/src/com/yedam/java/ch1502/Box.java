package com.yedam.java.ch1502;

public class Box<T> { //< > 안에있는 문자는 제네릭타입
	
	private T t;
	
	
	public void set(T t) {
		this.t = t;
	}
	
	
	public T get() {
		return t;
	}
	
}
