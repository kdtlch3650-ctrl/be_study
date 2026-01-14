package be_study.quiz.quiz24;

public class Quiz24 {
	String name;
	String gender;
	int age;
	double height;
	double weight;
	String job;
	String bloodType;
	String health;
	boolean isSleeping;
	Quiz24(){
		
	}
	
	Quiz24(String name){
		this.name = name;
		gender = "남성";
		age = 30;
	}
	
	Quiz24(String name,double height){
		this(name);
		this.height = height;
	}
}
