package com.yedam.java.ProQuiz;


public class Book {
	//필드
		private static int serialNum = 0;
		
		private int bookNo;             //책번호
		private String bookName;    	//책이름
		private String bookWriter;	    //저자명
		private boolean rental;  	  	//대여여부
		
		
		Book(String bookName, String bookWriter) {
			serialNum++;
			this.bookNo = serialNum;
			this.bookName = bookName;
			this.bookWriter = bookWriter;
			this.rental = false;
		}
		
		public static int getSerialNum() {
			return serialNum;
		}
		public static void setSerialNum(int serialNum) {
			Book.serialNum = serialNum;
		}
		public int getBookNo() {
			return bookNo;
		}
		public void setBookNo(int bookNo) {
			this.bookNo = bookNo;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getBookWriter() {
			return bookWriter;
		}
		public void setBookWriter(String bookWriter) {
			this.bookWriter = bookWriter;
		}
		public boolean isRental() {
			return rental;
		}
		public void setRental(boolean rental) {
			this.rental = rental;
		}
		
		//책번호
		
		//책이름
		
		//저자명
		
		//대여여부

}
