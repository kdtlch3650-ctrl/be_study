package be_study.inherit.inherit03;

public class MikeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mike m1 = new Mike();
		m1.volumeUp();

		BluetoothMike bm01 = new BluetoothMike();
		bm01.volumeUp();
		
		WirelessMike wm01 = new WirelessMike();
		wm01.volumeUp();
		
		//final 클래스는 상속 불가
		//final 메소드는 오버라이딩 불가
		
	}

}
