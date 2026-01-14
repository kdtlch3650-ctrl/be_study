package be_study.quiz.quiz37.quiz04.foodtruck.copy;

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
	
	public int placeOrder(int menuStock) {
		int totalUp = 0;
		if (this.count - menuStock >= 0) {
			this.count -= menuStock;
			totalUp += this.price*menuStock;
		}else {
			System.out.println("최대 재고 이상의 주문은 불가능합니다.");
		}
		return totalUp;
	}
	
	public void addStock(int menuStock) {
		if (this.count + menuStock >= 0) {
			this.count += menuStock;
		}else {
			System.out.println("최대 재고 이상의 수정은 불가능합니다.");
		}
	}
}
