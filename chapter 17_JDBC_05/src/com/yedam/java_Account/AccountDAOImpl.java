package com.yedam.java_Account;

import java.sql.SQLException;

import com.yedam.java_Common.DAO;

public class AccountDAOImpl extends DAO implements AccountDAO {
	
	private static AccountDAO instance = new AccountDAOImpl();
	private AccountDAOImpl() {}
	public static AccountDAO getInstace() {
		return instance;
	}
	
	@Override
	public void insert(Account acc) {
		try {
			connect();
			String insert = "INSERT INTO account VALUES(?,?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setInt(1, acc.getAccountNo());
			pstmt.setString(2, acc.getAccountOwner());
			pstmt.setString(3, acc.getAccountPassword());
			pstmt.setInt(4, acc.getAccountBalance());
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "건의 회원가입이 완료되었습니다.");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
	}

	@Override
	public Account login(int accountNo) {
		Account acc = null;
		try {
			connect();
			String login = "SELECT * FROM account WHERE account_no = ?";
			if(login.equals(pstmt)) {
			pstmt = conn.prepareStatement(login);
			pstmt.setInt(1, accountNo);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				acc = new Account();
				acc.setAccountNo(rs.getInt("account_no"));
				acc.setAccountOwner(rs.getString("account_owner"));
				acc.setAccountBalance(rs.getInt("account_balance"));
			}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return acc;
	}

	@Override
	public void remit(Account acc) {
		try {
			connect();
			String remit = "UPDATE account SET account_balance = ? WHERE account_no = ?";
			pstmt = conn.prepareStatement(remit);
			pstmt.setInt(1, acc.getAccountBalance());
			pstmt.setInt(2, acc.getAccountNo());
			
			int result = acc.getAccountBalance();
			System.out.println(result + "수정되었습니다.");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			disconnect();
		}
	}

	@Override
	public void deposit(Account acc) {
		try {
			connect();
			String remit = "UPDATE acoount SET account_balance = ? WHERE acoount_no = ?";
			if(pstmt.equals(remit)) {
				pstmt = conn.prepareStatement(remit);
				pstmt.setInt(1, acc.getAccountBalance());
				pstmt.setInt(2, acc.getAccountNo());
			}else {
				System.out.println("없음");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
	}

	@Override
	public void balance(int accountNo) {
		Account acc = null;
		try {
			connect();
			String login = "SELECT * FROM account WHERE account_no = ?";
			if(login.equals(pstmt)) {
			pstmt = conn.prepareStatement(login);
			pstmt.setInt(1, accountNo);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				acc = new Account();
				acc.setAccountNo(rs.getInt("account_no"));
				acc.setAccountBalance(rs.getInt("account_balance"));
			}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
	}
	
	public void disconnect() {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}catch(SQLException e) {
			System.out.println("자원이 정상적으로 해제되지 못했습니다.");
		}
	}


}
