package be_study.quiz;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 1번

		// 1~24 중 하나의 정수를 입력받습니다. 범위를 넘어선 값을 입력할 수도 있음.
		// 입력받은 숫자를 보고 아래 기준에 맞게 출력하세요.
		// 1) 범위를 벗어나면, "잘못입력했습니다." 라고 출력
		// 2) 시간<=12 오전입니다. 시간>12 오후입니다.
		// 3) 1~6시 이른 오전입니다. 7~12 늦은 오전입니다.
		// 4) 13~18시 이른 오후입니다. 19~24 늦은 오후입니다.

		// 입력에 따른 출력 예시
//		26
//		"잘못입력했습니다."
//
//		5
//		오전입니다.
//		이른 오전입니다.
//
//		9
//		오전입니다.
//		늦은 오전입니다.
//
//		21
//		오후입니다.
//		늦은오후입니다.

		System.out.print("지금 시간은 ? ");
		int time = scanner.nextInt();
		boolean timeOver = false;

		if (time >= 25 || time <= 0) {
			System.out.printf("잘못입력했습니다. %d으로 재시작 됩니다.\n", time % 24);
			int time2 = time % 24;

			if (time == 0) {
				time = 24;
			}
			
			// 25 이상 입력시 재시작
			if (!(time <= 0)) {
				if (time2 <= 12) {
					if (time2 <7) {
						System.out.println("이른 오전입니다.");
					} else{
						System.out.println("늦은 오전입니다.");
					}
				} else if (!(time2 <= 12)) {
					if (time2<19) {
						System.out.println("이른 오후입니다.");
					} else{
						System.out.println("늦은 오후입니다.");
					}
				}
			} else
				System.out.println("음수는 진짜 선넘은거 아니냐?");

		} else {
			if (time <= 12) {
				if (time <7) {
					System.out.println("이른 오전입니다.");
				} else{
					System.out.println("늦은 오전입니다.");
				}
			} else if (!(time <= 12)) {
				if (time < 19) {
					System.out.println("이른 오후입니다.");
				} else{
					System.out.println("늦은 오후입니다.");
				}
			}
			timeOver = false;
		}
		
		if (time>=1 && time<7) {
			System.out.println("이른 오전입니다.");			
		}else if (time>=7 && time<=12) {
			System.out.println("늦은 오전입니다.");			
		}else if (time>=13 && time<=18) {
			System.out.println("이른 오후입니다.");			
		}else if (time>=19 && time<=24) {
			System.out.println("늦은 오후입니다.");			
		}

		// 심화 학습

		String strTime1 = !(time == 24) && time % 24 <= 12 ? "오전" : "오후";
		String strTime2 = !(time % 12 == 0) && time % 12 < 7 ? "이른" : "늦은";
		System.out.printf("%s %s입니다.\n", strTime2, strTime1);

		// 2번 아래 코드를 if문으로 변경

//		int diceNum = 3; // 주사위 수 1~6

		// if문 변환
//		switch(diceNum) {
//		case 1: // diceNum == 1
//		System.out.println("1");
//		break;
//		case 2:
//		System.out.println("2");
//		break;
//		case 3:
//		System.out.println("3");
//		case 4:
//		System.out.println("4");
//		case 5:
//		System.out.println("5");
//		break;
//		default:
//		System.out.println("6");
		// case 6:
//		}

		int diceNum = 3;

		if (diceNum <= 2 || diceNum ==5) {
			System.out.println(diceNum);
		} else if(diceNum == 3){
			System.out.println("3");
			System.out.println("4");
			System.out.println("5");
		}else if(diceNum == 4){
			System.out.println("4");
			System.out.println("5");
		}else
			System.out.println("6");
		
		

		// 3번 아래 코드를 swtich 문으로 변경

//		String localNum = "031";

//		// switch 문으로 변경
//		if ( localNum.equals("031") ){
//		System.out.println("경기도입니다");
//		}
//		if ( localNum.equals("02") ){
//		System.out.println("서울입니다.");
//		}
//		if ( localNum.equals("041") ){
//		System.out.println("충남입니다");
//		}
//		if ( localNum.equals("051") ){
//		System.out.println("부산입니다");
//		}

		String localNum = "031";

		switch (Integer.parseInt(localNum)) {
		case 31:
			System.out.println("경기도입니다");
			break;
		case 2:
			System.out.println("서울입니다");
			break;
		case 41:
			System.out.println("충남입니다");
			break;
		case 51:
			System.out.println("부산입니다");
			break;
		default:
			System.out.println("존재하지 않는 데이터 입니다.");
		}
		
		String localNum2 = "031";

		switch (localNum2) {
		case "031":
			System.out.println("경기도입니다");
			break;
		case "2":
			System.out.println("서울입니다");
			break;
		case "042":
			System.out.println("충남입니다");
			break;
		case "051":
			System.out.println("부산입니다");
			break;
		default:
			System.out.println("존재하지 않는 데이터 입니다.");
		}

		// 4번 아래 코드를 switch 문으로 변경
		// *** switch 문은 범위를 지정할 수 없습니다.
		// 결과 값만 동일하게 나오도록 만들어보세요.
		// 단, 점수는 100점까지로 간주합니다.
		// 점수는 0~100 점 중에 score로 주어진다.

//		if( score >= 90) {
//		System.out.println("학점 A");
//		} else if ( score >= 80) {
//		System.out.println("학점 B");
//		} else if (score >= 70) {
//		System.out.println("학점 C");
//		} else if (score < 70) {
//		System.out.println("학점 F");
//		}
//		}

		System.out.print("학점을 입력하세요.");
		int score = scanner.nextInt();

		switch (score / 10) {
		case 10:
			System.out.println("학점 A 만점");
			break;
		case 9:
			System.out.println("학점 A");
			break;
		case 8:
			System.out.println("학점 B");
			break;
		case 7:
			System.out.println("학점 C");
			break;
		default:
			System.out.println("학점 F");
			break;

		}
	}
}
