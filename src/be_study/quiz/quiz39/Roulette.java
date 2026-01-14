package be_study.quiz.quiz39;

import java.util.Scanner;

public class Roulette {
	int totalPoint;
	int success;
	int failure;
	int retryLimit;

	public Roulette() {
		this.totalPoint = 0;
		this.success = 0;
		this.failure = 0;
		this.retryLimit = 0;
	}

	void play() {
		int count = 1;
		if (retryLimit == 0) {
			System.out.println("충전 횟수가 없습니다.");
			return;
		} else {
			while (retryLimit > 0) {
				int num = (int) (Math.random() * 6) + 1;
				if (num < 5) {
					success++;
					totalPoint++;
					System.out.printf("%d번째 룰렛 결과\n성공\n",count);
				} else {
					failure++;
					totalPoint--;
					System.out.printf("%d번째 룰렛 결과\n실패\n",count);
				}				
				count++;
				retryLimit--;
			}
			System.out.println("================================");
			System.out.printf("룰렛 결과\n성공 : %d 실패 : %d\n총합 포인트 : %d\n", success, failure,totalPoint);
		}
		
	}
	
	

	public int charge() {
		Scanner sc = new Scanner(System.in);
		if(retryLimit != 0) {
			System.out.println("충전 횟수가 있어 추가 충전이 불가능 합니다.");
			return 0;
		}
		int total = 0;
		System.out.println("=================================");
		System.out.println("충전금액을 입력해주세요.(천원 단위) : ");
		int charge = sc.nextInt();
		total += (charge/1000)*1000;
		setRetryLimit(charge);
		System.out.println(retryLimit+"회 충전되었습니다.");
		System.out.println("=================================");
		
		return total;
	}
	
	public void setRetryLimit(int retryLimit) {
		this.retryLimit = (retryLimit/1000)*2;
	}
}
