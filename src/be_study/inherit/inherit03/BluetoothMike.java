package be_study.inherit.inherit03;

public class BluetoothMike extends Mike {
	boolean isConnected;
	int battery;

	public void connect() {

	}

	//메소드 재정의 (오버라이딩) 부모에서 정의된 메서드를 다시 정의
	public void volumeUp() {
		System.out.println("Buletooth 재정의 Mike volumeUp");
	}
	
	//접근 제한자의 범위를 줄이면서 재정의 할 수 없다.
//	pirvate void volumeUp() {
//		System.out.println("Buletooth 재정의 Mike volumeUp");
//	}
	
	//오버로딩(다른 매개변수를 받은 경우)
	public void volumeUp(int v) {
		System.out.println(v+"만큼 볼륨업!!");
	}
	
	//final 메소드는 재정의 오버라이딩 불가.
//	public void nomethod() {
//		System.out.println("nomethod");
//	}
}
