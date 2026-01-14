package be_study.quiz;

import java.util.Scanner;

public class Level00 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int ball = 0;
		int user = 0;
		
		int outCount = 0;

		while (true) {
			ball = (int) (Math.random() * 10) + 1;

			//번호 입력 및 잘못된수 반복
			while (true) {
				System.out.print("공격 번호를 입력해주세요.(1~10):");
				user = sc.nextInt();
				if (user > 10 || user <= 0) {
					System.out.println("잘못된 수 입니다.(1~10)");
				}else break;
			}
			
			if (!(ball == user)) {
				outCount += 1;
				System.out.printf("아웃입니다.\n");	
				System.out.printf("투수 %d 유저 %d 입력\n",ball,user);	
				System.out.printf("현재 %d 아웃\n",outCount);	
				
				if(outCount == 3) {
					System.out.printf("쓰리 아웃입니다. 게임 종료");						
					break;
				}
			}else {
				System.out.printf("쳤습니다.\n");	
				System.out.printf("투수 %d 유저 %d 입력\n",ball,user);	
				System.out.printf("현재 %d 아웃\n",outCount);	
			}

		}
	}

}
