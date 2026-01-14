package be_study.quiz.quiz34;

public class TrashCan {
	int capacity;
	String color;
	int fillLv;
	boolean isOpen;	
	
	void fillPercent() {
		System.out.println("현재 쓰레기양 : "+fillLv+"%");
//		return fillLv;
	}
	
	void fillup(int a) {
		if(isOpen == true) {
			if(fillLv < 100) {
				fillLv+=a;
				System.out.println("쓰레기 버리기 성공");				
			}else {
				System.out.println("쓰레기 버리기 실패 꽉찼어 비워");
			}
		}else {
			System.out.println("뚜껑은 열고 버려라");
		}
	}
	
	void open() {
		isOpen=true;
	}
	void close() {
		isOpen=false;
	}
	
	void clean() {
		fillLv = 0;
	}
	
}
