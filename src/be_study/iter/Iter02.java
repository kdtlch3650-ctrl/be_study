package be_study.iter;

public class Iter02 {
	public static void main(String[] args) {
		
		int i=1;
//		while(i<6) {
//			
//			System.out.println("짜장");
//			i++;
//		}
//		while(true){
//			
//			i++;
//			if(i==21) break;
//		}
		
		for(i=1;i<=10;i++) {
			if(i== 5) {
				continue;
			}
			System.out.println("i: " + i);
			if(i== 8) {
				break;
			}
		}
	}
}
