package be_study.cls.cls05;

public class Galaxy {

	// 필드변수

	// 인스턴스 멤버
	String owner;// 소유자
	String model;

	//정적 멤버
	static String madeBy = "삼성";
	//객체 생성 전에도 존재

	void showInfo() {
		System.out.println(owner + "님의" + model + "상품입니다.");
		System.out.println("근데 저는"+madeBy+"에서 만들어졌어요.");
	}

	static void showMadeBy() {
		System.out.println(madeBy + "에서 만든 갤럭시 상품입니다.");
//		System.out.println(owner + "님의 것입니다.");
		//오류남 owner가 이시점에서 뭔지 알 수 없어서.
		//static 메소드에서 인스턴스 멤버 변수에는 접근이 안된다.
	}
	// 스마트폰 갤럭시

}
