package be_study.var;

import java.util.Iterator;

public class Variable02 {
	public static void main(String[] args) {
		
		
		int num_2 =0b10;
		int num_8 = 012;
		int num_10 = 10;
		int num_16 = 0x30;
		
		char chr1 = 'A';    //char 타입 (정수) : 문자 1개 저장
							//'a' 작은 따옴표로 감싸서 문자 1개
							//'asd' ->  xxx
		
		
		char chr2 = 86;
		char chr3 = 0x0123;
		
		
//		char chr5 = '안녕'; //chr에는 한 글자만 가능
		String str1 = "안녕하세요"; // "큰따옴표"로 사용
		String s4 = "1234";
		
		int n = 1234;
		
		System.out.println( n + 10);
		
		System.out.println(s4+10);
		
		String msg = "\"안녕\"하세요";
		

		System.out.println(msg);
		
		String msg2 = "기호 1번 OOO \n기호 2번 XXX";
		

		System.out.println(msg2);
		
		double d1 = 12.123;
		int i = (int)1.2f;
		
		System.out.println(i);	
		
		for (int j = 0; j < 10; j++) {
			System.out.println(j+1);
		}
			
		boolean open = true;
		boolean close = false;
		
		boolean isOpen = true;
//		System.out.println(chr1);
	}
	
}
