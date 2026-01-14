package be_study.quiz.quiz37.quiz04.foodtruck;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int total = 0;
	static int totalUp = 0;
	static int totalDown = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main main = new Main();
		// TODO Auto-generated method stub
		// 객체 생성
		ArrayList<Food> fdList = new ArrayList<Food>();
		fdList.add(new Food(1, "달돈까스", 11000));
		fdList.add(new Food(2, "반달돈까쓰", 6000));
		fdList.add(new Food(3, "기본김밥", 4000));
		fdList.add(new Food(4, "모둠김밥", 6500));

		// ============================================================

		// 메뉴
		boolean isOpen = true;
		while (isOpen == true) {
			// 메뉴선택메뉴
//			while (true) {
				System.out.println("메뉴를 선택해주세요");
				System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감하기");
				int menuSelect;
				menuSelect = sc.nextInt();
				switch (menuSelect) {
				case 1: {
					main.viewMenu(fdList);
					break;
				}
				case 2: {
					System.out.println("주문하실 메뉴를 선택하세요.");
					main.viewMenu(fdList);
					int menuOrder;
					menuOrder = sc.nextInt();
					System.out.println("몇개 주문하시겠습니까?");
					int menuStock;
					menuStock = sc.nextInt();

					if (fdList.get(menuOrder - 1).count - menuStock >= 0) {
						fdList.get(menuOrder - 1).count -= menuStock;
						totalUp += fdList.get(menuOrder - 1).price*menuStock;
					}else {
						System.out.println("최대 재고 이상의 주문은 불가능합니다.");
					}
//					placeOrder(menuOrder,menuStock);
					break;
				}
				case 3: {
					System.out.println("재고를 수정 할 메뉴를 선택하세요.");
					main.viewMenu(fdList);
					int menuOrder;
					menuOrder = sc.nextInt();
					System.out.println("몇개 수정 하시겠습니까?");
					int menuStock;
					menuStock = sc.nextInt();
					if (fdList.get(menuOrder - 1).count + menuStock >= 0) {
						fdList.get(menuOrder - 1).count += menuStock;
					}else {
						System.out.println("최대 재고 이상의 수정은 불가능합니다.");
					}
					break;
				}
				case 4: {
					isOpen = false;
					//남은 재고 처리
					for(Food fd : fdList) {
						totalDown += fd.count*fd.price*30/100;
					}
					total = totalUp-totalDown;
					System.out.printf("오늘 판매수익 : %d\n오늘 폐기 금액 : %d\n총액 : %d\n",totalUp,totalDown,total);
					break;
				}
				default:
					System.out.println("없는 번호입니다. 다시 선택해주세요.");
				}
			}
		}	
//	}

	// ===============================================

	// 메소드
	void viewMenu(ArrayList<Food> fdList) {
		System.out.println("=======================================");
		for (Food fd : fdList) {
			System.out.println(fd);
		}
		System.out.println("=======================================");
	}
}
