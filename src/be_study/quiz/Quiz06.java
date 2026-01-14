package be_study.quiz;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		// 1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 삼각형의 넓이 = 밑변 * 높이 / 2 ;
		
		System.out.print("삼각형 밑변 입력 : ");
		double tri1 = scanner.nextDouble();
		System.out.print("삼각형 높이 입력 : ");
		double tri2 = scanner.nextDouble();
		
		double tri3 = tri1*tri2/2;
		
		System.out.println("삼각형의 넓이는 = "+tri3);
		
		// 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 사다리꼴의 넓이 = (윗변 길이 + 밑변 길이) * 높이 / 2;
		
		System.out.print("사다리꼴 윗변 입력 : ");
		double trapezoid1 = scanner.nextDouble();
		System.out.print("사다리꼴 밑변 입력 : ");
		double trapezoid2 = scanner.nextDouble();
		System.out.print("사다리꼴 높이 입력 : ");
		double trapezoid3 = scanner.nextDouble();
		
		double trapezoid4 = (trapezoid1+trapezoid2)*trapezoid3/2;
		
		System.out.println("삼각형의 넓이는 = "+trapezoid4);

		// 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
		// 모두에게 공정하게 동일한 숫자의 과자를 나누어주면
		// 한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요.
		
		int students = 24;
		int cookies = 100;
		
		int a = cookies/students;
		int b = cookies%students;
//		
//		System.out.printf("명당 과자수 %d, 남는 쿠키 %d ",a ,b);

		// 4번. 세자리의 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
		// 158
		// 백의자리 : 1
		// 십의자리 : 5
		// 일의자리 : 8
		
		System.out.print("세자리 정수 입력 : ");
		int abc = scanner.nextInt();
		
		System.out.printf("백의 자리 = %d\n십의 자리 = %d\n일의 자리 = %d\n",abc/100,abc%100/10,abc%100%10);

		// 5번 x와 y 변수 안에 들어있는 서로의 값을 바꾸기
		
		int x = 10;
		int y = 20;
		System.out.println("x="+x+ " y="+y);
		
		//x와 y를 바꾼 작업 
		
		int z = x;
		x = y;
		y = z;
		
		System.out.println("x="+x+ " y="+y);
	}
}
