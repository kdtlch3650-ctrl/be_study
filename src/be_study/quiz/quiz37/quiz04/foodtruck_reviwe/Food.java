package be_study.quiz.quiz37.quiz04.foodtruck_reviwe;

public class Food {

	String name;
	int price;
	int stock; // 재고

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
		this.stock = 5; //초기 재고 수량 5
	}

	// 재고를 설정 할 수 있다.

	// 1. 그냥 세팅
	public void setStock(int stock) {
		this.stock = stock;
	}

	// 2. 재고가 변경이 된다.
	public void modifyStock(int count) {
		if (this.stock + count < 0) {
			this.stock = 0;
			return;
		}
		this.stock += count;
	}
	//메뉴를 볼래
	public String getFoodInfo() {
		return String.format("%s : %d원 (잔여재고:%d)",name,price,stock);
	}
}
