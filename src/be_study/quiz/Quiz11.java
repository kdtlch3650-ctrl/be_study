package be_study.quiz;

public class Quiz11 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			System.out.println("12345");
		}

		for (int i = 1; i <= 5; i++) {
			System.out.println("" + i + i + i + i + i);
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {	
				System.out.print(j);
			}
			System.out.println("");
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}
}
