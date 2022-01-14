package com.yedam.java_App;

import java.util.Scanner;

import com.yedam.java_Game.Game;
import com.yedam.java_Game.GameDAO;
import com.yedam.java_Game.GameDAOImpl;

public class GameFrame {
	
	private Scanner sc = new Scanner(System.in);
	private GameDAO dao = GameDAOImpl.getInstatce();
	
	public GameFrame() {
		//첫 메뉴 회원가입과 로그인화면 출력
		while(true) {		
			//메뉴 출력
			menuPrint();
			//메뉴 선택
			int menuNo = menuSelect();
			//각 메뉴별 실행
			if(menuNo == 1) {
				//회원가입
				create();
			}else if(menuNo == 2) {
				loginGameId();
			}
		}
	}
	
	public static void menuPrint() {
		System.out.println();
		System.out.println("==================");
		System.out.println("1.회원가입 | 2.로그인");
		System.out.println("==================");
		System.out.print("선택 > ");
	}
	
	public int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		}catch(Exception e) {
			System.out.println("없는 선택지입니다.");
		}
		return menuNo;
	}
	
	public void create() {
		Game game = insertGameId();
		
		dao.createGame(game);
	}
	
	public Game insertGameId() {
		Game game = new Game();
		System.out.print("아이디 > ");
		game.setPlayerId(sc.nextLine());
		System.out.print("비밀번호 > ");
		game.setPlayerPw(sc.nextLine());
		System.out.print("닉네임 > ");
		game.setPlayerName(sc.nextLine());
		return game;
	}
	
	public void loginGameId() {
		Game game = 
		
	}
	


}