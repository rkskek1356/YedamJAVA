package com.yedam.java_App;

import java.net.ConnectException;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.yedam.java_Game.Game;
import com.yedam.java_Game.GameDAO;
import com.yedam.java_Game.GameDAOImpl;

public class GameStartFrame {

	private Scanner sc = new Scanner(System.in);
	private GameDAO dao = GameDAOImpl.getInstatce();

	public void run(Game login) {
		System.out.println(login); // 로그인되면서 점수를 보여줌

		while (true) {

			menuPrint(); // 메뉴출력

			int menuNo = menuSelect(); // 메뉴선택

			if (menuNo == 1) {
				int rcp = 0;
				int num = (int) (Math.random() * 3) + 1;
				System.out.println("1.가위 | 2.바위 | 3.보 > ");
				rcp = sc.nextInt();

				if (num == rcp) {
					point(login, "가위바위보", "draw");
					System.out.println("비겼습니다!\n현재점수 : " + login.getPlayerPoint());
				} else if ((num == 1) && (rcp == 2)) {
					point(login, "가위바위보", "win");
					System.out.println("이겼습니다!\n현재점수 : " + login.getPlayerPoint());
				} else if ((num == 1) && (rcp == 3)) {
					point(login, "가위바위보", "lose");
					System.out.println("졌습니다.\n현재점수 : " + login.getPlayerPoint());
				} else if ((num == 2) && (rcp == 1)) {
					point(login, "가위바위보", "lose");
					System.out.println("졌습니다.\n현재점수 : " + login.getPlayerPoint());
				} else if ((num == 2) && (rcp == 3)) {
					point(login, "가위바위보", "win");
					System.out.println("이겼습니다!\n현재점수 : " + login.getPlayerPoint());
				} else if ((num == 3) && (rcp == 1)) {
					point(login, "가위바위보", "win");
					System.out.println("이겼습니다!\n현재점수 : " + login.getPlayerPoint());
				} else if ((num == 3) && (rcp == 2)) {
					point(login, "가위바위보", "lose");
					System.out.println("졌습니다.\n현재점수 : " + login.getPlayerPoint());
				}

			} else if (menuNo == 2) {
				int oe = 0;

				int num = (int) (Math.random() * 2) + 1;
				System.out.println("1.홀 | 2.짝");
				oe = sc.nextInt();

				if ((num == 1) && (oe == 1)) {
					point(login, "홀짝", "win");
					System.out.println("정답입니다!\n현재점수 : " + login.getPlayerPoint());
				} else if ((num == 1) && (oe == 2)) {
					point(login, "홀짝", "lose");
					System.out.println("틀렸습니다!\n현재점수 : " + login.getPlayerPoint());
				} else if ((num == 2) && (oe == 1)) {
					point(login, "홀짝", "lose");
					System.out.println("틀렸습니다!\n현재점수 : " + login.getPlayerPoint());
				} else if ((num == 2) && (oe == 2)) {
					point(login, "홀짝", "win");
					System.out.println("정답입니다!\n 현재점수 : " + login.getPlayerPoint());
				}
			} else if (menuNo == 3) {
				int count = 0;
				int inputnum = 0;

				int num = (int) (Math.random() * 20) + 1;

				for (int i = 4; i >= 0; i--) {
					System.out.println("1~20까지의 숫자를 선택하세요 - ");
					inputnum = sc.nextInt();

					if (num == inputnum) {
						point(login, "스무고개", "win");
						System.out.println("정답입니다.\n현재점수 : " + login.getPlayerPoint());
						break;
					} else if (num < inputnum) {
						System.out.println("정답보다 숫자가 높습니다.");
						count--;
						System.out.println("남은기회 : " + i);
					} else if (num > inputnum) {
						System.out.println("정답보다 숫자가 작습니다.");
						count--;
						System.out.println("남은기회 : " + i);
					}

					if (i == 0) {
						point(login, "스무고개", "lose");
						System.out.println("실패! 다음에 다시 도전하세요\n 현재점수 : " + login.getPlayerPoint());
					}
				}
			} else if (menuNo == 4) {
				System.out.println("블랙잭 아직 미구현");

			} else if (menuNo == 5) {
				myRank(login);

			} else if (menuNo == 6) {
				rank();

			} else if (menuNo == 0) {
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
		} catch (Exception e) {
			System.out.println("없는 메뉴입니다.");
		}
		return menuNo;
	}

	public void point(Game game, String name, String res) {
		switch (res) {
		case "win":
			// 점수 +10, 판수 +1, 승 수+1
			game.setPlayerPoint(game.getPlayerPoint() + 10);
			if (name == "가위바위보") {
				game.setGameRcp(game.getGameRcp() + 1);
				game.setWinRcp(game.getWinRcp() + 1);
			} else if (name == "홀짝") {
				game.setGameOe(game.getGameOe() + 1);
				game.setWinOe(game.getWinOe() + 1);
			} else if (name == "스무고개") {
				game.setGameTq(game.getGameTq() + 1);
				game.setWinTq(game.getWinTq() + 1);
			} else if (name == "블랙잭") {
				game.setGameBj(game.getGameBj() + 1);
				game.setWinBj(game.getWinBj() + 1);
			}
			break;
		case "lose":
			// 점수 -5, 판수 +1
			game.setPlayerPoint(game.getPlayerPoint() - 5);
			if (name == "가위바위보") {
				game.setGameRcp(game.getGameRcp() + 1);
			} else if (name == "홀짝") {
				game.setGameOe(game.getGameOe() + 1);
			} else if (name == "스무고개") {
				game.setGameTq(game.getGameTq() + 1);
			} else if (name == "블랙잭") {
				game.setGameBj(game.getGameBj() + 1);
			}
			break;
		case "draw":
			// 판수 +1
			if (name == "가위바위보") {
				game.setGameRcp(game.getGameRcp() + 1);
			} else if (name == "홀짝") {
				game.setGameOe(game.getGameOe() + 1);
			} else if (name == "스무고개") {
				game.setGameTq(game.getGameTq() + 1);
			} else if (name == "블랙잭") {
				game.setGameBj(game.getGameBj() + 1);
			}
			break;
		}
		dao.updatePoint(game);
	}

	public void rank() {
		List<Game> list = dao.selectAll();

		for (Game game : list) {
			System.out.println(game);
		}
	}

	public void myRank(Game game) {

		double gamercp = ((double) game.getWinRcp() / game.getGameRcp()) * 100;
		double gameoe = ((double) game.getWinOe() / game.getGameOe()) * 100;
		double gametq = ((double) game.getWinTq() / game.getGameTq()) * 100;
		double gamebj = ((double) game.getWinBj() / game.getGameBj()) * 100;

		System.out.println(game + "\n==========승률==========\n" + "가위바위보 : " + gamercp + "% \n홀짝 : " + gameoe
				+ "%\n스무고개 : " + gametq + "%\n블랙잭 : " + gamebj);

	}

	public void end() {
		System.out.println("로그아웃");
	}

}
