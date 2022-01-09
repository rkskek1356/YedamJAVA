package com.yedam.java.Quiz_homework;

public class Book {
	
	private static int serialNum = 0;
	
	private String bookname;
	private String serchbook;
	private String state;
	private String name;
	
	private int booknum;
	private int number;
	private int borrow = 0;
	



	
	
	public String getSerchbook() {
		return serchbook;
	}
	public void setSerchbook(String serchbook) {
		this.serchbook = serchbook;
	}


	public Book(String bookname, String name) {
		serialNum++;
		booknum = serialNum;
		borrow++;
		
		this.bookname = bookname;
		this.name = name;
	}
	
	public String getState() {
		   if(borrow == 1) {
		      state = ("대여가능");
		   }else if(borrow == 0){
			  state = ("대여불가");
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


	public String getBookname() {
		
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}


	public static int getSerialNum() {
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Book.serialNum = serialNum;
	}


	public int getBooknum() {
		return booknum;
	}
	public void setBooknum(int booknum) {
		this.booknum = booknum;
	}
	

}
