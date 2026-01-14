package be_study.cond;

public class Cond03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dice = 1;

		if (dice == 1) {
			System.out.println("무효과");
		} else if (dice < 6) {
			System.out.printf("체력 %d회복", dice);
		} else {
			System.out.println("무효과");
		}

		switch (dice) {
		case 1: {
			System.out.println("case 1");
			break;
		}
		case 2: {
			System.out.println("case 2");
			break;
		}
		case 3: {
			System.out.println("case 3");
			break;
		}
		default: {
			System.out.println("case none");
		}
		}

		int showTime = 8;

		if (showTime <= 8) {
			System.out.println("청소");
		} else if (showTime <= 9) {
			System.out.println("회의");
		} else if (showTime <= 10) {
			System.out.println("업무");
		} else {
			System.out.println("외근");
		}
//
		switch (showTime) {
		case 8: {
			System.out.println("청소");
		}
		case 9: {
			System.out.println("회의");
		}
		case 10: {
			System.out.println("업무");
		}
		default: {
			System.out.println("외근");
		}
		}
		
//		for (int i = 8;i<=11;i++) {
//			if (i <= 8) {
//				System.out.println("청소");
//			} else if (i <= 9) {
//				System.out.println("회의");
//			} else if (i <= 10) {
//				System.out.println("업무");
//			} else {
//				System.out.println("외근");
//			}
//			
//		}
	}

}
