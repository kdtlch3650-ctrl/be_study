package be_study.quiz.quiz37.quiz04.quiz04;

public class Currency {
	double amount; // 수량(1000)
	String notation; // 표기법(원)
	
	public String toString() {
		return getClass().getSimpleName()+": "+amount+" "+notation;
	}
}
