package be_study.quiz;

import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

//		1.
//		두 개의 주사위를 던졌을 때, 두 눈의 합이 6이 되는
//		모든 경우의 수를 출력하는 프로그램을 작성하시오.

		int j = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.printf("주사위 하나가 %d가 나왔을 때 :\n", i);
			j = 6 - i;
			System.out.printf("나머지 하나의 수는 %d입니다.\n", j);
		}

//		2.
//		로또 번호 6개 랜덤하게 생성하기. ( 1~45 중 )
//		최종 6개의 번호는 6칸의 배열에 저장되어야 한다.
//		로또 번호는 동일한 번호가 중복되어 들어갈 수 없다.
//		1) Math.random() 활용
//		2) int[] lotto = new int[6]; 활용
//
		int[] lotto = new int[6];
		boolean isloop = true;

		boolean isDup = true;
		int k = 0;
		for (int i = 0; i < 6; i++) {

			lotto[i] = (int) (Math.random() * 45) + 1;


			while (k < i) {
				if ((lotto[k] == lotto[i])) {
					lotto[i] = (int) (Math.random() * 45) + 1;
					k = 0;
				} else
					k++;
			}

			System.out.println(lotto[i]);
		}

//
//		3.
//		우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
//		반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,
//		각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.
//		(*가능한 효율적인 구조를 생각해보세요)
//
//		ex)
//		1반 : 10 10 10 10 10
//		2반 : 20 20 20 20 20
//		3반 : 30 30 30 30 30
//
//		1반 평균 : 10
//		2반 평균 : 20
//		3반 평균 : 30
//		전체 평균 : 20

		int[][] school = new int[3][5];

		double[] classAvg = new double[3];

		double avg = 0;

		for (int i = 0; i < 3; ++i) {
			for (int m = 0; m < 5; ++m) {
				System.out.printf("%d반 %d번 점수 :\n", i + 1, m + 1);
				school[i][m] = sc.nextInt();
				classAvg[i] += school[i][m];
			}
			avg += classAvg[i];
		}

		for (int i = 0; i < 3; ++i) {
			System.out.print((i + 1 + "반 :"));
			for (int n = 0; n < 5; ++n) {
				System.out.printf("%3d", school[i][n]);
			}
			System.out.println("");
		}

		for (int i = 0; i < 3; ++i) {

			System.out.printf("%d반 평균 : %.2f\n", i + 1, classAvg[i] / 5.0);

		}
		System.out.printf("전체 평균 : %.2f\n", avg / 15);

//
//
//		4. 주어진 2차원 배열보다 행과 열이 1씩 큰 배열을 선언하여,
//		각 행의 합과 각 열의 합, 마지막에는 전체의 합이 출력되도록 프로그램을 작성하시오.
//
//		ex)
//		int[][] arr =
//		{
//		{10, 20, 30},
//		{20, 30, 40},
//		{30, 40, 50}
//		};
//		이 주어지는 경우 최종 결과는
//		10 20 30 60
//		20 30 40 90
//		30 40 50 120
//		60 90 120 270

		int[][] arr = { { 10, 20, 30 }, { 20, 30, 40 }, { 30, 40, 50 } };

		int[][] arr2 = new int[(arr.length) + 1][(arr[0].length) + 1];

		for (int i = 0; i < 3; i++) {
			arr2[i][arr[0].length] = arr[i][0] + arr[i][1] + arr[i][2];

			arr2[arr.length][i] = arr[0][i] + arr[1][i] + arr[2][i];

			arr2[arr.length][arr[0].length] += (arr2[i][arr[0].length]);
		}

		for (int i = 0; i < 4; i++) {
			for (int l = 0; l < 4; l++) {
				if (i < 3 && l < 3) {
					arr2[i][l] = arr[i][l];
				}
				System.out.printf("%4d", arr2[i][l]);
			}
			System.out.println("");
		}

	}

}
