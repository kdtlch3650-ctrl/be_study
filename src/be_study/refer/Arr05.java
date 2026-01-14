package be_study.refer;

import java.util.Iterator;

public class Arr05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,20,30,40,50};
		
		//for문 비교
		
		for (int i=0; i<5;i++) {
			System.out.printf("arr[%d] = %d\n",i,arr[i]);
		}
		//향상된 for문 / 배열 전체 비교
		//v : 값이 주어진다. 인덱스는 몰?루
		for (int v : arr) { //{10,20,30,40,50}
			System.out.print(v+" ");
		}
		System.out.println();
		
		int[] scores = {90, 95, 100, 85,70};
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
		
		sum=0;
		for(int s:scores) {
			sum += s;
		}
		System.out.println(sum);
		
		sum=0;
		for(int s:scores) {
			sum += s;
			if(s == 100)break;
		}
		System.out.println(sum);
		
		sum=0;
		for(int s:scores) {
			System.out.println(s+" ");				
		}
		System.out.println(sum);
		//채점 실수 각 모든 점수 -5점 처리
		
		for (int s : scores) {
//			scores[s] = scores[s] -5;
//			s -= 5; 임시 값 s를 변경해도 의미가 없다.(지역변수 s)
			scores[s] -= 5;
		}
		
		sum=0;
		for(int s:scores) {
			System.out.println(s+" ");			
		}
		System.out.println(sum);
		
	}

}
