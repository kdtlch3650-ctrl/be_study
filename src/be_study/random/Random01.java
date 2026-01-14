package be_study.random;

public class Random01 {
	public static void main(String[] args) {

		for (int i=1;i<=10;i++) {
			//기본 0<=랜덤값<1
			
			//(int)Math.random()*갯수(범위) + 시작숫자
			System.out.println((int)(Math.random()*10)+1);
			
			System.out.println((int)(Math.random()*50)+1);
			
			System.out.println((int)(Math.random()*100)+101);
			
			
		}
		
	}
}
