package be_study.quiz.quiz37.quiz04.foodtruck_reviwe;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodTruck {

	String truckName;
	int totalSales; // 총 매출액
	boolean isOpened;

	// 푸드트럭은 판매하는 푸드종류(메뉴) 여러개 가지고 있다.
	ArrayList<Food> foodList;

	public FoodTruck() {
		truckName = null;
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
	}

	public FoodTruck(String truckName) {
		this.truckName = truckName;
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
	}

	public void addMenu(Food food) {
		foodList.add(food);
	}

	public void addMenu(String name, int price) {
		Food food = new Food(name, price);
		foodList.add(food);
	}

	public void startSales() {
		Scanner sc = new Scanner(System.in);
		// 영업시작~
		isOpened = true;
		System.out.println("============[" + truckName + "]============");
		while (isOpened) {
			
			
			int menuInput = getMainMenu();
			
			switch (menuInput) {
			//메뉴보기
			case 1: {
				//인덱스        : 0 1 2 3...
				//사용자 메뉴 번호 : 1 2 3 4...
				showFoodList();
				break;
			}
			//주문하기
			case 2: {
				orderMenu();
				break;
			}
			//재고관리
			case 3: {
				manageStock();				
				break;
			}
			//마감하기
			case 4: {
				finighSales();
				break;
			}
			default:
				System.out.println("옳지 않은 명령어 입니다.");
			}
		}

	}
	public int getMainMenu() {
		Scanner sc = new Scanner(System.in);
		int menuInput;
		while(true) {
		System.out.println();
		System.out.println("***[메뉴선택]***");
		System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감하기");
		System.out.println(">>>입력 : ");

		menuInput = sc.nextInt();
		
		if(menuInput >= 1 && menuInput <= 4) {
			break;
		}else {
			System.out.println("옳은 메뉴 부탁");
		}
		
		}
		
		return menuInput;
	}
	
	public void showFoodList() { //메뉴 보여주기
		System.out.println();
		for(int i = 0 ; i<foodList.size();i++) {
			System.out.printf("[%d] %s\n",i+1,foodList.get(i).getFoodInfo());
		}
	}
	
	public void orderMenu() { //주문하기
		int orderMenuIndex = getFoodMenuIndex();
		
		if(foodList.get(orderMenuIndex).stock>0) {
			foodList.get(orderMenuIndex).modifyStock(-1);

			totalSales += foodList.get(orderMenuIndex).price;
			
			System.out.printf("[주문정보] %s 메뉴 %d개 주문완료! \n",foodList.get(orderMenuIndex).name,1);
		}else {
			System.out.println("[품절안내] 해당 메뉴는 품절입니다.");
		}
	}
	
	public int getFoodMenuIndex() {
		Scanner sc = new Scanner(System.in);
		int orderMenu;
		
		while(true) {
			showFoodList();

			System.out.println(">>> 주문 메뉴 번호 입력 : ");
			orderMenu = sc.nextInt();
			
			if(orderMenu >= 1 && orderMenu <= foodList.size()) {
				break;
			}else {
				System.out.println(">>>짤못입력하셨수");
				System.out.println(">>>메뉴에서 입력해");
			}
			
		}
		//몇개 주문할래?
		//주문 번호
		int orderMenuIndex = orderMenu-1;
		return orderMenuIndex;
		
	}
	
	public void manageStock() {
		Scanner sc = new Scanner(System.in);
//		showFoodList();
		
		
		System.out.println(">>> 재고 관리할 메뉴 번호를 선택하세요.");
		int menuIndex = getFoodMenuIndex();
		
		System.out.println(">>> 재고 관리할 메뉴 번호 입력 : ");
		int input = sc.nextInt();
		System.out.print(">>> 재고 조정할 개수를 입력 : ");
		int stockCount = sc.nextInt();
		foodList.get(input-1).modifyStock(stockCount);
		//몇번 인덱스에 있는 메뉴에게 너의 재고를 stockCount만큼 조정해라
		System.out.println("[재고 조정 적용]");
		System.out.println(foodList.get(input-1).getFoodInfo());
		System.out.println();
	}
	
	public void finighSales() {
		System.out.println();
		System.out.println("=========[영업마감]=========");
		isOpened = false;
		
		int lossSales= 0;
		for(Food food : foodList) {
			lossSales += (food.price*0.3*food.stock);
		}
		
		System.out.println("----[마감정보]----");
		System.out.println(">>> 총매출액 : "+totalSales);
		System.out.println(">>> 원가차감 : "+lossSales);
		System.out.println(">>> 최종수익 : "+(totalSales-lossSales));
		
	}

}
