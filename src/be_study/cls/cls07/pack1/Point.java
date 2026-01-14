package be_study.cls.cls07.pack1;

public class Point {
	int math; 
	public int eng;
	private int lang;
	
	public Point(){}
	
	public Point(int math, int eng, int lang){
		this.math = math;
		this.eng = eng;
		this.lang = lang;
	}

	void metsod1() {
		System.out.println("metsod1");
	}

	public void metsod2() {
		System.out.println("metsod2");
		
	}

	private void metsod3() {
		System.out.println("metsod3");
		
	}
	
	//Setter 저장용 양식
	//setXXX
	public void setMath(int math) {
		this.math = math;
		
	}
	
	public void setEng(int eng) {
		if(eng <= 100 && eng>=0) {
		this.eng = eng;
		}else {
			this.eng = 0;
		}
	}
	
	
	//lang private 이라서 기본적으로 접근 불가
	public void setLang(int lang) {
		this.lang = lang;
	}
	
	public int getMath() {
		return this.math;
	}
	
	public int getEng() {
		return this.eng;
	}
	
	public double getLang() {
		
		//학점으로 전환
		return this.lang*3.0/100;
		
	}
	
	
	
	
}
