package be_study.quiz.quiz25;

public class MonitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monitor monitor01 = new Monitor(65, "삼성", "더프레임");
		Monitor monitor02 = new Monitor(80, "LG", "올레드");
		
		monitor01.infoPrint();
		monitor02.infoPrint();
	}

}
