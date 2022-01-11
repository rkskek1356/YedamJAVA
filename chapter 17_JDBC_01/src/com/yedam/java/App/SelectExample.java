package com.yedam.java.App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//1. JDBC Driver 로딩
		Class.forName("org.sqlite.JDBC");
		
		//2. DB서버 접속
		String url = "jdbc:sqlite:/c:/DEV/workspace/YedamDataBase.db";
		Connection conn = DriverManager.getConnection(url);
		
		//3. Statement or PreparedStatement 객체생성
		Statement stmt = conn.createStatement();
		
		//4. SQL 실행
		String select = "SELECT * FROM employees";
		ResultSet rs = stmt.executeQuery(select);
		
		//5. 결과값 출력 or 연산
		while(rs.next()) {
			String name = "이름 : " + rs.getString("first_name") + " " + rs.getString("last_name");
			
			System.out.println(name);
		}
		
		//6. 자원해제하기
		if(rs != null) rs.close();
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();

	}

}
