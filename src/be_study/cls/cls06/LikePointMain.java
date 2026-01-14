package be_study.cls.cls06;

public class LikePointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		System.out.println(n);

		n = 20;
		System.out.println(n);

		//값 변경이 불가능한 상태가 됨
		final int i = 30;
		System.out.println(i);
//		i = 300; 바꿀수 없음
//		System.out.println(i);
		LikePoint lp1 = new LikePoint(); //파이날 단점 : 객체 생성필요
		System.out.println(lp1.veryGood);//장점 : 수정 불가.
		
		//스태틱 변수이므로 LikePint(클래스명)을 붙임
		System.out.println(LikePoint.veryBad);//장점 : 개체 생성 없이 바로 사용가능
		LikePoint.veryBad = 0; //단점 : 값 수정이 됨
		System.out.println(LikePoint.veryBad);
		
		System.out.println("============================");
		System.out.println(LikePoint.VERY_GOOD);
		System.out.println(LikePoint.GOOD);
		System.out.println(LikePoint.NORMAL);
		System.out.println(LikePoint.BAD);
		System.out.println(LikePoint.VERY_BAD);
	}

}
