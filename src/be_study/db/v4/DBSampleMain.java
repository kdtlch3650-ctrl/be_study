package be_study.db.v4;

public class DBSampleMain {

	public static void main(String[] args) {
		
		//student 조회ㅓ
		//department 조회
		
		//BE 데이터 획득
		
		//FE 화면 전달
		
		//1) 각자 조회해서 각각의 객체를 전달
		//조회 pk 값
		int pk =9511; //studno
		
		//student 조회 pk 값 -> studno
		StudentDAO studentDAO = new StudentDAO();
		StudentDTO s1 = studentDAO.findStudentByStudno(pk);
		
		//student 정보 안에 이 학생의 전공정보 deptno1
		//Department 조회 pk 값 -> deptno
		DepartmentDAO departmentDAO = new DepartmentDAO();
		DepartmentDTO d1 = departmentDAO.findDepartmentByDeptno(s1.getDeptno1());
		
		//s1,d1 --> FE, 다른 처리 전달
		
		
		
		//2) join 쿼리로 한번에 커다란 합쳐진 DTO 객체로 전달
		StudentMypageDTO s2 = studentDAO.findStudentMypageInfoByStudno(pk);
		System.out.println(s2);
	}

}
