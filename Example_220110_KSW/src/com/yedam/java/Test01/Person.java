package com.yedam.java.Test01;

public class Person {
	//필드
	private int ssn;
	private String name;
	private String address;
	
	
	public Person(int ssn, String name, String address) {
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}
	
	
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	

}
