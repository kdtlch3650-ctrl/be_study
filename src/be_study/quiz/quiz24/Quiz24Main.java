package be_study.quiz.quiz24;


public class Quiz24Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quiz24 lee = new Quiz24();
		Quiz24 kim = new Quiz24("Kim",170.4);
		
		
		lee.name = "Lee";
		lee.gender = "여성";
		lee.age = 20;
		lee.height = 165.3;
		System.out.println(lee.name);
		System.out.println(lee.gender);
		System.out.println(lee.age);
		System.out.println(lee.height);
		
		System.out.println(kim.name);
		System.out.println(kim.gender);
		System.out.println(kim.age);
		System.out.println(kim.height);
		 
	}

}
