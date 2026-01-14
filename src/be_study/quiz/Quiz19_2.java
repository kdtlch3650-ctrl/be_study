package be_study.quiz;

import java.util.Scanner;

public class Quiz19_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub

		// 2차원 배열과 인덱스 조정하기.
		// 2차원 배열을 활용하여 다음 결과가 나오도록 코드를 작성하시오.
		// 규칙을 찾아서 중첩된 반복문을 활용하여 값을 저장하고
		// 아래와 같이 4*4 형태로 출력하시오.

//		1.
//		1 2   3   4
//		5 6   7   8
//		9 10 11 12
//		13 14 15 16
		int n = 1;
		int[][] arrA = new int[4][4];
		
//		for (int i = 0; i < 4; i++) {
//			for (int j = 1; j <= 4; j++) {
//				System.out.printf("%3d", i * 4 + j);
//			}
//			System.out.println("");
//		}
		
		for(int i = 0; i<4; i++) {
			for(int j = 0;j<4;j++) {
				arrA[i][j] = n++;
				System.out.printf("%3d", arrA[i][j]);
			}System.out.println("");
		}

//
//		2.
//		1 5  9  13
//		2 6 10 14
//		3 7 11 15
//		4 8 12 16

		System.out.println("");
		System.out.println("");

//		for (int i = 1; i <= 4; i++) {
//			for (int j = 0; j <= 12; j += 4) {
//				System.out.printf("%3d", i + j);
//			}
//			System.out.println("");
//		}
		
		n=1;
		for(int i = 0; i<4; i++) {
			for(int j = 0;j<4;j++) {
				arrA[i][j] = n+(i)+(j*4);
				System.out.printf("%3d", arrA[i][j]);
			}System.out.println("");
		}
//
//		3.
//		16 15 14 13
//		12 11 10 9
//		8   7   6  5
//		4   3   2  1
		System.out.println("");
		System.out.println("");

		// 날먹
//		for (int i = 0; i < 4; i++) {
//			for (int j = 1; j <= 4; j++) {
//				System.out.printf("%3d",17-(i * 4 + j));
//			}
//			System.out.println("");
//		}

		// case1
//		for (int i = 4; i > 0; i--) {
//			for (int j = 0; j <= 3; j++) {
//				System.out.printf("%3d", i * 4 - j);
//			}
//			System.out.println("");
//		}

		// case2
//		for (int i = 16; i > 0; i -= 4) {
//			for (int j = 0; j <= 3; j++) {
//				System.out.printf("%3d", i - j);
//			}
//			System.out.println("");
//		}

		n = 16;
		for(int i = 0; i<4; i++) {
			for(int j = 0;j<4;j++) {
				arrA[i][j] = n--;
				System.out.printf("%3d", arrA[i][j]);
			}System.out.println("");
		}
//
//		4.
//		16 12 8 4
//		15 11 7 3
//		14 10 6 2
//		13 9  5 1

		System.out.println("");
		System.out.println("");
		// 날먹
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 0; j <= 12; j += 4) {
//				System.out.printf("%3d", 17 - (i + j));
//			}
//			System.out.println("");
//		}
		n = 16;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j ++) {
				arrA[i][j] = n-(i)-4*j;
				System.out.printf("%3d", arrA[i][j]);
			}
			System.out.println("");
		}

		// case1
//		for (int i = 16; i > 12; i--) {
//			for (int j = 0; j <=3; j++) {
//				System.out.printf("%3d", i-j*4);
//			}
//			System.out.println("");
//		}

		// case2 직관성 올랐...나?
//		for (int i = 16; i > 12; i--) {
//			for (int j = 0; j <= 12; j += 4) {
//				System.out.printf("%3d", i - j);
//			}
//			System.out.println("");
//		}

		// 입력 받은 수^으로 만들어 보기

//		System.out.println("표를 만들 숫자를 입력 :");
//		int scanA = sc.nextInt();
//		for (int i = scanA*scanA; i > (scanA*scanA - scanA); i--) {
//			for (int j = 0; j <= (scanA*scanA - scanA); j += scanA) {
//				System.out.printf("%3d", i - j);
//			}
//			System.out.println("");
//		}

	}

}
