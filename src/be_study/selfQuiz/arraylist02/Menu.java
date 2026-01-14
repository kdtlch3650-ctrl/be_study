package be_study.selfQuiz.arraylist02;

public class Menu {
	String name;
	int price;
	
	Menu(String name,int price){
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return "이름: "+name+",가격: "+price;
	}
}
