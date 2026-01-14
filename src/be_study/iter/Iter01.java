package be_study.iter;

public class Iter01 {
	public static void main(String[] args) {
		// Iteration

		String eat = "";
		int istack = 4;
		// if 가 끝난 후 int i 가 사라짐 미리 선언 시에만 값이 남음
		for (int i = istack; i <= 8; i++) {
			eat += "배고파";
			System.out.printf("%s\n", eat);
		}

		for (int i = 1; i < 11; i++) {
			System.out.printf("다이어트 %d일차\n", i);
		}

		for (int i = 10; i > 5; i--) {
			System.out.printf("D-DAY %d\n", i);
		}
		
		int sum=0;
		
//		for (int i = 1 ; i<11;i++) {
//			sum = sum +i*10;
//		}
//		System.out.println(sum);
		
//		for (int i = 10 ; i<101;i+=10) {
//			sum += i;
//		}
//		System.out.println(sum);


		int r = 0;
		for(int i =1;i<11;i++) {
			r = r+1;
		}
		System.out.println(r);
		r = 0;
		
		for(int i=2; i<20;i=i*2) {
			r = r+1;
		}
		System.out.println(r);
		r = 0;
		
		for(int i=400; i>100; i=i-50) {
			r = r+1;
		}
		System.out.println(r);
		r = 0;
		for(int i=100;i>=90;i--) {
			r+=1;
		}
		System.out.println(r);
		r = 0;
	}
}
