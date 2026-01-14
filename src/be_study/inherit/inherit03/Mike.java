package be_study.inherit.inherit03;

public class Mike {
	//마이크
	
	String type;
	String model;
	int price;
	

	public void volumeUp() {
		System.out.println("Mike volumeUp");
	}
	
	public final void nomethod() {
		System.out.println("nomethod");
	}
}
