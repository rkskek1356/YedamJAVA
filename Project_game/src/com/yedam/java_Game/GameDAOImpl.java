package com.yedam.java_Game;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.java_App.GameStartFrame;
import com.yedam.java_Common.DAO;

public class GameDAOImpl extends DAO implements GameDAO {
	
	private static GameDAO instance = new GameDAOImpl();
	private GameDAOImpl() {}
	public static GameDAO getInstatce() {
		return instance;
	}
	

	@Override
	public void createGame(Game game) {
		try {
			connect();
			String insert = "INSERT INTO game (player_id, player_pw, player_name) VALUES(?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, game.getPlayerId());
			pstmt.setString(2, game.getPlayerPw());
			pstmt.setString(3, game.getPlayerName());
			
			game.setPlayerPoint(0);
			
			game.setGameRcp(0);
			game.setGameOe(0);
			game.setGameTq(0);
			game.setGameBj(0);
			
			game.setWinRcp(0);
			game.setWinOe(0);
			game.setWinTq(0);
			game.setWinBj(0);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("== 회원가입이 완료되었습니다. ==");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}

	}

	
	
	@Override
	public void updatePoint(Game game) {
		try {
			connect();
			String update = "UPDATE game SET player_point = player_point + ? WHERE player_id = ?";
			pstmt = conn.prepareStatement(update);
			pstmt.setInt(1, game.getPlayerPoint());
			pstmt.setString(2, game.getPlayerId());
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}

	}

	@Override
	public void updateGame(Game game) {
		try {
			connect();
			String update = "UPDATE game SET game_rcp = ?, game_oe = ?, game_tq = ?, game_bj = ? , win_rcp = ?, win_oe = ?, win_tq = ?, win_bj = ? WHERE player_id = ? ";
			pstmt = conn.prepareStatement(update);
			
			pstmt.setInt(1, game.getGameRcp());
			pstmt.setInt(2, game.getGameOe());
			pstmt.setInt(3, game.getGameTq());
			pstmt.setInt(4, game.getGameBj());
			
			pstmt.setInt(5, game.getWinRcp());
			pstmt.setInt(6, game.getWinOe());
			pstmt.setInt(7, game.getWinTq());
			pstmt.setInt(8, game.getWinBj());
			
			pstmt.setString(9, game.getPlayerId());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("정상 처리되었습니다.");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}

	}
	@Override
	public void loginGame(Game game) {
		try {
			connect();
			String login = "SELECT player_pw FROM game WHERE player_id = ?";
			pstmt = conn.prepareStatement(login);
			pstmt.setString(1, game.getPlayerId());
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				if(rs.getString(1).contentEquals(game.getPlayerPw())) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}else {
				System.out.println("아이디가 존재하지않습니다.");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
	}
	@Override
	public void winGame(Game game) {
		try {
			connect();
			String win = "UPDATE game SET player_point = player_point + ? WHERE player_id=?";
			pstmt = conn.prepareStatement(win);
			pstmt.setInt(1, game.getPlayerPoint());
			pstmt.setString(2, game.getPlayerId());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("승리! 10점 획득하셨습니다.");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
	}
	@Override
	public void loseGame(Game game) {
		try {
			connect();
			String lose = "UPDATE game SET player_point = player_point + ? WHERE player_id=?";

			pstmt = conn.prepareStatement(lose);
			pstmt.setInt(1, game.getPlayerPoint());
			pstmt.setString(2, game.getPlayerId());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("패배! 5점 잃으셨습니다.");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
	}
	@Override
	public List<Game> selectAll() {
		List<Game> list = new ArrayList<>();
		try {
			connect();
			String select = "SELECT * FROM game ORDER BY player_id";
			pstmt = conn.prepareStatement(select);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Game game = new Game();
				game.setPlayerId(rs.getString("player_id"));
				game.setPlayerPoint(rs.getInt("player_point"));
				
				list.add(game);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}
	@Override
	public Game selectGameInfo(String player_id) {
		Game game = null;
		try {
			connect();
			String select = "SELECT * FROM game WHERE player_id = ?";
			pstmt = conn.prepareStatement(select);
			pstmt.setString(1, player_id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				game = new Game();
				game.setPlayerId(rs.getString("player_id"));
				game.setPlayerPw(rs.getString("player_pw"));
				game.setPlayerPoint(rs.getInt("player_point"));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return game;
	}

	

}
