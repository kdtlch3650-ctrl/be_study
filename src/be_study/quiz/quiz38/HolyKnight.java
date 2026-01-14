package be_study.quiz.quiz38;

class HolyKnight implements Tanker, Healer{
	private String name;
	private int hp;

	public HolyKnight(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	/* 2. Tanker의 메소드를 오버라이딩하세요. */
	public void increaseHp() {
		System.out.println("전체 체력 +50 증가시킵니다.");
	}
	/* 3. Healer의 메소드를 오버라이딩하세요. */
	public void heal() {
		System.out.println("체력을 +30 회복합니다");
	}
}
