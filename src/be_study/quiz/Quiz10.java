package be_study.quiz;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("국어 점수");
		int kor = scanner.nextInt();
		System.out.println("영어 점수");
		int eng = scanner.nextInt();
		System.out.println("수학 점수");
		int mat = scanner.nextInt();
		while (kor < 0 || kor > 100 || eng < 0 || eng > 100 || mat < 0 || mat > 100) {
			System.out.println("점수 입력에 오류가 있습니다. (정수 범위 0~100)\n다시입력해주세요");
			System.out.println("국어 점수");
			kor = scanner.nextInt();
			System.out.println("영어 점수");
			eng = scanner.nextInt();
			System.out.println("수학 점수");
			mat = scanner.nextInt();
		}

		int subSum = kor + eng + mat;
		double subAve = subSum / 3.0;

		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + mat);
		System.out.println("----------------------------------------");

		if (kor >= 40 && eng >= 40 && mat >= 40 && subAve >= 60.0) {
			System.out.println("국어 : " + kor);
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + mat);
			System.out.println("합계 : " + subSum);
			System.out.println("평균 : " + subAve);
			System.out.println("축하합니다. 합격입니다!");
			System.out.println("----------------------------------------");
		} else {
			System.out.println("축하합니다. 불합격입니다!");
			System.out.println("----------------------------------------");
		}
	}
}
