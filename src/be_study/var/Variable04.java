package be_study.var;

public class Variable04 {
	public static void main(String[] args) { 
		int x = 1;
		int y = 2;
		double result2 = (double)x / y ;
					 //= (double)(x / y) ; 는 0.0 이 되어버림 이미 
										//int로 0이 되어버린 결과를 double로 바꾸는거라
		
		System.out.println(result2);
		
		//String + int String으로 변환되어 실행됨
		int value = 1+2+3;  	   //6	
		String str = 1 + 2 + "3";  //33   1+2 = 3 int+int 3+"3" = 33 int+String
		
		System.out.println(value+"\n"+str);
		
		String s1 = "12";
		int n1 = 11;
		int n2 = 22;
		System.out.println(n1 + n2 + s1);	// 3312
		System.out.println(n1 + s1 + n2);	// 111222
		
		
		//문자열 String을 다른 타입으로 변환   Integer.parseInt(s1)
//										Float.parseFloat() 등
		//클래스.메소드() 의 형태로 사용 됨
		System.out.println(Integer.parseInt(s1)); //int형으로 변환
		System.out.println(n1+Integer.parseInt(s1)+n2);  //45
		
		String s13 = 123 +""; //간단하게 스트링으로 변환하는 방법
		
//		String s4 = "12a.12b";
//		Double.parseDouble(s4);
	}
}
