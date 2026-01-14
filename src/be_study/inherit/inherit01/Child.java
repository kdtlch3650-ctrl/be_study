package be_study.inherit.inherit01;

public class Child extends Parent{
	String schoolName;
	int grade;
	public Child() {
//		super(); 자동생성
		//부모 클래스에 기본 생성자가 없어져서
		//int 타입으로 넣어줘야함
		super(0);
		System.out.println("Child 생성자 실행됨");
	}
	public Child(int money) {
//		super(); 자동생성
		//부모 클래스에 기본 생성자가 없어져서
		//int 타입으로 넣어줘야함
		super(money);
		System.out.println("Child 생성자 실행됨");
	}
	public Child(String schoolName,int grade) {
		super(0);//부모생성자 호출 먼저super();
		//자식객체 생성자에서 할일들.. 나머지 코드
		this.schoolName = schoolName;
		this.grade = grade;
	
		System.out.println("Child 생성자 실행됨");
	}
	

public Child(String schoolName,int grade,int money) {
	super(money);//부모생성자 호출 먼저super();
	//자식객체 생성자에서 할일들.. 나머지 코드
	this.schoolName = schoolName;
	this.grade = grade;

	System.out.println("Child 생성자 실행됨");
}
	
	public void play() {
		System.out.println("나가서 뛰어노는중");
	}
	
	public void pringInfo() {
		System.out.println(schoolName+" "+grade+" "+money);
		System.out.println(age); //Child ->Parent-> grandParent 작동
	}
}
