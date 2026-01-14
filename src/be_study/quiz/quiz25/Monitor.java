package be_study.quiz.quiz25;

public class Monitor {

	int inch;
	String maker;
	String model;
	
	Monitor(int inch,String maker,String model) {
		// TODO Auto-generated constructor stub		
		this.inch = inch;
		this.maker = maker;
		this.model = model;		
	}
	
	void infoPrint() {
		System.out.printf("제조사:%s 모델명:%s 인치:%d인치\n",maker,model,inch);
	}
}
