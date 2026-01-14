package be_study.quiz;

import java.util.Scanner;

public class Quiz20_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// 메뉴이름
		String americano = "아메리카노";
		String caffeLatte = "카페라떼";
		String vanillaLatte = "바닐라라떼";
		String[] menuStr = { americano, caffeLatte, vanillaLatte };

		// 메뉴가격
		int americanoCost = 3500;
		int caffeLatteCost = 4100;
		int vanillaLatteCost = 4300;
		int[] cost = { americanoCost, caffeLatteCost, vanillaLatteCost };

		// 메뉴 선택용
		int menu = 0;

		// 저장 배열
		int[] orderCost = new int[10];
		int[] count = new int[10];
		String[] addOrderMenu = new String[10];

		// 추가 오더 확인
		String addOrderCheck = "";

		int total = 0;

		int i = 0;
		boolean loopCheck = true;
		while (loopCheck) {
			System.out.println("========메뉴========");
			System.out.printf("1.%1s%7d원\n", americano, americanoCost);
			System.out.printf("2.%1s%8d원\n", caffeLatte, caffeLatteCost);
			System.out.printf("3.%1s%7d원\n", vanillaLatte, vanillaLatteCost);
			System.out.println("==================");

			System.out.println("메뉴 선택 :");
			menu = sc.nextInt();

			System.out.println("수량 선택 :");
			count[i] = sc.nextInt();

			// 메뉴 저장
			addOrderMenu[i] = menuStr[menu - 1];
			orderCost[i] = cost[menu - 1];

			// 전 메뉴와 비교 해서 같으면 추가 후 이번 메뉴루트 데이터 삭제
			for (int m = 0; m < i; m++) {
				if (addOrderMenu[m].equals(menuStr[menu - 1])) {
					count[m] += count[i];
					count[i] = 0;
					addOrderMenu[i] = null;
					i--;
				} else {
					addOrderMenu[i] = menuStr[menu - 1];
					orderCost[i] = cost[menu - 1];
				}

			}

			// 추가 주문, 주문 종료
			while (true) {
				System.out.print("추가 주문하시겠습니까?(y/n) :");
				sc.nextLine();
				addOrderCheck = sc.nextLine();
				if (addOrderCheck.equals("y")) {
					i++;
					break;
				} else if (addOrderCheck.equals("n")) {
					System.out.println("==================");
					for (int j = 0; j <= i; j++) {
						System.out.printf("%s %d잔 : %d\n", addOrderMenu[j], count[j], (orderCost[j] * count[j]));
						total += orderCost[j] * count[j];
					}
					System.out.println("==================");
					System.out.printf("총액: %d\n", total);
					loopCheck = false;
					break;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					continue;
				}

			}

		}

	}

}
