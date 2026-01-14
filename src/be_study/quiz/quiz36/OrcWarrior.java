package be_study.quiz.quiz36;

class OrcWarrior extends Orc{
	protected int amor;

	public OrcWarrior(String name, int hp, int amor) {
		super(name, hp);
		this.amor = amor;
	}

// 메소드 오버라이딩!
	public String toString() {
//		System.out.printf("OrcWarrior { name: %s, hp: %d, amor: %d }\n",name,hp,amor);
//		return "OrcWarrior { name: "+name+", hp: "+hp+", amor: "+amor+" }\n";
//		return getClass().getSimpleName()+" { name: "+name+", hp: "+hp+", amor: "+amor+" }";
		return String.format(getClass().getSimpleName()+" { name: %s, hp: %d, amor: %d }",name,hp,amor);
	}
}
