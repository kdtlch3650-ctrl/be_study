package be_study.var;

import java.util.Scanner;

public class Variable05 {
	public static void main(String[] args) {
		
		System.out.println("println1");
		System.out.println("println2");
		
		String s1 = "text test";
		System.out.println(s1);
		
		System.out.print("print1");
		System.out.print("print2");
		
		System.out.println(); //줄바꿈
		
		System.out.printf("번호 : %d\n%d\n%d", 123, 3215321, 141245);

		double rate = 3.4612;
		System.out.printf("오늘 기준 이자율은 %.2f%% 입니다 \n",rate);
		System.out.printf("오늘 기준 이자율은 %10.4f%% 입니다 \n",rate);
		System.out.printf("오늘 기준 이자율은 %-10.4f%% 입니다 \n",rate);
		
		//입력 받기 Scannar
		 
		Scanner scanner = new Scanner(System.in);
		
		//int 정수형 	   scanner.nextInt()
		//double 실수형  scanner.nextDouble()
		//String 문자열  scanner.nextLine()
		
		System.out.print("숫자를 입력하세요(int) : ");
		int number = scanner.nextInt();
		System.out.println("당신이 입력한 숫자는 "+number+"입니다.");
		System.out.printf("당신이 입력한 숫자는 %d입니다.\n ", number);
		
		System.out.print("숫자를 입력하세요(double) : ");
		double number2 = scanner.nextDouble();
		System.out.println("당신이 입력한 숫자는 "+number2+"입니다.");
		System.out.printf("당신이 입력한 숫자는 %f입니다.\n ", number2);
		
		System.out.print("문자를 입력하세요(String) : ");
		String number3 = scanner.nextLine();
		number3 = scanner.nextLine();
		System.out.println("당신이 입력한 문자는 "+number3+"입니다.");
		System.out.printf("당신이 입력한 문자는 %s입니다.\n ", number3);
		
	}
}
