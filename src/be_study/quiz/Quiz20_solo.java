package be_study.quiz;

import java.util.Scanner;

public class Quiz20_solo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub

		String[] menuArr = { "아메리카노", "카페라떼", "바닐라라떼" };
		int[] menuCostArr = { 3500, 4100, 4300 };
		int[] countArr = new int[menuArr.length];

		int menu = 0;
		int count = 0;
		int total = 0;

		String isOrder = "";

		boolean isExit = false;

		// 메뉴창 반복
		// ㄴ메뉴 선택 실패시 반복
		while (!isExit) {
			while (true) {
				System.out.println("========메뉴========");
				for (int i = 0; i < menuArr.length; i++) {
					System.out.printf("%d.%1s%7d원\n", i + 1, menuArr[i], menuCostArr[i]);
				}
				System.out.println("==================");

				System.out.println("메뉴 선택 : ");
				menu = sc.nextInt();

				if (menu > menuArr.length) {
					System.out.println("잘못 선택 메뉴 다시");
				} else
					break;
			}

			// 수량받음
			System.out.println("수량 선택 : ");
			countArr[menu - 1] += sc.nextInt();

			sc.nextLine();
			// 추가주문? - 전체반복 추가
			System.out.println("추가 주문하시겠습니까? (y/n) :");
			isOrder = sc.nextLine();

			if (isOrder.equals("y")) {

			} else if (isOrder.equals("n")) {
				System.out.println("==================");
				for (int i = 0; i < menuArr.length; i++) {
					if (countArr[i] != 0) {
						System.out.printf("%s %d잔 : %d원\n", menuArr[i], countArr[i], countArr[i] * menuCostArr[i]);
						total += countArr[i] * menuCostArr[i];
					}
				}
				System.out.println("==================");
				System.out.println("총액 : "+total);
				
				isExit = true;
			}

			// 주문끝 결과창

		}
	}

}
