package com.yedam.java_Game;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.java_App.GameStartFrame;
import com.yedam.java_Common.DAO;

public class GameDAOImpl extends DAO implements GameDAO {

	private static GameDAO instance = new GameDAOImpl();

	private GameDAOImpl() {
	}

	public static GameDAO getInstatce() {
		return instance;
	}

	@Override
	public void createGame(Game game) {
		try {
			connect();
			String insert = "INSERT INTO game VALUES(?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, game.getPlayerId());
			pstmt.setString(2, game.getPlayerPw());
			pstmt.setInt(3, 0);
			pstmt.setInt(4, 0);
			pstmt.setInt(5, 0);
			pstmt.setInt(6, 0);
			pstmt.setInt(7, 0);
			pstmt.setInt(8, 0);
			pstmt.setInt(9, 0);
			pstmt.setInt(10, 0);
			pstmt.setInt(11, 0);

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("== 회원가입이 완료되었습니다. ==");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public void updatePoint(Game game) {
		try {
			connect();
			String update = "UPDATE game SET player_point = ?,game_rcp=?, game_oe=?, game_tq=?, game_bj=?, win_rcp=?, win_oe=?, win_tq=?, win_bj=?  WHERE player_id = ? ";
			pstmt = conn.prepareStatement(update);
			pstmt.setInt(1, game.getPlayerPoint());
			pstmt.setInt(2, game.getGameRcp());
			pstmt.setInt(3, game.getGameOe());
			pstmt.setInt(4, game.getGameTq());
			pstmt.setInt(5, game.getGameBj());
			pstmt.setInt(6, game.getWinRcp());
			pstmt.setInt(7, game.getWinOe());
			pstmt.setInt(8, game.getWinTq());
			pstmt.setInt(9, game.getWinBj());
			pstmt.setString(10, game.getPlayerId());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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

			if (rs.next()) {
				if (rs.getString(1).contentEquals(game.getPlayerPw())) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			} else {
				System.out.println("아이디가 존재하지않습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public List<Game> selectAll() {
		List<Game> list = new ArrayList<>();
		try {
			connect();
			String select = "SELECT * FROM game ORDER BY player_point DESC";
			pstmt = conn.prepareStatement(select);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Game game = new Game();
				game.setPlayerId(rs.getString("player_id"));
				game.setPlayerPoint(rs.getInt("player_point"));

				list.add(game);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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

			if (rs.next()) {
				game = new Game();
				game.setPlayerId(rs.getString("player_id"));
				game.setPlayerPw(rs.getString("player_pw"));
				game.setPlayerPoint(rs.getInt("player_point"));
				game.setGameRcp(rs.getInt("game_rcp"));
				game.setGameOe(rs.getInt("game_oe"));
				game.setGameTq(rs.getInt("game_tq"));
				game.setGameBj(rs.getInt("game_bj"));
				game.setWinRcp(rs.getInt("win_rcp"));
				game.setWinOe(rs.getInt("win_oe"));
				game.setWinTq(rs.getInt("win_tq"));
				game.setWinBj(rs.getInt("win_bj"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return game;
	
	
}
}
