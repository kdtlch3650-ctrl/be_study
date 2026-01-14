package be_study.cond;

public class Cond01 {
	public static void main(String[] args) {
		
		//조건문 if 문
		
		//if 가 참이면 실행
		
		int num = 5;
		
		if(num>5) {
			System.out.println("num이 5보다 크니");
			System.out.println("if 문 안에 실행한다");
		}else {
			System.out.println("num이 5보다 작으니");
			System.out.println("else 문 안에 실행한다");
			
		}
		
		boolean bln = (num != 15);
		
		if(bln) {
			System.out.println("15랑 다른 수");
		}else {
			System.out.println("15랑 같은 수");
		}
		
		System.out.println("end");
		

		
	}
}
