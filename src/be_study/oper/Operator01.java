package be_study.oper;

public class Operator01 {
	public static void main(String[] args) {
			
		System.out.println(1+1);
		
		System.out.println(10 - 5);	
		System.out.println(5*9);
		
		System.out.println(30/7);
		
		System.out.println((double)30/7);
		
		System.out.println(30/7.0);
		
		System.out.println(9%5);
		
		System.out.println(28%9);
		
		System.out.println("=================================================");

		//증감 ++ --
		//++변수 증가먼저
		//변서++ 증가 나중에
		
//		int x=10;
//		System.out.println(x);
//								//x = 10
//		System.out.println(++x);
//		System.out.println(x);
//								//x = 11
//
//		System.out.println(1+x);
//		System.out.println(x);
//								//x = 11
//		
//		System.out.println(x++);			//증감 연산자가 계산되지않고 값이 나옴
//		System.out.println(x);
		
		int q = 1;
		int w = 3;
		int e = 10 + ++q;
		int r = 3 + w --;
		
		System.out.printf("%d %d %d %d\n",q ,w, e ,r);
		
		boolean isHungry = true;
		System.out.println(isHungry);
		System.out.println(!isHungry);
		System.out.println(isHungry); 
		
		isHungry = false;
		isHungry = !isHungry;
		
		//비교 연산자
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		// AND && OR ||
		
		
		//삼항 연산자 (조건)
		int point = 300;
		
		//200점 까지 사운품
		//200점 넘으면 커피
		//조건식 ? 참 : 거짓;
		
		String eventItem = point > 200 ? "coffee" : "water" ;
		System.out.println(eventItem);
		
		//예외처리
		int num = -10;
		System.out.println(num==0?"0":num<0?"음수":"양수");
		System.out.println(num!=0?num<0?"음수":"양수":"0");
		
		System.out.println(num >0? "양수" : num<0?"음수":"0");
		System.out.println(num>= 0 ?  num==0?"0":"양수" : "음수");
		
	}
}
