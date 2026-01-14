package be_study.quiz.quiz32;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Quiz01 quiz01 = new Quiz01();

		// q1
		int[] a1 = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] + " ");
		}
		System.out.println("\n====================================");

		// q2
		a1[2] = 50;

		// q3
		System.out.println(a1.length);
		System.out.println("====================================");

		// q4
		int total = 0;
		for (int i = 0; i < a1.length; i++) {
			total += a1[i];
		}
		System.out.println("\n====================================");

		// q5
		for (int a : a1) {
			System.out.print(a + " ");
		}
		System.out.println("\n====================================");

		// 테스트
//		quiz01.upnum(a1);
//		System.out.println("테스트 : " + quiz01.maxnum(a1));
//		System.out.println("\n====================================");
		
		//q9
//		int[] test = quiz01.getintarr(9);
//		System.out.println(test.length);
		
//		q10
//		int[] test = quiz01.reversedArray(a1);
//		for(int i = 0; i < a1.length; i++) {
//		System.out.print(test[i]+" ");
//		}
		
		
	}

	// q6
	double avg(int[] a) {
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		return total / a.length * 1.0;
	}

	// q7
	int maxnum(int[] a) {
		int maxnum = 0;
		for (int i = 0; i < a.length; i++) {
			if (maxnum < a[i]) {
				maxnum = a[i];
			}
		}
		return maxnum;
	}

	// q8
	void upnum(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] + 1;
		}
	}
	
	//q9
	int[] getintarr(int a) {
		return new int[a];
	}
	
	//q10
	int[] reversedArray(int[] a) {
		int[] b = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			b[i]=a[a.length-i-1];
		}
		return b;
	}

}
