package be_study.quiz;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		1. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		*****
//		****
//		***
//		**
//		*
		System.out.println("---------------------------------------");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("---------------------------------------");
//
//		2. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		*
//		**
//		***
//		****
		
		System.out.println("---------------------------------------\n");

		for (int i = 4; i >= 1; i--) {
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("---------------------------------------");
//
//		3. 입력된 수의 약수를 출력하시오.
//		ex) 입력 : 6
//		1 2 3 6
		System.out.println("---------------------------------------\n");
		
		System.out.print("약수를 구할 수를 입력해주세요 :");
		int sum = sc.nextInt();
		int sumPrint=0;
		System.out.printf("입력된 수 %d의 약수는?\n",sum);
		for (int i = 1;i<=sum;i++) {
			if(sum%i == 0) {
				
				System.out.print(i+" ");
			}
		}
		System.out.println("");
		
		System.out.println("---------------------------------------");
//
//		4. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		숫자를 입력받고 아래 문양으로 * 출력하기
//		ex) 입력 : 5
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
		
		System.out.println("---------------------------------------\n");
		
		
		System.out.print("별의 갯수를 입력해주세요 :");
		int starSum = sc.nextInt();

		for (int i = starSum; i >= 1; i--) {
			for (int j = starSum; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 1; i <= starSum-1; i++) {
			for (int j = starSum-1; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
//
		System.out.println("---------------------------------------");
//
//		5. 1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는?
//
		int total = 0;
		for(int i =1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				total += j;
			}
		}System.out.println(total);
		
		System.out.println("---------------------------------------\n");
		
//		6. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
//		100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.
	
		int total2 = 0;
		for(int i=1;;i++) {
			if(i%2 == 0) {
				total2 -= i;
			}else total2 += i;
			if(total2 >= 100) {
				System.out.println(total2);
				System.out.println("+"+i);
				break;
			}
		}
	
	
	}

}
