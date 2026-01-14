package be_study.quiz;

import java.util.Scanner;


public class Quiz20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int americanoCost = 3500;
		int caffeLatteCost = 4100;
		int vanillaLatteCost = 4300;
		
		int[] cost = {americanoCost,caffeLatteCost,vanillaLatteCost};
		int[] orderCost = new int[10];
		int total = 0;

		String americano = "아메리카노";
		String caffeLatte = "카페라떼";
		String vanillaLatte = "바닐라라떼";

		int menu = 0;
		String[] menuStr = { americano, caffeLatte, vanillaLatte };
		int[] count = new int[10];
		String[] addOrderMenu = new String[10];

		String addOrderCheck = "";

		int i = 0;
		boolean loopCheck = true;
		while(loopCheck) {
			System.out.println("========메뉴========");
			System.out.printf("1.%1s%7d원\n", americano, americanoCost);
			System.out.printf("1.%1s%8d원\n", caffeLatte, caffeLatteCost);
			System.out.printf("1.%1s%7d원\n", vanillaLatte, vanillaLatteCost);
			System.out.println("==================");

			System.out.println("메뉴 선택 :");
			menu = sc.nextInt();

			System.out.println("수량 선택 :");
			count[i] = sc.nextInt();

			switch (menu) {
			case 1: {
				addOrderMenu[i] = menuStr[0];
				orderCost[i] = cost[0];
				break;
			}
			case 2: {
				addOrderMenu[i] = menuStr[1];
				orderCost[i] = cost[1];
				break;
			}
			case 3: {
				addOrderMenu[i] = menuStr[2];
				orderCost[i] = cost[2];
				break;
			}
			default:
				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
				continue;
			}

			while (true) {
				System.out.print("추가 주문하시겠습니까?(y/n) :");
				sc.nextLine();
				addOrderCheck = sc.nextLine();
				if (addOrderCheck.equals("y")) {
					i++;
					break;
				}else if(addOrderCheck.equals("n")){
					System.out.println("==================");
					for(int j = 0;j<=i;j++) {
						System.out.printf("%s %d잔 : %d\n",addOrderMenu[j],count[j],(orderCost[j]*count[j]));
						total += orderCost[j]*count[j];
					}
					System.out.println("==================");
					System.out.printf("총액: %d\n",total);
					loopCheck=false;
					break;
				}else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					continue;
				}
				
			}
			
		}


	}

}
