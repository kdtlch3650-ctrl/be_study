package be_study.cls.cls07.pack1;

//import java.util.Scanner;

import be_study.cls.cls07.pack2.Cup; //A항목

public class CupMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cup c1 = new Cup();
		Cup c2 = new Cup();
		be_study.cls.cls07.pack1.Cup c3 = new be_study.cls.cls07.pack1.Cup();
		
		//A 항목으로 되어있으면 Cup이 pack2이 되어버림
		//기본적으로 같은 패키지가 우선 되지만
		//A처럼 지정을 해주면 그쪽으로 인식 c1, c2도 pack2가 됨
		Cup c5 = new Cup();
		be_study.cls.cls07.pack2.Cup c6 = new be_study.cls.cls07.pack2.Cup();
		//클래스 명의 풀네임은 패키지 포함.
		//이 긴걸 생략하기 위해 임포트
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		c5.method();
		c6.method();
		
		
		//pack2의 타입이기 때문에 pack2.type이 퍼플릭이 아니면
		//같은 패키지 안에 속해있지않기 때문에 (default) 사용불가
		c6.type = "플라스틱";
	}

}
