package be_study.codeTest;

public class Day08_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] emergency = { 30, 10, 23, 6, 100 };
		int[] answer = new int[emergency.length];

		// 제일 큰수
		int maxnum = 0;

		// 제일 큰수의 배열
		int maxArrNum = 0;
		int answerArrNum = 1;
		while (true) {
			maxnum = 0;
			maxArrNum = 0;

			for (int i = 0; i < emergency.length; i++) {
				if (maxnum < emergency[i]) {
					maxnum = emergency[i];
					maxArrNum = i;
				}
			}
			answer[maxArrNum] = answerArrNum;

			emergency[maxArrNum] = 0;

			if (answerArrNum != emergency.length) {
				answerArrNum++;
			} else
				break;

		}
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]);
		}
			
	}

}
