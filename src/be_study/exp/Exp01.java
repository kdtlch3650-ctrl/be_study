package be_study.exp;

import java.util.Scanner;

public class Exp01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//예외처리
		TempCls tc = null;
		
		if(tc != null) {
			tc.t = 10;
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 입력하세요~");
		
		//System.out.println(input); //글자 입력시 InputMismatchException
		
//		try { //예외 방생할 수 있는 코드 작성 영역
//			int input = scanner.nextInt(); //여기서 문제 생기면 밑줄 실행안하고 바로 catch로 감
//			System.out.println(input);
//		}catch (Exception e) { // 예외 발생시 실행될 코드 영역
//			System.out.println("숫자로만 입력해주세요~");
//		}
		
		String s = scanner.nextLine();
		try {
			int n = Integer.parseInt(s);			
		}catch(Exception e) {
			System.out.println("숫자로만 입력하셈");
		}
		
		
		int n = 0;
		try {//int n을 미리 정의 하지않으면 지역변수이므로 외부 사용불가
			System.out.println("parseInt 실행 전");
			n = Integer.parseInt(s); //여기서 s가 숫자가 아니면 catch로 이동하므로 아랫줄 실
			System.out.println("parseInt 실행 후");
		}catch (Exception e){
			System.out.println(e.getMessage()); 
			e.printStackTrace(); //에러 메세지 출력
		} finally {
			System.out.println("여기는 finally 마지막에 꼭 실행");
		}
		
		try {
			Class.forName("java.lang.String222");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}

class TempCls{
	int t;
}