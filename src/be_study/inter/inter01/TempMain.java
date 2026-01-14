package be_study.inter.inter01;

public class TempMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인터페이스 객체 생성 불가
//		Temp2interface tf = new Temp2interface();
		
		
		TempObject to = new TempObject();
		to.method1();
		to.method2();
		//자식에만 구현된 99메소드
		to.method99();
		
		Temp2interface ti = new TempObject();
		ti.method1();
		ti.method2();
		//인터페이스에 메소드가 구현되지 않아 불가
//		ti.method99();
		
		Tempinterface ti1 = new TempObject();
		Temp2interface ti2 = new TempObject();
		
		ti1.method3();
		ti2.method1();
		ti2.method2();
		
		Tempinterface[] tArr = {new TempObject(), new TempObject()};
		
		TempObject to2 = (TempObject)ti1;
		to2.method99();
		
	}
	

}
