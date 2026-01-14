package be_study.quiz.quiz37.quiz04.quiz03;

class Wizard extends Novice {
	// 필드
	protected int mp;

	// 생성자
	public Wizard(String name, int hp, int mp) {
		super(name, hp);
		this.mp = mp;
	}

	// 에너지볼트
	public void energeVolt() {
		System.out.printf("%s의 에너지볼트!\n", this.name);
	}
}