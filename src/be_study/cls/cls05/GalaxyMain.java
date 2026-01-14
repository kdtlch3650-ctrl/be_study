package be_study.cls.cls05;

public class GalaxyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("정적:" + Galaxy.madeBy);
		Galaxy.showMadeBy();
		//객체 생성 전에도 존재
		
		
		Galaxy g1 =new Galaxy();
		g1.owner = "엄마";
		g1.model="갤럭시10";
		System.out.println(g1.madeBy);
		g1.showInfo();
		g1.showMadeBy();
		
		//노란줄인 이유 경고
		//스태틱인데 왜 객체타입으로 쓰냐
		
		Galaxy g2 =new Galaxy();
		g2.owner = "아빠";
		g2.model="갤럭시24";
		System.out.println(g2.madeBy);
		g2.showInfo();
		g2.showMadeBy();
		
		Galaxy.showMadeBy();
		
//		static String madeBy = "삼성";
		//객체 생성을 안해도 이미존자
		//클래서 공통으로 사용하는!(각자 객체들에서 접그
		
		
		
	}

}
