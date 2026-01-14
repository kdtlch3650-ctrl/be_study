package be_study.quiz.quiz39;

import java.util.Scanner;

public class RouletDevice {
	String userId;
	String branchName;
	int total;
	boolean isPlay;

	public RouletDevice(String userId, String branchName) {
		this.userId = userId;
		this.branchName = branchName;
		this.total = 0;
		this.isPlay = true;
	}

	public void run() {
		Roulette rl = new Roulette();
		while (isPlay) {
			int menuSelet = menuSelet();
			switch (menuSelet) {
			// 충전
			case 1: {
				this.total += rl.charge();
				break;
			}
			// 게임
			case 2: {
				rl.play();
				rl = new Roulette();
				break;
			}
			case 3: {
				close(rl.retryLimit);
				break;
			}

			}

		}
	}

	public int menuSelet() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("=================================");
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1.충전 2.게임시작 3.마감");
			System.out.println("=================================");
			int menuSelet = sc.nextInt();
			if (menuSelet <= 3 && menuSelet > 0) {
				return menuSelet;
			} else {
				System.out.println("옳지 않은 입력입니다.");
			}
		}
	}
	
	public void close(int rl) {
		if(rl == 0) {
		System.out.printf("%s지점의 최종 매출액 : %d",branchName, this.total);
		isPlay = false;
		}else {
			System.out.println("횟수가 남아있어 마감이 불가능 합니다.");
		}
	}

}
