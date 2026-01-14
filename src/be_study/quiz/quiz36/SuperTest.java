package be_study.quiz.quiz36;


public class SuperTest {
public static void main(String[] args) {
/* 1. Orc 객체를 만들고 정보를 출력하시오. */
	Orc orc = new Orc("오크",80);
//	System.out.printf("Orc { name: %s, hp: %d }\n",orc.name,orc.hp);
	System.out.println(orc);
/* 2. OrcWarrior 객체를 만들고 정보를 출력하시오. */
	OrcWarrior orcWr = new OrcWarrior("오크",80,3);
	System.out.println(orcWr);
//	System.out.printf("%s { name: %s, hp: %d, amor: %d }\n",orcWr.getClass().getSimpleName(),orcWr.name,orcWr.hp,orcWr.amor);
}
}