package be_study.quiz.quiz34;

public class Fridge {
	String Brand;
	int capacity; 
	boolean ispowerOn;
	int temp;
	int doorCount;
	
	FreezerTray tray;

	
	
	public Fridge() {
		ispowerOn = false;
		temp = 18;
	}

	public Fridge(String brand, int capacity, int doorCount) {
		Brand = brand;
		this.capacity = capacity;
		this.doorCount = doorCount;
		ispowerOn = false;
		temp = 18;
	}
	
	void PowerOn() {
		ispowerOn = true;
	}
	void PowerOff() {
		ispowerOn = false;
	}
	
	int setTemp(int temp) {
		this.temp += temp;
		return this.temp;
	}
	
}
