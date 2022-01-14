package com.yedam.java_App;

import java.util.List;
import java.util.Scanner;

import com.yedam.java_Book.Book;
import com.yedam.java_Book.BookDAO;
import com.yedam.java_Book.BookDAOImpl;

public class BookFrame {
	
	private Scanner sc = new Scanner(System.in);
	private BookDAO dao = BookDAOImpl.getInstance();
	
	public BookFrame() {
		while(true) {
			//메뉴 출력
			menuPrint();
			
			//메뉴 선택
			int menuNo = menuSelect();
			
			//각 메뉴별 실행
			if(menuNo == 1) {
				//전체조회
				selectBookList();
			}else if(menuNo == 2) {
				//단건조회
				selectBookInfo();
			}else if(menuNo == 3) {
				//내용검색
				selectSerchBookList();
			}else if(menuNo == 4) {
				//대여가능
				selectRentalBookList();
			}else if(menuNo == 5) {
				//책 대여
				rentalBook();
			}else if(menuNo == 6) {
				//책 반납
				returnBook();
			}else if(menuNo == 7) {
				//책 등록
				insertBookInfo();
			}else if(menuNo == 9) {
				//종료
				end();
				break;
			}
		}
	}
	


	public void menuPrint() {
		System.out.println("================================================================================");
		System.out.println("1.전체조회 | 2.단건조회 | 3.내용검색 | 4.대여가능 | 5.책 대여 | 6.책 반납 | 7.책 등록 | 9.종료");
		System.out.println("================================================================================");
		System.out.print("선택 > ");
	}
	
	public int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine()); //nextLine은 공백포함해서 받음
		}catch(Exception e) {
			System.out.println("없는 메뉴입니다.");
		}
		return menuNo;
	}
	
	public void end() {
		System.out.println("프로그램 종료");
	}
	

	
	public void insertBookInfo() {
		//책 정보 입력
		Book book = inputBookInfo();
		//책 정보 등록
		dao.insert(book);
	}
	
	public void rentalBook() {
		//책 제목 입력
		String bookName = inputBookName();
		//해당 책 정보 조회
		Book book = dao.selectBook(bookName);
		//대여여부 확인
		if(book != null) {
			if(book.getBookRental() == 1) {
				//대여가 된 경우 별도 안내문구
				System.out.println("해당 책은 대여중입니다.");
			}else {
				//대여가 안된 경우 대여처리
				book.setBookRental(1);
				dao.update(book);
			}
		}else {
			System.out.println("해당되는 정보가 존재하지않습니다.");
		}
	}
	
	public void returnBook() {
		//책 제목 입력
		String bookName = inputBookName();
		//해당 책 정보확인
		Book book = dao.selectBook(bookName);
		
		if(book != null) {
			//반납처리
			book.setBookRental(0);
			dao.update(book);
		}else {
			System.out.println("해당하는 정보가 존재하지 않습니다.");
		}
	}
	
	public void selectBookList() {
		List<Book> list = dao.selectAll();
		for(Book book : list) {
			System.out.println(book);
		}
	}
	
	public void selectBookInfo() {
		//책 제목 입력
		String bookName = inputBookName();
		
		Book book = dao.selectBook(bookName);
		
		if(book != null) {
			System.out.println(book);
		}else {
			System.out.println("해당하는 정보가 존재하지 않습니다.");
		}
	}
	
	public void selectSerchBookList() {
		String keyword = inputBookkeyword();
		
		List<Book> list = dao.selectAll();
		
		for(Book book : list) {
			if(book.getBookContent().indexOf(keyword) != -1) {
				System.out.println(book);
			}
		}
	}
	
	public void selectRentalBookList() {
		List<Book> list = dao.selectAll();
		
		for(Book book : list) {
			if(book.getBookRental() == 0) {
				System.out.println(book);
			}
		}
	}
	
	public Book inputBookInfo() {
		Book book = new Book();
		System.out.print("책 제목 > ");
		book.setBookName(sc.nextLine());
		System.out.print("저자명 > ");
		book.setBookWriter(sc.nextLine());
		System.out.print("책 내용> ");
		book.setBookContent(sc.nextLine());
		return book;
	}
	
	public String inputBookName() {
		System.out.print("책 제목 > ");
		return sc.nextLine();
	}
	
	public String inputBookkeyword() {
		System.out.print("검색 > ");
		return sc.nextLine();
	}
	
}

