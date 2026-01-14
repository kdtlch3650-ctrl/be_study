package be_study.codeTest;

public class Day10_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {4,455,6,4,-1,45,6};
		int[] answer = new int[numbers.length];
		String direction = "l";
		
		if(direction.equals("right")) {
			for(int i = 0;i<numbers.length;i++) {
				if(i == 0) {
					answer[i] = numbers[numbers.length-1];
				}else
				answer[i] = numbers[i-1];
			}
		}else {
			for(int i = 0;i<numbers.length;i++) {
				if(i == numbers.length-1) {
					answer[numbers.length-1] = numbers[0];
				}else
				answer[i] = numbers[i+1];
			}
		}

		for(int i =0;i<answer.length;i++) {
			System.out.println(answer[i]);			
		}
	}

}
