package be_study.quiz;

public class QuizText01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x1 = 10;
		int y = 20;

		System.out.println(x1++ + y++);
		System.out.println(y++ - ++x1);
		x1 = 30;
		System.out.println(--x1 + y);
		System.out.println("x:" + x1 + " y:" + y);

		for (int i = 3; i >= 1; i--) {
			for (int j = 3; j >= 1; j--) {
				System.out.print((i + j) + " ");
			}
			System.out.println();
		}
		
		int[][] arr = new int[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i > j) {
					arr[i][j] = 1;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
