package be_study.exp;

import java.util.ArrayList;
import java.util.List;

public class Exp03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SampleEx s = new SampleEx();
		
		try {
		s.addItem1("하나");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("addItem1을 호출한 main의 하나 예외처리");
		}
		
		try {
			s.addItem2("둘");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("addItem2를 호출한 main에서 둘 예외처리");
			//SampleEx 내부 addOtem2에서 예외처리 하기에
			//s.addItem2("둘")에서 문제가 생긴걸 인지하지 못함
			//그러므로 외부 catch는 실행 되지않음 
		}
		
		//s.addItem3("셋"); 호출 될 곳에서 예외처리를 넘겼으니 여기서 예외처리를 반드시 해두거나
		//더 상위로 쓰로울 하거나 해야하는데 main이니 불가
		try {
			s.addItem3("셋");
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
		try {
			s.addItem4("넷");
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("addItem4를 호출한 main에서 넷 예외처리");
		}
		
		try {
			s.addItem5("다섯");
		} catch (Exception e) {
			System.out.println("addItem5를 호출한 main에서 다섯 예외처리");
		}
		try {
			s.addItem6("여섯");
		} catch (Exception e) {
			System.out.println("addItem6를 호출한 main에서 여섯 예외처리");
		}
		
		int result = s.addItem7("일곱");
		if(result == 1) {
			//정상처리
		} else {
			//예외 상황 처리
		}
		
		try {
			s.addItem8("여덟");
		} catch (InvalidParameterValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ListFullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			s.addItem8("여덟");
		} catch (Exception e) { //Exception이 Inval,ListFull의 상위 클래스이기에 가능
			e.printStackTrace();
		}
	}

}

/******************************************************/

class SampleEx{
	
	List<String> list;
	void addItem1(String s) {
		list.add(s);
	}
	void addItem2(String s) {
		try {
			list.add(s);
		}catch (Exception e) {
			System.out.println("SampleEx 내부 addItem2에서 예외처리");
			// TODO: handle exception
		}
	}
	void addItem3(String s) throws Exception { //예외 생길시 Exception로 throws(떠넘김)
		list.add(s);
	}
	
	void addItem4(String s) throws NullPointerException { 
		list.add(s);
	}
	
	void addItem5(String s) throws Exception{ //쓰로우 경고로 인해 외부에서 예외처리를 하긴했지만
		//내부에서 예외처리를 해버렸기 때문에 외부에서 예외 상황인거 인지X
		try {
			list.add(s);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("SampleEx 내부 addItem5에서 예외처리");
		}
	}
	//throw로 예외상황 반환 (호출한 곳에 예외 보고)
							//throws : 이 메소드에서 이 예외가 발생 할 수 있음 주의
	void addItem6(String s) throws Exception{ 
		try {
			list.add(s);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("SampleEx 내부 addItem6에서 예외처리");
			throw e;//실제 예외를 던진다(발생시킨다/전달한다)
			//throw 가 없으면 정상처리 되어 예외처리가 끝나지만
			//throw 가 예외 상황을 다시 반환
		}
	}
	
	//리턴 값으로 예외 상황 값 정해두고 반환 (호출한 곳에 예외 보고)
	int addItem7(String s) {
		try {
			list.add(s);
		}catch (Exception e) {
			// TODO: handle exception
			return -1; // -1 예외상황 
		}
		return 1; //정상이면 1리턴
	}
	
	void addItem8(String s) throws InvalidParameterValueException, ListFullException{
		if(s == null) {
			throw new InvalidParameterValueException();
		}
		
		try {
			list.add(s);
		}catch (Exception e) {
			// TODO: handle exception
			//우리가 저장하는 최대길이
			//현재 리스트 길이
			throw new ListFullException();
		}
	}
	
	void addItem9(String s){ 
		try {
			list.add(s);
		}catch (Exception e) {
			if(list == null) {
				list =new ArrayList<String>();
				list.add(s);
			}
		}
	}
}


/******************************************************/
//Custom Exception

//예외클래스 추가 (직접만듬)
class ListFullException extends Exception {}

class InvalidParameterValueException extends Exception{}




