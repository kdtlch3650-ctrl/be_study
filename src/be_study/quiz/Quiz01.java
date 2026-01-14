package be_study.quiz;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//오늘이 몇월 몇일인지 저장한 변수가 필요한 상태이다.
		//1. 월에 해당하는 값을 저장할 month 라는 이름의 정수형 int 변수 선언하세요.
		
		int month;

		//2. 일자에 해당하는 값을 저장할 day 라는 이름의 정수형 int 변수를 선언함과 동시에 1로 초기화 하세요.
		
		int day = 1;

		//3. 위 1번 2번에서 만든 월과 일을 저장하기위해 만든 변수에 오늘 날짜에 맞게 해당하는 값을 저장하고,
		// 아래와 같이 결과가 나타나도록 출력하세요. (띄어쓰기까지 포함하여 동일하게 출력)
//		오늘은 8월 29일 입니다.
		
		month= 10;
		day =  30;
		
		System.out.println("오늘은 "+month+"월 "+day+"일 입니다.");

		//4. 이름을 저장할 변수를 선언하고 본인의 이름을 저장한 후에 출력하시오. (변수명을 의미있게)
		
		String myName;
		
		myName = "이찬희";
		
		System.out.println(myName);

		//5. 전화번호를 저장할 변수를 선언과 동시에 값을 초기화 하여 저장하고,
		// 아래와 같이 결과가 나타나도록 출력하세요. (각자 입력하여 저장한 번호)
//		전화번호는 OOO-OOOO-OOO 입니다.
		
		String number = "010-1243-1352";
		System.out.println("전화번호는 "+number+" 입니다.");


		//6. 다음중 변수명으로 사용할 수 있는 것은?
//		사용할 수 없는 경우 : 잘못된 사유를 옆에 함께 작성
//		사용할 수 있으나 잘못된 부분이 있으면 해당 사유를 함께 작성
//		a. $ystem              
//		b. channel#112              #을 쓸 수 없음
//		c. 7eleven					첫자에 숫자가 올 수 없음
//		d. newmember				문제는 없으나 newMember(관례)
//		e. $MAX_NUM					
//		f. hello@com				@를 쓸 수 없음
//		g. int						int 타입을 변수명으로 명명할 수 없음 (예약어)
			
		
//
//		//7. 다음중 변수 초기화가 잘못 된 것은?
//		a. int b = 255;
//		b. String s = "T";
//		c. char answer = 'no';				
//		d. char flag = 'F';
		
//		c
//
//		//8. 다음 정수형 타입들 중에서 자바가 정수형 값을 만났을때 가장 기본적(대표적)으로 인식하는 변수 타입은?
//		a. char
//		b. int
//		c. short
//		d. long
		
//		b
	}

}
