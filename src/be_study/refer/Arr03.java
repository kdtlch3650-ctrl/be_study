package be_study.refer;

public class Arr03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 1, 2, 3 };
		
		System.out.println( arr1[0] == arr1[2]);
		
		
		String[] arr2 = {"a","b","c"};
		
		System.out.println(arr2[0] == arr2[2]);
		//string 타입이기에 주소값을 비교 값을 비교하려면 equals
		System.out.println(arr2[0].equals(arr2[2]));
		
		int n = 10;
		String s = "의자";
		
		String[][] arr3 = {{"a","b","c"},{"d","e","f"}};
		
		System.out.println(arr3.length);

		System.out.println(arr3[0].length);
		
		System.out.println(arr3[0] == arr3[1]); //주소비교
		System.out.println(arr3[0][0] == arr3[1][1]); //string 이니 주소비교
		System.out.println(arr3[0][0].equals(arr3[1][1]));

	}

}
