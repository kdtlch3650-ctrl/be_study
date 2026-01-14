package be_study.quiz;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		String[] menu = { "입력", "수정", "조회", "삭제", "종료" };

		for (int i = 0; i < 5; i++) {
			System.out.printf("%d.%s\n", (i + 1), menu[i]);
		}

		System.out.printf("메뉴 번호를 입력하세요.");
		int sum = scanner.nextInt();

//		if(sum <= 4 && sum>0) {
//			System.out.printf("%s 메뉴입니다",menu[sum-1]);
//		}else if (sum == 5) {
//			System.out.printf("프로그램이 종료됩니다.");
//		}else {
//
//			System.out.printf("잘못 입력하셨습니다.");
//		}

		while (true) {
			if (sum <= 4 && sum > 0) {
				for (int i = 0; i < 5; i++) {
					System.out.printf("%d.%s\n", (i + 1), menu[i]);
				}
				System.out.println("---------------------------------------");
				System.out.printf("%s 메뉴입니다\n", menu[sum - 1]);
				System.out.println("---------------------------------------");
				System.out.printf("메뉴 번호를 입력하세요.");
				sum = scanner.nextInt();
			} else if (sum == 5) {
				System.out.println("---------------------------------------");
				System.out.printf("프로그램이 종료됩니다.\n");
				System.out.println("---------------------------------------");
				break;
			} else {
				for (int i = 0; i < 5; i++) {
					System.out.printf("%d.%s\n", (i + 1), menu[i]);
				}
				System.out.println("---------------------------------------");
				System.out.printf("잘못 입력하셨습니다.\n");
				System.out.println("---------------------------------------");
				System.out.printf("메뉴 번호를 입력하세요.");
				sum = scanner.nextInt();
			}
		}

	}

}
