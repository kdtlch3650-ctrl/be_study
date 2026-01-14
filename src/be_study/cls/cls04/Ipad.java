package be_study.cls.cls04;

public class Ipad {

	String owner;

	Ipad() {
		owner = "이찬희";
	}

	Ipad(String owner) {
		this.owner = owner;
	}

	void showInfo() {
		System.out.println("Ipad 정보 출력 ====");
		System.out.printf("%s의 아이패드입니다.\n", owner);
		// 같은 클래스에 들어있기에 사용가능 batteryNum()
		System.out.println("배터리 잔여량 : " + batteryNum());
	}

	int batteryNum() {
		return 80;
	}

	void returnCheck() {

		for (int i = 1; i <= 10; i++) {

			System.out.println(i);

			if (i == 5)
				return;
//				break;

		}
		for (int i = 1; i <= 10; i++) {

			System.out.println(i);
		}
	}
}
