package be_study.quiz;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

//1.
//+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
//몇번째 수인가요? : 그에 해당하는 수를 출력
//ex) 10 20 30 50 90
//몇번째 수인가요? 5
//결과 : 90
		
		System.out.println("----------------------------------------------");
		
		int[] Arr1 = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.printf("정수를 입력해주세요(%d번째) :", i + 1);
			Arr1[i] = scanner.nextInt();
		}

		System.out.printf("몇번째 수를 출력할까요? :");
		int a = scanner.nextInt();
		System.out.println(Arr1[a - 1]);
		
		System.out.println("----------------------------------------------");

//2.
//+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
//받은후에 순서를 거꾸로 출력하세요.
//ex) 1 2 3 4 5
//결과 : 5 4 3 2 1
		
		System.out.println("----------------------------------------------");
		
		int[] Arr2 = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.printf("정수를 입력해주세요(%d번째) :", i + 1);
			Arr2[i] = scanner.nextInt();
		}
		for(int i = 4;i>=0;i--) {
			System.out.print(Arr2[i]+" ");
		}
		System.out.println();
		
		System.out.println("----------------------------------------------");
		
//3. 4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
//(*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
//1   2   3   4
//5   6   7   8
//9  10 11 12
//13 14 15 16
		
		System.out.println("----------------------------------------------");
		
		int[][] Arr3 =new int [4][4];
		for(int i=0;i <4;i++) {
			for(int j=0;j <4;j++) {
				Arr3[i][j]= (i*4)+(j+1);
				System.out.printf("%3d",Arr3[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------------");
		
	}

}
