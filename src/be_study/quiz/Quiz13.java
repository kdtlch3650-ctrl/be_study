package be_study.quiz;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.

//		----------------------------------------------------------

		System.out.print("정수를 입력해주십시오:");
		int sum = scanner.nextInt();

		if (!(sum == 0)) {
			if (sum % 2 == 0) {
				System.out.println("even");
			} else if (!(sum % 2 == 0)) {
				System.out.println("odd");
			}
		} else
			System.out.println("0은 나눌 수 없습니다.");

//		----------------------------------------------------------

//		2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
//

//		----------------------------------------------------------

		System.out.print("정수를 입력해주십시오:");
		int sum2 = scanner.nextInt();

		if (sum2 % 7 == 0) {
			System.out.println("7의 배수입니다.");
		} else
			System.out.println("7의 배수가 아닙니다.");

//		----------------------------------------------------------

//		3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.

//		----------------------------------------------------------

		int sum3 = 0;
		for (int i = 5; i <= 1000; i += 5) {
			sum3 += i;
//			System.out.println("+"+i);
//			System.out.print(sum3+"\n");
		}
		System.out.println(sum3);

//		----------------------------------------------------------

//
//		4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
//		ex) 입력 : 10
//		결과 : **********

//		----------------------------------------------------------

		System.out.print("1~50의 정수를 입력해주세요.");
		int sum4 = scanner.nextInt();

		String strSum4 = "";
		if (sum4 <= 50) {
			for (int i = 1; i <= sum4; i++) {
				strSum4 += "*";
			}
			System.out.println(strSum4);
		} else
			System.out.print("1~50의 정수를 입력해");

//		----------------------------------------------------------

		//  5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
		// ex) 1 - 2 + 3 - 4 .....

//		----------------------------------------------------------

		int sum5 = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum5 -= i;
//				System.out.println(sum5);
			} else {
				sum5 += i;
//				System.out.println(sum5);
			}
		}
		System.out.println(sum5);

//		----------------------------------------------------------

//		6. 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고
//		1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
//

//		----------------------------------------------------------

		int sum6 = 0;
		for (int i = 1;; i++) {
			sum6 += i;
			if (sum6 > 1000)
				break;
//			System.out.println(i);
		}
		System.out.println(sum6);

//		----------------------------------------------------------

//		7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
//		ex) 입력 3
//		3 * 1 = 3
//		3 * 2 = 6
//		3 * 3 = 9
//		...
//		3 * 9 = 27
		
//		----------------------------------------------------------
		
		System.out.print("정수를 입력해주세요.");
		int sum7 = scanner.nextInt();
		
		
			for(int i=1;i<=9;i++) {
				System.out.println(sum7+" * "+ i +" = "+sum7*i);
			}
		
//		----------------------------------------------------------

	}

}
