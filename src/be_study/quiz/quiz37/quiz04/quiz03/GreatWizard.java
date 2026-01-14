package be_study.quiz.quiz37.quiz04.quiz03;

class GreatWizard extends Wizard {
	/* 1. 보호막 속성을 필드에 추가하시오. */
	int shield;
	/* 2. 생성자를 완성하시오. */
	public GreatWizard(String name, int hp, int mp, int shield) {
		super(name, hp, mp);
		this.shield = shield;
	}

	/* 3. toString() 메소드를 오버라이딩 하시오. */
	public String toString() {
		return String.format("[대마법사] %s(HP: %d,MP: %d, SHIELD: %d)", this.name, this.hp,this.mp,this.shield);
	}
	/* 4. 에너지볼트 마법을 오버라이딩 하시오. */
	public void energeVolt() {
		System.out.printf("%s의 에너지볼트! (대마법사 버프로 데미지 +30 추가)\n", this.name);
	}
}
