package be_study.quiz.quiz27;

public class Triangle {
	
	int baseLength;
	int height;
	 
//	Triangle(int r,int h){
//		baseLength = r;
//		height = h;
//	}
	
	void setSize(int r,int h){
		baseLength = r;
		height = h;
	}
	
	double getArea(){
		return baseLength*height/2.0;
	}
}
