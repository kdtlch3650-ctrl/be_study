package be_study.quiz.quiz37.quiz04.quiz02;

class Electronics implements Orderable {
private String name;
private int price;

public Electronics(String name, int price) {
this.name = name;
this.price = price;
}
/* 2. 오버라이딩을 통해, 전자기기 할인율을 적용하세요. */
public int discountedPrice() {
	// TODO Auto-generated method stub
	return this.price*80/100;
}
}
