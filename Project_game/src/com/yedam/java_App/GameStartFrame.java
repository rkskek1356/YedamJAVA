package com.yedam.java_App;

import java.net.ConnectException;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Scanner;

import com.yedam.java_Game.Game;
import com.yedam.java_Game.GameDAO;
import com.yedam.java_Game.GameDAOImpl;

public class GameStartFrame{
	
	private Scanner sc = new Scanner(System.in);
	private GameDAO dao = GameDAOImpl.getInstatce();
	
	public void run(Game login) {
		System.out.println(login); //로그인되면서 점수를 보여줌
		
		while(true) {
			
			menuPrint(); // 메뉴출력
			
			int menuNo = menuSelect(); //메뉴선택
			
			if(menuNo == 1) {
				int rcp = 0;

				int num = (int)(Math.random()*3)+1;
				System.out.println("1.가위 | 2.바위 | 3.보 > ");
				rcp = sc.nextInt();
				if(num == rcp) {
					System.out.println("비겼습니다!");
				}else if((num == 1) && (rcp == 2)) {
					System.out.println("이겼습니다!");
					win();
				}else if((num == 1) && (rcp == 3)) {
					System.out.println("졌습니다.");
					lose();
				}else if((num == 2) && (rcp == 1)) {
					System.out.println("졌습니다.");
					lose();
				}else if((num == 2) && (rcp == 3)) {
					System.out.println("이겼습니다!");
					win();
				}else if((num == 3) && (rcp == 1)) {
					System.out.println("이겼습니다!");
					win();
				}else if((num == 3) && (rcp == 2)) {
					System.out.println("졌습니다.");
					lose();
				}
			}else if(menuNo == 2) {
				int oe = 0;
				
				int num = (int)(Math.random()*2)+1;
				System.out.println("1.홀 | 2.짝");
				oe = sc.nextInt();
				
				if((num == 1) && (oe == 1)) {
					System.out.println("정답입니다!");
					win();
				}else if((num == 1) && (oe == 2)){
					System.out.println("틀렸습니다!");
					lose();
				}else if((num == 2) && (oe == 1)) {
					System.out.println("틀렸습니다!");
					lose();
				}else if((num == 2) && (oe == 2)) {
					System.out.println("정답입니다!");
					win();
				}
			}else if(menuNo == 3) {
				int count=0;
				int inputnum = 0;
				
				int num = (int)(Math.random()*20)+1;
				
				for(int i=4; i>=0; i--) {
					System.out.println("1~20까지의 숫자를 선택하세요 - ");
					inputnum = sc.nextInt();
					
				if(num == inputnum) {
					System.out.println("정답입니다.");
					win();
					break;
				}else if (num < inputnum){
					System.out.println("정답보다 숫자가 높습니다.");
					count--;
					System.out.println("남은기회 : " + i);
				}else if (num > inputnum) {
					System.out.println("정답보다 숫자가 작습니다.");
					count--;
					System.out.println("남은기회 : " + i);
				}
				
				if(i == 0) {
					System.out.println("실패! 다음에 다시 도전하세요");
					lose();
				}
				}
			}else if(menuNo == 4) {
				System.out.println("아직 미구현");
				
			}else if(menuNo == 5) {
				myRank();
				
			}else if(menuNo == 6) {
				rank();
				
			}else if(menuNo == 0) {
				end();
				break;
			}
		}
	}

	private void menuPrint() {
		System.out.println("====================================================================");
		System.out.println("1.가위바위보 | 2.홀짝 | 3.스무고개 | 4.블랙잭 | 5.마이페이지 | 6.순위 | 0.로그아웃");
		System.out.println("====================================================================");
		System.out.print("선택 > ");
	}
	public int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = sc.nextInt();
		}catch(Exception e) {
			System.out.println("없는 메뉴입니다.");
		}
		return menuNo;
	}
	
	public void win() {
		Game game = login();
		
		
		
	}
	
	public void lose() {
		
	}
	
	
	
	
	public void rank() {
		List<Game> list = dao.selectAll();
		
		for(Game game : list) {
			if(game.getPlayerPoint() > 0) {
				System.out.println(game);
			}
		}
	}
	
	public void myRank() {
		
		Game game = dao.selectGameInfo(null);
		
			if(game != null) {
			System.out.println(game);
		}
	}
	
	
	
	
	
	
	
	
	
	public void end() {
		System.out.println("로그아웃");
	}
	

}
