package be_study.quiz.quiz37.quiz04.foodtruck.copy;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		// 객체 생성
		ArrayList<Food> fdList = new ArrayList<Food>();
		fdList.add(new Food(1, "달돈까스", 11000));
		fdList.add(new Food(2, "반달돈까쓰", 6000));
		fdList.add(new Food(3, "기본김밥", 4000));
		fdList.add(new Food(4, "모둠김밥", 6500));

		FoodTruck2 ft = new FoodTruck2(fdList);
		// ============================================================

		// 메뉴
		boolean isOpen = true;
		while (isOpen == true) {
			// 메뉴선택메뉴
				System.out.println("메뉴를 선택해주세요");
				System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감하기");
				int menuSelect;
				menuSelect = sc.nextInt();
				switch (menuSelect) {
				case 1: {
					ft.viewMenu();
					break;
				}
				case 2: {
					System.out.println("주문하실 메뉴를 선택하세요.");
					int[] sc2 = new int[2];
					sc2 = ft.sc2("주문 갯수를 정해주세요.");
					ft.totalUp += fdList.get(sc2[0]).placeOrder(sc2[1]);
					break;
				}
				case 3: {
					System.out.println("재고를 수정 할 메뉴를 선택하세요.");
					int[] sc2 = new int[2];
					sc2 = ft.sc2("몇개의 재고를 수정하시겠습니까?");
					fdList.get(sc2[0]).addStock(sc2[1]);
					
					break;
				}
				case 4: {
					isOpen = false;
					//남은 재고 처리
					ft.totalDownMet();
					//마감 총액 계산
					ft.total();
					break;
				}
				default:
					System.out.println("없는 번호입니다. 다시 선택해주세요.");
				}
			}
		}	
	
}
