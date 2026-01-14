package be_study.quiz;

import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// TODO Auto-generated method stub

//		엘리베이터
//
//		스마트 엘리베이터 시스템을 제작하려고 합니다.
//		해당 시스템이 적용되는 빌딩은 100층 짜리 빌딩이며, 사람들을 원하는 층으로 스마트하게 이동시켜 줍니다.
//		해당 시스템은 사람들을 원하는 층으로 스마트하게 데려다 줍니다.
//		(반복문, 조건문, 배열 최대한 사용하시면 됩니다. )
//
//		- 기본 문제
//		1층에서 사람들이 탑승하며, 각자 내릴 층에 버튼을 누릅니다.
//		(2 ~ 100 이외의 수는 입력이 없을 거라고 가정)
//		엘리베이터는 100층까지 올라가는 와중에 탑승 인원을 모두 내려주고 1층으로 내려오며,
//		엘리베이터의 층수가 변경될 때마다 현재 층수를 출력합니다.
//		참고로, 엘리베이터는 10층에서 5층으로 갔다가 11층으로 가지 않습니다. (오로지 한번에 100층까지 쭉)
//
//		+ 탑승 인원을 입력받습니다.
//		+ 탑승 인원 만큼, 사람들이 내릴 층(2층부터 100층까지)를 각각 입력 받습니다.

		// 엘레베이터

		// 랜덤 탑승인원
		int count = 30;

		// 현재 층수
		int floor = 1;

		// 탑승인원의 입력층수, 몸무게
		int[] buttonFloor = new int[99];
		int[] Humanweight = new int[99];

		// 탑승인원 총 무게
		int HumanweightSum = 0;

		// 입력 받을 제한 (무게,정원,이동수)
		int weightLimit = 200;
		int humanLimit = 16;
		int dDay = 0;

		// 프로그램 중지
		boolean isplay = true;

		System.out.println("정원 제한:");
		humanLimit = sc.nextInt();

		System.out.println("중량 제한:");
		weightLimit = sc.nextInt();

		while (isplay) {

			// 초기화 (총무게,입력층수,무게,층수)
			HumanweightSum = 0;
			buttonFloor = new int[99];
			Humanweight = new int[99];
			floor = 1;

			System.out.printf("현재 정원제한 %d,중량제한 %d 입니다\n", humanLimit, weightLimit, count);

			// 탑승인원 랜덤 설정
			count = (int) (Math.random() * 20) + 1;
			System.out.printf("탑승인원: %d\n", count);

			System.out.println("몇번 내릴래:");
			dDay = sc.nextInt();

//			for(int i=0;i<count;i++) {
//			System.out.printf("몇층가? %d명 입력남았어\n",count-i);
//			buttonFloor[i] = sc.nextInt();			
//			}

			// 탑승인원 초과 시 미리 컷
			if (count > humanLimit) {
				System.out.printf("탑승인원 초과 %d명은 탈 수 없습니다.\n", count - humanLimit);
				count = humanLimit;
			}

			// 탑승자 한명씩 무게, 내릴 층수 설정
			// 탑승자 체크하며 무게설정 후 총량에 더함
			// 총량 체크 총량이 넘으면 반복문 종료 else 탑승자 내릴 층수 랜덤 설정
			for (int i = 0; i < count; i++) {
				Humanweight[i] = (int) (Math.random() * 110) + 40;
				HumanweightSum += Humanweight[i];
				if (HumanweightSum >= weightLimit) {
					System.out.printf("탑승무게 초과 %d명은 탈 수 없습니다.\n", (count - i));
					break;
				} else {
					// 탑승자 내릴 층수 자동 입력
					buttonFloor[i] = (int) (Math.random() * 100) + 2;
				}

			}

			// 2층부터 한층씩 올라가며 체크

			for (int i = 2; i <= 100; i++) {

				// 엘베이동제한 체크 0일시 반복문 종료
				if (dDay == 0) {
					System.out.printf("고장남 ㅎㅎ ㅈㅅ;\n");
					// 전체 반복 제어문
					isplay = false;
					break;
				}

				// 올라가는 층수[i]와 입력된 내릴 층수[j] 비교 그후 이동제한-- 후 반복
				for (int j = 0; j < count; j++) {
					if (i == buttonFloor[j]) {
						System.out.printf("%d층 내림\n", i);
						dDay--;
						break;
					}
				}

			}
			// 전체 반복 제어문 프로그램 종료가 아니면 마무리구문 후 반복문 재시작
			if (isplay == true) {
				System.out.println("100층 도착 내려갑니다.");
				System.out.println("===================");
			}
		}

	}

}
