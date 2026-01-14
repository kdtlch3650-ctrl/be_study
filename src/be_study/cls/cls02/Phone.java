package be_study.cls.cls02;

public class Phone {
	String model;
	int price;
	int battery;

	Phone(String model) {
		this(model,0,2500); //본인의 다른 생성자 호출 매개변수 3짜리
//		this.model = model;
//		this.price = 0;
//		this.battery = 2500;
	}

	Phone(String model, int price) {
		this(model,price,2500);
//		this.model = model;
//		this.price = price;
//		this.battery = 2500;
	}

	Phone(String model, int price, int battery) {
		this.model = model;
		this.price = price;
		this.battery = battery;
	}

//	Phone(String model,int battery){ //타입이 스트링 인트 로 위와 동일해서 불가
//		this.model = model;
//		this.battery = battery;
//	}

	Phone(int battery, String model) { // 타입이 인트 스트링으로 가능
		this.model = model;
		this.battery = battery;
	}
}
