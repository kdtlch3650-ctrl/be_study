package be_study.quiz;

import java.util.Scanner;

public class Quiz23_reviwe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub

		System.out.println("탑승 인원 수 입력 :");
		int personCount = sc.nextInt();

		int[] destFloorArr = new int[personCount];
		System.out.println("목적지 층수 입력(2~100) : ");
		for (int i = 0; i < destFloorArr.length; i++) {
			destFloorArr[i] = sc.nextInt();
		}

		for (int i = 1; i <= 100; i++) {
			System.out.print(i + "층 ");
			for (int j = 0; j < destFloorArr.length; j++) {
				if (destFloorArr[j] == i) {
					System.out.print("문이 열립니다.");
				}
			}
			System.out.println("");
		}
		for (int i = 1; i > 100; i++) {
			System.out.println(i + "층");
		}

	}

}
