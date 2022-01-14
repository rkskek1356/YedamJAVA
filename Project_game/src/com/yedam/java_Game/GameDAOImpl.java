package com.yedam.java_Game;

import java.sql.SQLException;

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
	public Game selectGameInfo(String playerId) {
		Game game = null;
		try {
			connect();
			String select = "SELECT * FROM game WHERE player_id = ?";
			pstmt = conn.prepareStatement(select);
			pstmt.setString(1, playerId);
			
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

	
	@Override
	public void updatePoint(Game game) {
		try {
			connect();
			String update = "UPDATE game SET player_point = player_point + ? WHERE player_id = ?";
			pstmt = conn.prepareStatement(update);
			pstmt.setInt(1, game.getPlayerPoint());
			pstmt.setString(2, game.getPlayerId());
			
			int result = game.getPlayerPoint();
			
			if(result > 0) {
				System.out.println("승점 10점 획득");
			}else {
				System.out.println("5점 잃으셨습니다.");
			}
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

}
