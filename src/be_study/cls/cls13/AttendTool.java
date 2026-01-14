package be_study.cls.cls13;

public class AttendTool {
	//출근 체크하는 기기
	boolean isPowerOn;
//	String organization; //어떤 회사/조직을 위한 도구냐
	String org;
	
	//출근체크
	//체크결과 리턴 -> 처리 성공/실패 boolean
	
	//결과 리턴 int값 -> 출근성공:1 실패:2 퇴근성공:3 조퇴성공:4 지각인식:5
	
	public boolean checkAttend(Card card) {
//		card.owner 소유주 -> 로직 성공실패
		
		//처리성공
		return true;
		//실패
//		return false;
	}
	
	public int checkAttend2(Card card) {
//		card.owner 소유주 -> 로직 성공실패
		
		//처리성공
		return 1;
		//실패
//		return 2;
		//...
	}
	
	public boolean checkAttend(Card card, Student student) {
	
		if(student.name == card.owner) {
			return true;
		}
		
		return false;
	}
	
	public void powerOn() {
		this.isPowerOn = true;
		
	}
	
}
