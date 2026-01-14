package be_study.quiz.quiz37.quiz04.quiz01;

public class ObjectGrouping {
	public static void main(String[] args) {
// 다양한 객체 생성
		Bird bird = new Bird();
		Helicopter copter = new Helicopter();
		Rocket rocket = new Rocket();

// 인터페이스 타입으로 그룹화
		Flyable[] flyableThings = { bird, copter, rocket };

// 모든 날것들을 날림
		for (int i = 0; i < flyableThings.length; i++) {
			Flyable temp = flyableThings[i];
			temp.fly();
		}
	}
}