package be_study.cls.cls08;

public class Singleton {
	
	//자기자신의 객체
	private static Singleton singleton = new Singleton();

	private Singleton() {
		
	}
	
	static Singleton getInstance() {
		if(singleton == null)
			singleton = new Singleton();
			
		return singleton;
	}
	
}
