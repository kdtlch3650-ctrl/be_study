package be_study.quiz.quiz28;

public class JavaCafe {
	public static void main(String[] args) {
		printPay(10.00, 40);
		printPay(10.00, 50);
		printPay(7.50, 38);
		printPay(8.50, 66);
	}

// 시급과 일한 시간을 입력받아, 주급을 출력
	public static void printPay(double basePay, int hours) {
		double pay = 0.0;
		if(hours>40) {
			pay = basePay*40;
			pay += basePay*1.5*(hours-40);
			if(hours>60) {
			System.out.println("일좀그만해라.");
			System.out.println("===============");
			return;
			}
		}else pay = basePay*hours;
		
		if(basePay<8.0) {
			System.out.println("사장아 페이가 짜다.");
			System.out.println("===============");
			return;
		}
		
		
		
//		double pay = basePay*hours;
		/* 해당 메소드를 완성하세요. */
		System.out.printf("$ %.2f\n", pay);
		System.out.println("===============");
	}
}
