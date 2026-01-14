package be_study.codeTest;

public class Day08_2 {

	public static void main(String[] args) {
		 String answer = "";
		int age = 999;
		String strage =  Integer.toString(age);
		
		// TODO Auto-generated method stub
		String[] strChange = {"a","b","c","d","e","f","g","h","i","j"};
		System.out.println(strage.charAt(0));
		
		for(int i = 0;i<strage.length();i++) {
			int a = strage.charAt(i)-'0';
			answer += strChange[a];			
		}	
		System.out.println(answer);
	}

}
