package be_study.abst;

//abstract 추상 클래스
public abstract class Beverage {
	String name;
	int ml;
	
	public void introduce() {
		System.out.println("저는 음료입니다.");
	}
	
	//여기서 구현x 자식에서 하겠다.
	//추상메소드
	public abstract void checkSafety();
}
