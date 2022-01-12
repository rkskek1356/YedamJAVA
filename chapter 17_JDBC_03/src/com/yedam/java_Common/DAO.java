package com.yedam.java_Common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.yedam.java_Employee.Employee;

public class DAO {
	
		//Sqlite 연결정보
		private String jdbc_driver = "org.sqlite.JDBC";
		private String jdbc_url = "jdbc:sqlite:/c:/DEV/workspace/YedamDataBase.db";
		
		//각 메소드에서 공통적으로 사용하는 필드
		protected Connection conn = null;
		protected PreparedStatement pstmt = null;
		protected ResultSet rs = null;
		
		
		//JDBC Driver 로딩
		//DB 서버 접속
		// -> connect() 메소드
		public void connect() {
			try {
				Class.forName(jdbc_driver);
				
				conn = DriverManager.getConnection(jdbc_url);
			} catch (ClassNotFoundException e) {
				System.out.println("JDBC Driver 로딩 실패");
			} catch (SQLException e) {
				System.out.println("DB 접속 실패");
			}
			
		}


		public List<Employee> selectAll() {
			// TODO Auto-generated method stub
			return null;
		}
}
