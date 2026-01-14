package be_study.codeTest;

public class Day6_1 {

	public static void main(String[] args) {
		String my_string = "asdf";
		int n = 3;
        String answer = "";
		
char[] a = my_string.toCharArray();
        
        for(int i = 0; i<a.length;i++) {
            for (int j = 0 ; j<n;j++){
			answer += a[i];
            }
		}
        
        
        
	}

}
