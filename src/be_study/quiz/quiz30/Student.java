package be_study.quiz.quiz30;

public class Student {
	private String department;
	private int studentId;
	
	public static void main(String[] args) {
		Student sd1 = new Student();
		sd1.department = "컴퓨터과학과";
		sd1.studentId = 20251118;
		System.out.printf("%s %d입니다.",sd1.department,sd1.studentId);
		
		System.out.println();
		
		sd1.setDepartment("컴퓨터공학과");
		sd1.setStudentId(20201239);
		System.out.printf("%s %d입니다.",sd1.department,sd1.studentId);
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	
}
