package be_study.quiz.quiz35;


public class Delivery {
	// 배달 매칭
//	DeliveryPerson DP;
//	Order od;

	boolean isorder(DeliveryPerson dp) {
		if(dp.isPlay == false) {
			return true;
		}
		return false;
	}
	
	void letgo(DeliveryPerson dp,Order od) {
		System.out.printf("배달매칭완료 출발합니다.\n담당자 : %s, 소속 : %s\n",dp.name,dp.team);
		System.out.printf("배송지 %s 받는사람 %s 전화번호 %d\n",od.ct.address,od.ct.name,od.ct.number);
		System.out.println("피자 정보 :");
		for(Pizza p : od.pz) {
			System.out.println(p.name+p.size);
		}
		
	}

}
