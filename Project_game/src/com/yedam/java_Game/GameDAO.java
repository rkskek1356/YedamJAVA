package com.yedam.java_Game;

public interface GameDAO {
	
	//회원가입 
	public void createGame(Game game);
	
	//점수조회
	public Game selectGameInfo(String playerId);
	
	//점수수정
	public void updatePoint(Game game);
	
	//게임판수 수정
	public void updateGame(Game game);
	
	

}
