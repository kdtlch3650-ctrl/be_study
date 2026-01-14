package be_study.cls.cls07.pack1;


public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point();

//		int math;
		p1.math = 90; // 디폴트는 같은 패키지 사용 가능
//		public int eng;
		p1.eng = 60; // 퍼블릭은 다른 패키지도 사용가능
//		private int lang;
//		p1.lang = 75; //프라이빗은 혼자 사용

//		void metsod1()
		p1.metsod1(); // 디폴트는 같은 패키지 사용 가능
//		public void metsod2()
		p1.metsod2(); // 퍼블릭은 다른 패키지도 사용가능
//		private void metsod3()
//		p1.metsod3(); //프라이빗은 혼자 사용

		Point p2 = new Point();
		Point p3 = new Point(100, 80, 70);

		p2.math = 100; // 변수에 직접 접근해서 사용
		
		p2.setMath(100); // 세터 메소드 사용 저장
		
//		p2.lang = 100; //private이라서 접근불가
		p2.setLang(50); //직접접근이 아니라서 가능

		//setter
		p2.eng = -60; // 정상범위 0~100을 벗어남 하지만 못막음
		System.out.println(p2.eng);
		p2.setEng(-60); //정상범위를 넘어갔지만 Point 클래스 setEng에서 넘어간 범위는 예외처리 0점
		System.out.println(p2.eng);
		
		
		//getter
//		System.out.println(p2.lang); //당연히 같은 이유로 프라이빗이라 못가져옴
		System.out.println(p2.getLang());//셋터와 같은 방식으로
		
	}

}
