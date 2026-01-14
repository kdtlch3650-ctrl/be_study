package be_study.codeTest;

public class Day03_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		
		
		//answer의 배열 숫자를 담음
		int a = 0;
		//answer의 배열 크기
		int b = 0;
		
		
		for(int i = 1;i<=n;i++) {
			if(!(i%2 == 0)) {
				b++;
			}
		}

		int[] answer = new int[b];
		
		for(int i = 1;i<=n;i++) {
			if(!(i%2 == 0)) {
				answer[a] = i;
				a++;
			}
		}
		
		
		
//        return answer;		
	}

}
