package be_study.codeTest;

public class Day09_3 {
	public static void main(String[] args) {
		
		int balls = 15;
		int share = 4;
		int n_r = balls - share;

		int answer = 1;
		for (int i = 1; i <= share; i++) {
			answer *= balls-i+1; //15 14 13 12
			answer /= i;
		}
		//(n!)..(r+1)/(n-r)(r)
		System.out.println(answer);
	}
}
