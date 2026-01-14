package be_study.quiz.quiz34;

public class Stove {
	int num;
	String brand;
	int price;
	boolean ispowerOn;
	int heatLevel;
	
	
	public Stove() {
	}


	public Stove(int num, String brand, int price) {
		super();
		this.num = num;
		this.brand = brand;
		this.price = price;
	}
	
	
	void PowerOn() {
		ispowerOn = true;
		heatLevel = 1;
	}
	void PowerOff() {
		ispowerOn = false;
		heatLevel = 0;
	}
	
	int setTemp(int level) {
		this.heatLevel += level;
		return this.heatLevel;
	}
	
	
}
