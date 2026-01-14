package be_study.inter.inter01;

//상속: 부모클래스를 상속받겠다. 확장하겠다.

//인터페이스 구현하겠다. 인터페이스는 상속 여러개 가능!!!!
public class TempObject implements Temp2interface,Tempinterface {

	
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("method1()");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method2()");
	}
	
	public void method99() {
		// TODO Auto-generated method stub
		System.out.println("method99()");
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("method3()");
	}
	
	

}
