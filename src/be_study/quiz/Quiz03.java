package be_study.quiz;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 아래 1), 2) 에 맞게 풀이.
	

//	1) 결과가 2가 나오도록 작성하세요
	int x = 10;
	int y = 4;
	int result = x/y;
	System.out.println(result);
//	2) 결과가 2.5가 나오도록 작성하세요
	int xx = 10;
	int yy = 4;
	double result2 = (double)xx/yy;
	System.out.println(result2);

//	2. 결과가 7.5가 나오도록 작성하세요
	double a = 3.5;
	double b = 4.7;
	double result3 = a+(int)b;
	System.out.println(result3);

//	3. 계산결과가 12가 나오도록 작성하세요
	String a2 = "3.4";
	String b2 = "4";
	int result4 = (int)(Double.parseDouble(a2))*Integer.parseInt(b2);
	System.out.println(result4);

//	----------------------------------------------------

//	4. 계산결과가 "1013" 이 나오도록 코드를 작성하세요.
	String a3 = "10";
	int b3 = 3;
	double c3 = 4.5;
	String result5 = a3+(b3+Integer.parseInt(a3));
	String result5_1 = a3+(int)(b3*c3);
	System.out.println(result5_1);
//
//
//	5. 계산결과가 "243" 이 나오도록 코드를 작성하세요.
	int a4 = 4;
	double b4 = 3.4;
	String c4 = "6.8";
	String result6 = a4*(int)(Double.parseDouble(c4))+String.valueOf((int)b4);
	System.out.println(result6);
	
	result6 = a4*(int)(Double.parseDouble(c4))+""+String.valueOf((int)b4);
	
	System.out.println(result6);
//
//	6. 계산 결과가 아래와 같이 나오도록 코드를 작성하세요.
//	int x2 = 111;
//	int y2 = 13;
//	int result7 = ;
//	System.out.println(result7);
//
//	1) 출력결과 : 7
	int x2 = 111;
	int y2 = 13;
	int result7 = x2%y2;
	System.out.println(result7);
//	2) 출력결과 : 8
	int x3 = 111;
	int y3 = 13;
	int result8 = x3/y3;
	System.out.println(result8);
	}

}
