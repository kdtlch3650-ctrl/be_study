package be_study.quiz;

import java.util.Scanner;

public class Quiz20_reviwe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int americanoCost = 3500;
		int caffeLatteCost = 4100;
		int vanillaLatteCost = 4300;
		int[] cost = { americanoCost, caffeLatteCost, vanillaLatteCost };

		String americano = "아메리카노";
		String caffeLatte = "카페라떼";
		String vanillaLatte = "바닐라라떼";
		String[] menuStr = { americano, caffeLatte, vanillaLatte };
		// TODO Auto-generated method stub
		
		//번호 메뉴 갯수
		int menu1Count = 0;
		int menu2Count = 0;
		int menu3Count = 0;
		
		
		int menu = 0;
		int count = 0;
		String addOrder;
		

		while (true) {
			System.out.println("========메뉴========");
			System.out.printf("1.%1s%7d원\n", americano, americanoCost);
			System.out.printf("1.%1s%8d원\n", caffeLatte, caffeLatteCost);
			System.out.printf("1.%1s%7d원\n", vanillaLatte, vanillaLatteCost);
			System.out.println("==================");

			System.out.println();
			
			

			if (menu >= 1 && menu <= 3) {
				System.out.println("메뉴 선택:");
				menu = sc.nextInt();

				System.out.println("수량 선택:");
				count = sc.nextInt();

				if (menu == 1) {
					menu1Count += count;
				} else if (menu == 2) {
					menu2Count += count;
				} else {
					menu3Count += count;
				}

				sc.nextLine();
				
				//추가 주문 y,n아니면 재입력
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
				
				//주문 끝!
				if(addOrder.equals("n")) {
					System.out.println("==================");
					if(menu1Count>0)
					System.out.printf("%s %d잔 : %d원\n",americano,menu1Count, menu1Count*3500);
					if(menu2Count>0)
					System.out.printf("%s %d잔 : %d원\n",caffeLatte,menu2Count, menu2Count*4100);
					if(menu3Count>0)
					System.out.printf("%s %d잔 : %d원\n",vanillaLatte,menu3Count, menu3Count*4300);
					
					int total = menu1Count*3500+menu2Count*4100+menu3Count*4300;
					System.out.println("==================");
					System.out.println("총액 : "+ total + "원");
					break;
				}

			} else {
				System.out.println("잘못입력했습니다. 메뉴를 다시 선택해주세요!");
			}
		}
	}

}
