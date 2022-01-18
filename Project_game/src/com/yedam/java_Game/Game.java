package com.yedam.java_Game;

public class Game {
	private String playerId; // 아이디
	private String playerPw; // 패스워드
	private int playerPoint; // 점수

	private int gameRcp; // 가위바위보 게임수
	private int gameOe; // 홀짝 게임수
	private int gameTq; // 스무고개 게임수
	private int gameBj; // 블랙잭 게임수 -> 시간되면

	private int winRcp; // 가위바위보 승리수
	private int winOe; // 홀짝 승리수
	private int winTq; // 스무고개 승리수
	private int winBj; // 블랙잭 승리수

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getPlayerPw() {
		return playerPw;
	}

	public void setPlayerPw(String playerPw) {
		this.playerPw = playerPw;
	}

	public int getPlayerPoint() {
		return playerPoint;
	}

	public void setPlayerPoint(int playerPoint) {
		this.playerPoint = playerPoint;
	}

	public int getGameRcp() {
		return gameRcp;
	}

	public void setGameRcp(int gameRcp) {
		this.gameRcp = gameRcp;
	}

	public int getGameOe() {
		return gameOe;
	}

	public void setGameOe(int gameOe) {
		this.gameOe = gameOe;
	}

	public int getGameTq() {
		return gameTq;
	}

	public void setGameTq(int gameTq) {
		this.gameTq = gameTq;
	}

	public int getGameBj() {
		return gameBj;
	}

	public void setGameBj(int gameBj) {
		this.gameBj = gameBj;
	}

	public int getWinRcp() {
		return winRcp;
	}

	public void setWinRcp(int winRcp) {
		this.winRcp = winRcp;
	}

	public int getWinOe() {
		return winOe;
	}

	public void setWinOe(int winOe) {
		this.winOe = winOe;
	}

	public int getWinTq() {
		return winTq;
	}

	public void setWinTq(int winTq) {
		this.winTq = winTq;
	}

	public int getWinBj() {
		return winBj;
	}

	public void setWinBj(int winBj) {
		this.winBj = winBj;
	}

	@Override
	public String toString() {
		return "아이디 : " + playerId + "\t점수 : " + playerPoint;
	}

}
