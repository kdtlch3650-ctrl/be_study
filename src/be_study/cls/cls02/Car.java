package be_study.cls.cls02;

public class Car {
	//자동차를 의미하는 설계도(클래스)
	
	//필드영역(속성 변수)
	String model;
	String color;
	int price;//차 가격
	
	
	
	//자동 생성자는 생성자가 단 하나도 없어야 자동 생성
	
	//생성자 (생성 할 때 초기화 할일)
	Car(){ // 객체 생성하면서 초기에 해야할 일(필드의 초기화(필드변수에 값 세팅))
		System.out.println("Car() 기본 생성자 호출됨");
		model = null;
		color = "green";
		price = 0;		
	}
	
	Car(String model, String _color, int _price){
		System.out.println("Car(model,color,price) 생성자 호출됨");
		//이 생성자를 통해서 객체가 만들어지는 과정에
		//model 필드변수에 매개변수 _model에 전달된 값을 저장하겠다.
		//this는 매개변수 이름과 지역변수의 이름이 동일할 경우 입력
		this.model = model;
		color = _color;
		price = _price;		
	}
	
	Car(String model, String _color){
		System.out.println("Car(model,color) 생성자 호출됨");
		this.model = model;
		color = _color;
	}
	
	//이렇게 생성자를 구분가게 여러개 만드는 것을 오버로딩이라고 한다.
	//타입이 다르거나,매개변수의 갯수가 다르거나 ,타입 순서가 달라야함
	
	//메소드 (기능 동작)
}
