package com.yedam.java.Quiz_homework;

public class Book {
	
	private String bookname;
	private String name;
	private int number;
	
	


	public Book(String bookname, String name) {
		this.bookname = bookname;
		this.name = name;
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
	

}
