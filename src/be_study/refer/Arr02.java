package be_study.refer;

public class Arr02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10; // 10
		int[] nArr1 = new int[5]; // 5
		int[][] nArr2 = new int[3][5]; // 15
		/*
		 * ㅁㅁㅁㅁㅁ ㅁㅁㅁㅁㅁ ㅁㅁㅁㅁㅁ
		 * 
		 */

		int[][] nArr3 = new int[4][3];
		/*
		 * ㅁㅁㅁ ㅁㅁㅁ ㅁㅁㅁ ㅁㅁㅁ nArr3[1][2]
		 */

		int[] nArray1 = { 1, 2, 3, 4, 5, 6 };
		int[][] nArray2 = { { 1, 2, 3, }, { 4, 5, 6 } };
		int[][] nArray3 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

//		System.out.println(nArray2[0][2]);

		int[][] nArrray4 =new int[2][3];
		//[2]가 [3] 3개의 값을 가진 배열의 주소를 가지고 있음 
		//즉, 3개의 값을 가진 배열을 2개 가진 배열
		
		for(int i = 0;i<nArray2.length;i++) {
			for(int j = 0 ; j<nArray2[i].length;j++) {
				System.out.print(nArray2[i][j]+" ");
			}
			System.out.println();
		}
	}

}
