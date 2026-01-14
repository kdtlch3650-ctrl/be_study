package be_study.quiz.quiz27;

public class MonitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monitor m1 = new Monitor("삼성", 27, 150000);
		m1.color = "검은색";

		Monitor m2 = new Monitor("LG", 32, 330000);
		
		
		m1.set(1080, 780);
		m2.set(4096, 2048,"흰색");
		
		m1.info();
		m2.info();
		
		int increase = 70000;
		System.out.printf("가격 인상 %d \n 총 가격 %d\n",increase,m2.priceIncrease(increase));
		System.out.println("==========================================");
		
		m1.info();
		m2.info();
		
				
	}

}
