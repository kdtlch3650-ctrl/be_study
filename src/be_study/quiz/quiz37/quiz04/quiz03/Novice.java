package be_study.quiz.quiz37.quiz04.quiz03;

class Novice {
	// 필드
	protected String name;
	protected int hp;

	// 생성자
	public Novice(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	// toString
	public String toString() {
		return String.format("[Novice] %s(HP: %d)", this.name, this.hp);
	}
}
