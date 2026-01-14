package be_study.quiz.quiz35;

import java.util.ArrayList;



public class Order {
//	ArrayList<Pizza> pz = new ArrayList<Pizza>();
	
	//여러개의 피자를 받음
	ArrayList<Pizza> pz = new ArrayList<Pizza>();
	//주문 받을 때 마다 주문번호 증가
	static int orderNum;
	//주문마다 고객정보확인을 위해서
	Customer ct;
	
	
	
	
	void orderadd(Pizza pz){
//		if(this.pz==null) {
//			this.pz = new ArrayList<Pizza>();
//			}
		this.pz.add(pz);
		System.out.printf("피자 오더 추가됨 %s,%s사이즈\n",pz.name,pz.size);
	}
	
	void ctadd(Customer ct) {
		this.ct = ct;
	}
	
	void order() {
		orderNum++;
		System.out.println("주문 완료 배달원 매칭");
	}
	
	
}
