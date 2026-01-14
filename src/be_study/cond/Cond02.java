package be_study.cond;

public class Cond02 {
	public static void main(String[] args) {
		
		int money = 0;
		
		boolean isHungry = true;
		if(isHungry) {
			System.out.println("햄버거 메뉴 주문 추가");
			money += 5000;
		}else {
			System.out.println("젤리 하나 추가");
			money += 300;
		}
		
		boolean option = false;
		if(option == true) {
			System.out.println("패티 추가로 비용 발생");
			money += 2000;
		}else {
			System.out.println("옵션 없이 진행");
		}
		
		boolean isDiscount = true;
		if(!isDiscount) {
			System.out.println("할인 없음");
		}else {
			int coupon = 500;
			System.out.println("할인 쿠폰 적용");
			money -= coupon;
		}
		System.out.println("최종금액 "+money);
	}
}
