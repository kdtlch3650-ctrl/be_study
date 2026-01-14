package be_study.cond;

public class Cond04 {
	public static void main(String[] args) {

		int goBedTime = 20;
		int sleepTime = 10;

		if (goBedTime <= 21) {
			if (sleepTime > 8) {
				System.out.println("일찍 많이 잠");
			} else {
				System.out.println("일찍 적게 잠");
			}
		} else {
			if (sleepTime > 8) {
				System.out.println("늦게 많이 잠");
			} else {
				System.out.println("늦게 적게 잠");
			}
		}

		if (goBedTime <= 21 && sleepTime > 8) {
			System.out.println("일찍 많이");
		} else if (goBedTime <= 21 && sleepTime <= 8) {
			System.out.println("일찍 적게");
		} else if (goBedTime > 21 && sleepTime > 8) {
			System.out.println("늦게 많이");
		} else if (goBedTime > 21 && sleepTime <= 8) {
			System.out.println("늦게 적게");
		}

		if (goBedTime <= 21 && sleepTime > 8) {
			System.out.println("일찍 많이");
		} else if (goBedTime <= 21 && !(sleepTime > 8)) {
			System.out.println("일찍 적게");
		} else if (!(goBedTime <= 21) && sleepTime > 8) {
			System.out.println("늦게 많이");
		}else {
			System.out.println("늦게 적게");
		}
	}
}
