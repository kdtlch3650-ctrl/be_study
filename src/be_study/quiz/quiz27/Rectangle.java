package be_study.quiz.quiz27;

public class Rectangle {
	int baseLength;
	int height;
	 
	Rectangle(int r,int h){
		baseLength = r;
		height = h;
	}
	
	double getArea(){
		return baseLength*height;
	}
}
