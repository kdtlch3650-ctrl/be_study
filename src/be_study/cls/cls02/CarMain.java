package be_study.cls.cls02;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car01 = new Car();//인스턴스 객체 생성
		Car car02 = new Car("그랜져","Black",8000);
		
		car01.model = "아반떼";
		System.out.println(car01.model);
		System.out.println(car01.color); // 흰색
		System.out.println(car01.price);
//		car02.color = "blue"; 
		System.out.println(car02.model);
		System.out.println(car02.color);
		System.out.println(car02.price);
		
		Car car03 =new Car("쏘렌토","White");
		System.out.println(car03.model);
		System.out.println(car03.color);
		System.out.println(car03.price);
	}
}
