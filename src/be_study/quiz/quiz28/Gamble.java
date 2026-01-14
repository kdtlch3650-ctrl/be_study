package be_study.quiz.quiz28;

public class Gamble {
	public static void main(String[] args) {

		double dollar = dice() + dice() + dice();
		double won = exchange(dollar);
		System.out.printf("획득 금액: $%.2f(%.0f원)", dollar, won);

	}

	public static int dice() {
		int a = (int)(Math.random()*6)+1;
		return a;
	}

	public static double exchange(double dollar) {
		double b = dollar*1082.25108;
		return b;
	}
}