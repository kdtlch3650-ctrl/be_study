package be_study.cls.cls11;

public class ReturnMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메소드 호출 -> 결과 리턴
		
		//수능 성적
		//국어 수학 외국어
		
		AllScore as1 = getScore();
		System.out.println(as1.lang);
		System.out.println(as1.math);
		System.out.println(as1.eng);
		
		
	}
	
	public static int mathScore() {
		return 90;
	}

	public static int engScore() {
		return 80;
	}
	
	public static String scoreInfo() {
//		return "859080";
		return "100,90,80"; //언어 수리 외국 ,구분 귀찮 번거로움
		}
	public static AllScore getScore() {
		AllScore as = new AllScore();
		as.lang = 100;
		as.math = 90;
		as.eng = 80;
		
		return as;
	}
}
