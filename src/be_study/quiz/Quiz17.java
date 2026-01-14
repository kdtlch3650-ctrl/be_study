package be_study.quiz;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//		1.
//		2x + 4y = 10 이 만족하는
//		모든 x, y 쌍을 구하시오.
//		(x와 y는 자연수 1~10)

		System.out.println("---------------------------------------");

		int x = 0;
		double y = 0;

		for (int i = 1; i <= 10; i++) {
			y = (5 - i) / 2.0;
			if (y % 1 == 0 && y > 0) {
				System.out.println("x=" + i + "y=" + (int) y);
			}
		}

		System.out.println("---------------------------------------");

//		2.
//		정수 2개를 입력 받아서,
//		아래 계산 결과를 출력하시오.
//		큰수 - 작은수

		System.out.println("---------------------------------------\n");
//
		System.out.println("정수 1 :");
		int sumA = scanner.nextInt();
		System.out.println("정수 2 :");
		int sumB = scanner.nextInt();

		if (sumA > sumB) {
			System.out.printf("큰수 %d - 작은수 %d = %d", sumA, sumB, (sumA - sumB));
		} else if (sumB > sumA) {
			System.out.printf("큰수 %d - 작은수 %d = %d", sumB, sumA, (sumB - sumA));
		} else {
			System.out.print("결과는 : 0");
		}
		System.out.println();
		
//		int result = (sumA > sumB) ? sumA - sumB : sumB - sumA);

		System.out.println("---------------------------------------");

//		3.
//		윷놀이 게임
//		4개의 윷을 입력받고 결과를 출력하시오.
//		(뒷도는 없습니다!)
//		0 : 안 뒤집어진 상태
//		1 : 뒤집어진 상태
//		ex) 입력 0 0 1 0
//		결과 도
//		입력 0 1 0 1
//		결과 개

		System.out.println("---------------------------------------\n");

		int[] sumArr01 = new int[4];
		int game = 0;

		for (int i = 0; i < 4; i++) {
			System.out.print(i + "번째 윷(앞 0 뒤 1) :");
			
			sumArr01[i] = scanner.nextInt();
			while (sumArr01[i] > 1) {
				System.out.println("다시 입력해주세요.");
				System.out.print(i + "번째 윷(앞 0 뒤 1) :");
				sumArr01[i] = scanner.nextInt();
			}
		}
		for (int i = 0; i < 4; i++) {
			if (sumArr01[i] == 1) {
				game++;
			}
		}

		String gameA = "";

		switch (game) {
		case 0: {
			gameA = "모";
			break;
		}
		case 1: {
			gameA = "도";
			break;
		}
		case 2: {
			gameA = "개";
			break;
		}
		case 3: {
			gameA = "걸";
			break;
		}
		case 4: {
			gameA = "윷";
			break;
		}
		}
		System.out.println("결과 :" + gameA);

		System.out.println("---------------------------------------");
//
//		4. 입력받은 수 만큼 별 출력하기
//		ex) 4
//		****
//		5
//		*****

		System.out.println("---------------------------------------\n");

		System.out.println("입력한 정수만큼 별을 출력해드려요 :");
		int star = scanner.nextInt();

		for (int i = 1; i <= star; i++) {
			System.out.print("*");
		}System.out.println("");

		System.out.println("---------------------------------------");

	}

}
