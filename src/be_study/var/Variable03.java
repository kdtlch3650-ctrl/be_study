package be_study.var;

public class Variable03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ing < double
		
		int i1 = 30;
		int i2 = i1;
		
//		int i3 = 3.11; 정수형 변수 = 실수형 값 X
		
		double d1 = 3.11;
		double d2 = d1;
		
		double d3 = 40; //int형을 double로 자동 형변환
		System.out.println(d3);
		
		double d5 = i1; //int형을 double로 자동 형변환
		
		char c1 = 'A';
		int i3 = c1;
		System.out.println(c1);
		System.out.println(i3);
		
		char c2 = (char)i3 ;
		System.out.println(c2);
		
		double dd1 = 12.54;
		int ii1 = (int)dd1; //12.54->12 (버림)
		System.out.println(ii1);
		
		float f1 = (float)4.45;
		f1 = 4.45f;					//f붙이기 형변환
		double dd2 = f1;			//float < double 자동 타입 변환 
		
		//연산에서 타입변환
		int i10 = 3;
		double d10 = 5;
		//int i11 = i10 + d10; //int + double = double 타입이 된다 고로 double을 int로 자동 형변환 불가	
		double d11 = i10 + d10;
		
		int i12 = 10;
		double d12 = 5.5;
		
		int i13 = (int)(i12+d12);
		
		double dv1 = 5.5;
		double dv2 = 6.6;
		
		int result = (int)dv1 + (int)dv2;
		//5+6 = 11

		result = (int)(dv1+dv2);
	    //12
		
		int x = 1;
		int y = 2;
		double result2 = x / y ; // int / int = int 
					// 1 / 2  -> 0.5 - > 0
		
	}

}
