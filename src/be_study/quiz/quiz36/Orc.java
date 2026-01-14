package be_study.quiz.quiz36;

class Orc {
	protected String name;
	protected int hp;

	public Orc(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public String toString() {
//		System.out.printf("Orc { name: %s, hp: %d }\n",name,hp);
		return getClass().getSimpleName()+" { name: "+name+", hp: "+hp+"}";
	}
}
