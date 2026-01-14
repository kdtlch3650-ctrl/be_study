package be_study.quiz.quiz26;

public class IpadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ipad ipad01 = new Ipad();
		Ipad ipad02 = new Ipad("이정연");
		
		ipad01.showInfo();
		ipad02.showInfo();
		
		ipad01.owner = "유재석";
		ipad01.showInfo();
		ipad01.returnCheck();
	}
}
