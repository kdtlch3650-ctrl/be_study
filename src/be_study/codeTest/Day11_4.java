package be_study.codeTest;

public class Day11_4 {
	public static void main(String[] args) {
		int n = 3628800;
		int answer = 1;
		int pa = 1;
		// 정수
		for (int i = 1; i <= n; i++) {
			pa = 1;
			for (int j = 1; j <= i; j++) {
				pa *= j;
			}
			if (pa <= n) {
				answer = i;
			} else
				break;
		}
		System.out.println(answer);
	}
}
