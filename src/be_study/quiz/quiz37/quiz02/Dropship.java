package be_study.quiz.quiz37.quiz02;

class Dropship extends Unit { // 수송선
	int x, y; // 현재 위치

	void move(int x, int y) {
		System.out.println("날아서 이동한다.");
	} // 지정된 위치로 이동

//	void stop() {
//		System.out.println("제자리에 부유한다.");
//	} // 현재 위치에 정지

	void load() {
		/* . */ } // 선택된 대상을 태운다

	void unload() {
		/* . */ } // 선택된 대상을 내린다
}
