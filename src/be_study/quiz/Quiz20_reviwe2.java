package be_study.quiz;

import java.util.Scanner;

public class Quiz20_reviwe2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] menuArr = { "아메리카노", "카페라떼", "바닐라라떼" };
		int[] priceArr = { 3500, 4100, 4300 };
		int[] countArr = new int[menuArr.length];
		// TODO Auto-generated method stub

		int menu = 0;
		int count = 0;
		String addOrder;

		int total = 0;

		while (true) {

			while (true) {
				System.out.println("========메뉴========");
				for (int i = 0; i < menuArr.length; i++) {
					System.out.printf("%d.%1s%7d원\n", i + 1, menuArr[i], priceArr[i]);
				}
				System.out.println("==================");

				System.out.println("메뉴 선택:");
				menu = sc.nextInt();

				if (menu >= 1 && menu <= menuArr.length) {
					break;
				} else {
					System.out.println("잘못입력한듯. 메뉴 다시");
				}
			}

			// 메뉴선택 정상! 진행!
			// 수량선택
			System.out.println("수량 선택 :");
			count = sc.nextInt();

			countArr[menu - 1] += count; // 선택한 번호 -1 위치에 수량 추가

			// 추가 주문 y,n아니면 재입력
			sc.nextLine();
			while (true) {
				System.out.print("추가주문하시겠습니까? (y/n) : ");
				addOrder = sc.nextLine();

				if (addOrder.equals("y") || addOrder.equals("n")) {
					break;
				}
			}

			if (addOrder.equals("y")) {
				continue;
			} else if (addOrder.equals("n")) {
				// 더이상 추가주문 안하고 종료
			}

			// 주문 끝!
			if (addOrder.equals("n")) {
				System.out.println("==================");
				for (int i = 0; i < menuArr.length; i++) {
					if (countArr[i] > 0) {
						System.out.printf("%s %d잔 : %d원\n", menuArr[i], countArr[i], countArr[i] * priceArr[i]);
						total += countArr[i] * priceArr[i];
					}
				}

				System.out.println("==================");
				System.out.println("총액 : " + total + "원");
				break;
			}

		}
	}
}
