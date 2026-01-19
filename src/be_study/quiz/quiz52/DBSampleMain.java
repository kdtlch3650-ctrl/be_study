package be_study.quiz.quiz52;

import java.util.List;
import java.util.Scanner;

public class DBSampleMain {

	public static void main(String[] args) {
		// Date 처리
		Scanner sc = new Scanner(System.in);
		System.out.println("학년을 입력해주세요 (1~4) : ");
		int num = sc.nextInt();
		StudentDAO studentDAO = new StudentDAO();
		List<StudentDTO> studentList = studentDAO.findStudentList();

		StudentDAO studentDAO2 = new StudentDAO();
		List<StudentDTO> studentList2 = studentDAO2.findStudentList(num);

		System.out.println(studentList);
		System.out.println(studentList2);

	}

}
