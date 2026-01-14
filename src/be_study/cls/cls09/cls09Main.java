package be_study.cls.cls09;

public class cls09Main {
	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 20;
		int n3 = 30;

		int[] nArr = { 10, 20, 30 };
		int[] nArr2 = new int[5];

		for (int i = 0; i < nArr.length; i++) {
			System.out.println(nArr[i] + " ");
		}
		System.out.println();

		// nArr2[0]부터 n에 값 넣음
		// 향상된 for문
		// 위 for문과 같은 결과값
		for (int n : nArr) {
			System.out.print(n + " ");
		}
		System.out.println();

		System.out.println(methodA(n2));

		methodB(nArr);
		methodB(nArr2);

		int[] cArr = methodC(null);
		methodB(cArr);

		System.out.println("----------------------");
		Temp t1 = new Temp();
		Temp t2 = new Temp();
		Temp t3 = new Temp();
		Temp[] tArr = { new Temp(), new Temp(), new Temp() };
		Temp[] tArr1 = { t1, t2, t3 };
		Temp[] tArr2 = new Temp[5]; // 공간만 생성 ex주차장
		tArr2[3] = new Temp(); // 객체 생성

		for (int i = 0; i < tArr.length; i++) {

			System.out.print(tArr[i].num);
			tArr[i].method();

		}
		
		for(Temp t : tArr1) {
			System.out.println(t.num);
			t.method();
		}
//		for(Temp t : tArr2) {
//			System.out.println(t.num);
//			t.method();
//		}
		//빈 주소라 오류남 스태틱이면 가능
		System.out.println("=============================");
		methodD(t2);
		methodD(tArr[0]);
		
		methodE(tArr);
		
		Temp tf = methodF();
		methodD(tf);
		
		Temp[] tgArr = methodG();
		methodE(tgArr);
	}

	public static int methodA(int n) {

		return n + 10;
	}

	public static void methodB(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int[] methodC(int[] arr) {

		int[] ar = { 5, 4, 3, 2, 1 };

		return ar;
	}
	
	public static void methodD(Temp t) {
		System.out.println(t.num);
		t.method();
	}
	
	public static void methodE(Temp[] arr) {
		for(Temp t : arr) {
			System.out.println(t.num);
			t.method();
		}
		System.out.println();
	}
	
	public static Temp methodF() {
		Temp t = new Temp();
		t.num = 99;
		return t;
	}

	public static Temp[] methodG() {
		Temp[] arr = new Temp[2];
		arr[0] = new Temp();
		arr[1] = new Temp();
	
		return arr;
	}
}

