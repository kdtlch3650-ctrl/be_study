package be_study.refer;

public class Arr04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열 참조타입 vs 기본타입 ( int 등)
		int a = 10;
		int b = a;
		System.out.println(a + " " + b);

		b = 20;
		System.out.println(a + " " + b);

		
		// 얕은 복사 (shallow copy) vs 깊은복사(deep copy)
		
		// 얕은 복사
//		int[] arr1 = { 10, 20, 30 };
//		int[] arr2 = arr1;
		
		//깊은 복사
		int[] arr1 = { 10, 20, 30 };
		int[] arr2 = new int[3];
		
		//for문으로
//		for (int i = 0; i < arr2.length; i++) {
//			arr2[i] = arr1[i];			
//		}
		
		//System.arraycopy(복사대상, 복사대상인덱스, 저장대상, 저장대상인덱스, 갯수(길이));
		System.arraycopy(arr1, 0, arr2, 0, 3); //10 20 30
		System.arraycopy(arr1, 0, arr2, 1, 2); //0 10 20
		System.arraycopy(arr1, 1, arr2, 1, 2); //0 20 30
		
		
		

		for (int i = 0; i < 3; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

		
		arr2[0] = 99;

		
		for (int i = 0; i < 3; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}

}
