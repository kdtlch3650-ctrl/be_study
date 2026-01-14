package be_study.codeTest;

public class Day08_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] numbers = {1,2,3,4,5};
		int num1 = 1;
		int num2 = 3;
		int[] answer = new int[num2 - num1 + 1];
		

		int a = 0;

		for (int i = num1 - 1; i < num2; i++) {
			answer[a] = numbers[i];
			a++;
		}
		
	}

}
