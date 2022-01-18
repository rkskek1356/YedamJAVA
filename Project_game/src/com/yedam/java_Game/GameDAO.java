package com.yedam.java_Game;

import java.util.List;

public interface GameDAO {

	// 회원가입
	public void createGame(Game game);

	// 점수조회
	public List<Game> selectAll();

	// 점수수정
	public void updatePoint(Game game);

	// 로그인
	public void loginGame(Game game);

	// 조회
	public Game selectGameInfo(String plyer_id);

}
