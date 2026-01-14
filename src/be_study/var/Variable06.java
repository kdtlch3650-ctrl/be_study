package be_study.var;

import java.util.Scanner;

public class Variable06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("비교할 값을 입력하세요. ");
		int num1 = 	scanner.nextInt();
		int num2 = 10;
		
		boolean b1 = num1 == num2;
		System.out.println("당신의 입력한 값의 bool값은 : "+b1);
		
		scanner.nextLine();
		
		System.out.print("매일 니가 점심에 먹는거 ");
		String str1 = scanner.nextLine();
		String str2 = "햄버거";
		
		System.out.print(str1+"와");
		System.out.println(str2);
		System.out.println("결과는..."+str1 == str2);
		System.out.println("결과는..."+str1.equals(str2));
		System.out.println("결과는..."+str2.equals(str1));
		System.out.println("결과는..."+str1.equals("햄버거"));
		
		//문자열 (String) 값 비교할 때에는 == 쓰지말고 .equals 를 쓰자!
	}

}
