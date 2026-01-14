package be_study.codeTest;

public class Day7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string = "abcdef";
		String letter = "f";
		String answer = "";

		char[] charletter = letter.toCharArray();

		char[] b = new char[my_string.length()];
		int b_1 = 0;

		char[] a = my_string.toCharArray();

		for (int i = 0; i < a.length; i++) {
			if (a[i] == charletter[0]) {

			} else {
				b[b_1] = a[i];
				b_1++;
			}
			
		}
		for (int i = 0; i < b.length; i++) {
			answer += b[i];
		}
		System.out.println(answer);
	}

}
