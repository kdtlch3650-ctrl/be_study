package be_study.cls.cls03;

public class Calc {
	// 메소드 계산기 Calculator

	double resultDouble = 0;
	int resultInt = 0;
	
	double calculator(String str,int a,int b) {
		
		switch (str) {
		case "+": {
			resultDouble = a+b;
			break;
		}case "-": {
			resultDouble = a-b;
			break;
		}case "*": {
			resultDouble = a*b;
			break;
		}case "/": {
			resultDouble = (b==0) ? resultDouble = 0 :(double)a/b;
			break;
		}case "%": {
			resultDouble = a%b;
			break;
		}
	}

		System.out.println(resultDouble);
		return resultDouble;
	}
	
	int sum(int a, int b) {
		resultInt = a+b;
		System.out.println(resultInt);
		return resultInt;
	}
	
	int difference(int a, int b) {
		resultInt = a-b;
		System.out.println(resultInt);
		return resultInt;
	}
	int product(int a, int b) {
		resultInt = a*b;
		System.out.println(resultInt);
		return resultInt;
	}
	
	double divide(int a, int b) {
		double result = (b==0) ? result = 0.0 :(double)a/b;
		System.out.println(result);
		return result;
	}
	int remainder(int a, int b) {
		resultInt = a%b;
		System.out.println(resultInt);
		return resultInt;
	}
	

	// 계산기 전원
	void powerOn() {
		System.out.println("power On");
		//보이드에서 사용시 메소드를 종료하겠다는뜻
		return;
	}

	// 소유자 이름 등록
	void setOwner(String name) {
		System.out.printf("%s님의 계산기로 등록되었습니다.\n", name);
	}
	
	int checkBattery() {
		return 80;
	}
	
	String madeByInfo() {
		return "카시오";
	}
}
