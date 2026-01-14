package be_study.codeTest;

import java.util.Arrays;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 0;
		int[] array = {1,1,2,2};
		
		Arrays.sort(array);
		
		int[] num = new int[array.length];
		int[] numCount = new int[array.length];
		
		int k = 0;
		int m = 0;
		//정렬된 배열 둘러보면서 같은거 있으면(붙어있음) 그만큼 숫자셈 
		
		
		while(k+1 < array.length) {
			//값복사
			num[m] = array[k];
			//다음 배열 값
			k++;
			//다음배열이 전의 배열하고 같냐?
			if(num[m] == array[k]) {
				//같으면 카운터 갯수 증가
				numCount[m]++;
			}else {
				//다르면 다음 num배열에 저장
				m++;
			}
		}
		int maxCount = 0;
		int arrNumber = 0;
		
		//i저장 뭔가 이상함
		for(int i = 0;i<numCount.length;i++) {
			
			//배열 값이 하나일 때 반복문 없이 바로 값입력 탈출
			if (array.length == 1) {
				answer = array[0];
				break;
			}
			
			//현재 배열의 중복값을 현재 최대 중복값과 비교 높으면 교체 
			if(maxCount<numCount[i]) {
				//기본값 1추가
				maxCount = numCount[i];
				//최대 카운트 배열 번호
				arrNumber = i;
				//출력값
				answer = num[i];
				
			}else if(maxCount==numCount[i]) {//최빈값이 중복일경우
				answer = -1;
			}
		}
		
		
		//맥스 카운트가 같은경우 체크 필요
		//완료함 테스팅 ㄱ

		System.out.println(answer);
//		

	}
}
