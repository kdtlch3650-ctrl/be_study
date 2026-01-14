package be_study.iter;

public class Iter03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {
			System.out.printf("---%d번 방청소---\n",i);

			for (int j = 1; j <= 3; j++) {
				System.out.println("쓸기");
			}

			int k = 1;
			while (k <= 2) {
				k++;
				System.out.println("닦기");
			}
			
			System.out.println("쓰레기 정리");

		}

	}

}
