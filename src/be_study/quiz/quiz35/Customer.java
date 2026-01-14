package be_study.quiz.quiz35;

public class Customer {
	String name;
	
	int number;//귀찮으니 뒷 4자리로 규정 아무튼 보안때문
	
	String address;

	public Customer(String name, int number, String address) {
		super();
		this.name = name;
		this.number = number;
		this.address = address;
	}
}
