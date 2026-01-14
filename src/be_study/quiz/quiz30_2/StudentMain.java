package be_study.quiz.quiz30_2;

public class StudentMain {

	public static void main(String[] args) {
		Student sd1 = new Student();
		sd1.setDepartment("컴퓨터과학과");
		sd1.setStudentId(20251118);
		System.out.printf("%s %d입니다.",sd1.getDepartment(),sd1.getStudentId());
		
		System.out.println();
		
		sd1.setDepartment("컴퓨터공학과");
		sd1.setStudentId(20201239);
		System.out.printf("%s %d입니다.",sd1.getDepartment(),sd1.getStudentId());
	}

}
