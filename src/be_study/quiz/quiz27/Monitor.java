package be_study.quiz.quiz27;

public class Monitor {
	String maker;
	int inch;
	int price;
	String color;
	int maxResolutionX;
	int maxResolutionY;
	
	Monitor (String maker,int inch,int price){
		
		this.maker = maker;
		this.inch = inch;
		this.price = price;		
		
	}
	
	void set(int maxResolutionX,int maxResolutionY) {
		this.maxResolutionX = maxResolutionX;
		this.maxResolutionY = maxResolutionY;
	}
	
	void set(int maxResolutionX,int maxResolutionY,String color) {
		
		this.maxResolutionX = maxResolutionX;
		this.maxResolutionY = maxResolutionY;
		this.color = color;
	}
	
	void on() {
		System.out.println("전원이 켜졌습니다.");
	}
	
	int priceIncrease(int price) {
		this.price += price;
		return this.price;
	}
	
	void info() {
		System.out.printf
		("제조사 : %10s \n 인치 : %10d \n 가격 : %10d \n 색상 : %10s \n 해상도 : %5d*%d\n"
				,maker,inch,price,color,maxResolutionX,maxResolutionY);	
		System.out.println("==========================================");
	}
	
	
	
	
}
