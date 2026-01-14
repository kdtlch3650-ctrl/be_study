package be_study.cls.cls03;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc;
		
		calc =new Calc();
		
		int a = 10;
		int b = 20;
		
		double sum = 0;
		
		//리턴이 있고 매개변수를 3개 받는구나? 처음껀 스트링이고
		sum = calc.calculator("+",a, b);
		//리턴o 매개 2
		sum = calc.divide(a, b);
		sum = calc.calculator("/", a, b);
		
		
		//계산기 켜기 
		//리턴 값이 없는 메소드구나?
		calc.powerOn();
		//사용자 등록
		calc.setOwner("이찬희");
		
		
		int cb = calc.checkBattery();
		System.out.println("잔여배터리량 : "+ cb);
		System.out.println("계산기 제조사 : "+ calc.madeByInfo());
	}

}
