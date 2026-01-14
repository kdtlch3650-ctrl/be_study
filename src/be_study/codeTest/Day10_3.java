package be_study.codeTest;

public class Day10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2,3};
		int k = 3;
		int answer = 1;
		
		for(int i= 1;i<k;i++) {			
			answer += 2;
			
			if(answer > numbers.length) {
				answer-=numbers.length;
			}
		}
		System.out.println(answer);
	}

}
