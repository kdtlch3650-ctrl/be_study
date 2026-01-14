package be_study.cls.cls01;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		n = 10;

		//인스턴트 객체 생성1
		Student sd1 = null;
		sd1 = new Student();
		
		//인스턴트 객체 생성2
		Student sd2 = new Student();
		
		sd1.name = "이하나";
		sd2.name = "김둘";
		
		System.out.println(sd1.name);
		System.out.println(sd2.name);
		
		sd1.grade = 3;
		sd2.grade = 5;
		
		System.out.println(sd1.grade);
		System.out.println(sd2.grade);
		
		System.out.printf("%s는 %d학년\n",sd1.name,sd1.grade);
		System.out.printf("%s는 %d학년\n",sd2.name,sd2.grade);
		
		System.out.println(sd1.phone);
		System.out.println(sd1.studentNumber);
		
		String name = "afooewfoaKSD";//가능 클래스.name 이랑 완전 별개
		
		
		
	}

}
