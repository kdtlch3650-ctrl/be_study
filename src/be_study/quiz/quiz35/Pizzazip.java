package be_study.quiz.quiz35;

import java.util.ArrayList;
import java.util.Scanner;

public class Pizzazip {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 메뉴제작
		ArrayList<Pizza> menu = new ArrayList<Pizza>();
		menu.add(new Pizza("불고기피자"));
		menu.add(new Pizza("콤비네이션피자"));
		menu.add(new Pizza("치즈피자"));

		// 주문하기
//		ArrayList<Pizza> pz, Customer ct
		Order od = new Order();
		// 피자 추가
		od.orderadd(new Pizza(menu.get(0).name, "L"));
		od.orderadd(new Pizza(menu.get(1).name, "R"));
		od.orderadd(new Pizza(menu.get(2).name, "L"));

		// 주문자 정보 받아오기
		Customer ct = new Customer("이찬희", 1234, "옆집살아요");
		od.ctadd(ct);

		// 주문완료
		od.order();

		// 배달원 목록
		ArrayList<DeliveryPerson> dpArr = new ArrayList<DeliveryPerson>();
		dpArr.add(new DeliveryPerson("배달1", "민족", true));
		dpArr.add(new DeliveryPerson("배달2", "요기", true));
		dpArr.add(new DeliveryPerson("배달3", "이츠", false));

		Delivery delivery01 = new Delivery();
		
		for (DeliveryPerson dp : dpArr)
			if (delivery01.isorder(dp) == true) {
				delivery01.letgo(dp, od);
			}
		Order od2 = new Order();
		od2.orderadd(new Pizza(menu.get(0).name, "L"));
		od2.orderadd(new Pizza(menu.get(0).name, "L"));
		od2.orderadd(new Pizza(menu.get(0).name, "R"));
		od2.orderadd(new Pizza(menu.get(0).name, "R"));
		
		Customer ct2 = new Customer("삼찬희", 5678, "앞집살아요");
		od2.ctadd(ct2);
		// 주문완료
		od.order();
		
		Delivery delivery02 = new Delivery();
		for (DeliveryPerson dp : dpArr)
			if (delivery02.isorder(dp) == true) {
				delivery02.letgo(dp, od2);
			}
	}
}
