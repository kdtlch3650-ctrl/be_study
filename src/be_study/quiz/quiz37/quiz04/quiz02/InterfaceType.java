package be_study.quiz.quiz37.quiz04.quiz02;

public class InterfaceType {
	public static void main(String[] args) {
// 객체 생성
		Orderable of = new Food("족발",19800);
		Orderable oe = new Electronics("에어팟",199000);
		Orderable oc = new Clothing("셔츠",49900);
// 총합 계산
		int a = of.discountedPrice()+oe.discountedPrice()+oc.discountedPrice();
//		of.discountedPrice();
//		oe.discountedPrice();
//		oc.discountedPrice();
// 결과 출력
		System.out.println("총합: "+a+"원");
	}
}