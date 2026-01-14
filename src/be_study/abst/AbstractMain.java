package be_study.abst;

public class AbstractMain {
	public static void main(String[] args) {
		//추상클래스 초기화 불가
//		Beverage b01 = new Beverage();
		
		Hite h1 = new Hite();
		h1.name = "하이트라이트";
		h1.ml=330;
		h1.alcol = 6.3;
		h1.introduce();
		h1.checkAlcol();
		
		Coke c1 = new Coke();
		c1.name = "제로콜라";
		c1.ml = 500;
		c1.sugar = 0;
		c1.introduce();
		
		//추상클래스 초기화 불가 이지만 자식 클래스를 담아 초기화는 가능
//		Beverage b01 = new Beverage();
		Beverage b1 = new Coke();
		Beverage b2 = new Hite();
		Beverage[] bArr = {new Coke(), new Hite()};
		
		b2.checkSafety();
		b2.introduce();
		Hite hh = (Hite)b2;
		//형변환 하지 않으면 사용 불가.
		hh.checkAlcol();
		
	}
}
