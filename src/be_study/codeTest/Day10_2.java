package be_study.codeTest;

public class Day10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num_list = {1,2,3,4,5,6,7,8};
		int n = 2;
		int[][] answer = new int[num_list.length/n][n];
		
		//[총갯수/n][n]
		for(int i=0;i<num_list.length/n;i++) {
			for(int j=0;j<n;j++) {
				answer[i][j] = num_list[(i)*n+(j)];
			}
		}
		
		
		
	}

}
