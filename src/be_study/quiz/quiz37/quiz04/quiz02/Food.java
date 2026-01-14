package be_study.quiz.quiz37.quiz04.quiz02;

class Food implements Orderable {
	private String name;
	private int price;

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 1. 오버라이딩을 통해, 음식 할인율을 적용하세요. */

	@Override
	public int discountedPrice() {
		// TODO Auto-generated method stub
		return this.price*90/100;
	}
}
