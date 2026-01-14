package be_study.quiz.quiz37.quiz04.foodtruck;

public class Food {
	int num;
	String name;
	int price;
	int count;
	
	Food(int num,String name,int price){
		this.num = num;
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return String.format("%d. %7s %7d원 남은재고 : %5d",num,name,price,count);
	}
}
