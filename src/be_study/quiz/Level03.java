package be_study.quiz;

import java.util.Scanner;

public class Level03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int ball = 0;
		int user = 0;

		String[] batterName = { "1번타자", "2번타자", "3번타자", "4번타자", "5번타자", "6번타자", "7번타자", "8번타자", "9번타자" };
		int[] batterPaArr = new int[9];
		int[] batterHitsArr = new int[9];

		int batterNunber = 0;

		int outCount = 0;

		double avg = 0.0;

		int swingCount = 1;
		//1~3회 진행
		for (int i = 1; i <= 3; i++) {
			System.out.printf("현재 %d회 진행중입니다.\n", i);
			outCount = 0;

			while (true) {
				ball = (int) (Math.random() * 10) + 1;
				// 번호 입력 및 잘못된수 반복
				while (true) {
					//타율 분모(타석수) 0일경우 0입력
					if(batterPaArr[batterNunber]==0) {
						avg = 0;
					}else avg = (double) batterHitsArr[batterNunber] / batterPaArr[batterNunber];
					
					System.out.printf("%d번째 타석 %s 타율 : %.2f 준비.\n", swingCount, batterName[batterNunber], avg);
					System.out.print("공격 번호를 입력해주세요.(1~10):");
					user = sc.nextInt();
					
					//올바르지 못한 입력값 다시 입력
					if (user > 10 || user <= 0) {
						System.out.println("잘못된 수 입니다.(1~10)");
					} else
						break;
				}

				swingCount += 1;

				if (!(ball == user)) {
					outCount += 1;
					System.out.println("======================");
					System.out.printf("아웃입니다.\n");
					System.out.printf("%d번 선수 퇴장.\n", batterNunber + 1);
					System.out.printf("투수 %d 유저 %d 입력\n", ball, user);
					System.out.printf("현재 %d 아웃\n", outCount);
					System.out.println("======================");

					batterPaArr[batterNunber] += 1;

					if (outCount == 3) {
						System.out.println("쓰리 아웃입니다. 회차 종료");
						System.out.println("======================");
						System.out.println("======================");
						System.out.println("======================");

						batterNunber += 1;
						if (batterNunber == 9) {
							batterNunber = 0;
						}

						break;
					}
				} else {
					System.out.println("======================");
					System.out.printf("쳤습니다.\n");
					System.out.printf("%d번 선수 출루.\n", batterNunber + 1);
					System.out.printf("투수 %d 유저 %d 입력\n", ball, user);
					System.out.printf("현재 %d 아웃\n", outCount);
					System.out.println("======================");
					batterHitsArr[batterNunber] += 1;
					batterPaArr[batterNunber] += 1;

				}
				batterNunber += 1;
				if (batterNunber == 9) {
					batterNunber = 0;
				}
			}
		}
	}

}
