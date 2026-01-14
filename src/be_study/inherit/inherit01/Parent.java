package be_study.inherit.inherit01;

public class Parent extends GrandParent {
//	int money; // defaul 다른 패키지 사용불가
//	public int money; //모두 사용가능
	protected int money; //같은 패키지 + 상속받은 자식
//	private int maney; //상속불가.
	
	public Parent(int money) {
		System.out.println("Parent 생성자 실행됨");
		this.money = money;
	}
	
	public void say() {
		System.out.println("내가 말씀을 하신다.");
	}
}
