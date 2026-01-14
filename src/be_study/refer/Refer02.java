package be_study.refer;

public class Refer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//enum 열거타입
		//선호도 저장
		
		int likePoint = 50;
		String likeLevel = "매우좋음";
		
		String likeLevel2 = "많이좋음";
		
		if (likeLevel2.equals(likeLevel)) {
			System.out.println("아주좋다긍적적이다.");
		}
		
		Likeindex li1 = Likeindex.VERYGOOD;
		Likeindex li2 = Likeindex.VERYBAD;
		
		if(li2 == Likeindex.VERYBAD) {
			System.out.println("매우나쁨이네");
		}else {
			System.out.println("매우나쁨은 아니네");
		}
		
		
	}

}
