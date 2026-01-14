package be_study.quiz.quiz37.quiz04.foodtruck.copy;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodTruck2 {
	ArrayList<Food> fdList;
	Scanner sc = new Scanner(System.in);

	int total = 0;
	int totalUp = 0;
	int totalDown = 0;
	
	FoodTruck2(ArrayList<Food> fdList){
		this.fdList = fdList;
	}


	public void totalDownMet() {
		
		for (Food fd : fdList) {
			totalDown += fd.count * fd.price * 30 / 100;
		}
	}
	
	public void total() {
		total = totalUp-totalDown;
		System.out.printf("오늘 판매수익 : %d\n오늘 폐기 금액 : %d\n총액 : %d\n",totalUp,totalDown,total);
	}
	
	public int[] sc2(String str) {
		int[] scMenu = new int[2];
		this.viewMenu();
		scMenu[0] = sc.nextInt()-1;
		System.out.println(str);
		scMenu[1] = sc.nextInt();
		return scMenu;
	}
	
	void viewMenu() {
		System.out.println("=======================================");
		for (Food fd : fdList) {
			System.out.println(fd);
		}
		System.out.println("=======================================");
	}
}
