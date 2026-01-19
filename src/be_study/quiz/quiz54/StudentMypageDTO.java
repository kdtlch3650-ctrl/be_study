package be_study.quiz.quiz54;


public class StudentMypageDTO {

	//Student
	int studno;
	String name;
	int total;
	String grade;
	
	public int getStudno() {
		return studno;
	}
	public void setStudno(int studno) {
		this.studno = studno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "StudentMypageDTO [studno=" + studno + ", name=" + name + ", total=" + total + ", grade=" + grade + "]";
	}
	



}
