package be_study.db.v3;

import java.util.List;

public class DBSampleMain {

	public static void main(String[] args) {
		// Date 처리
		
		ProfessorDAO professorDAO = new ProfessorDAO();
		List<ProfessorDTO> professorList = professorDAO.findProfessorList();
		
		for(ProfessorDTO p : professorList) {
//			System.out.println(p.toString());
//			String hiredate =ConvertDateUtil.convertLocalDateTimeToString(p.getHiredate())
			System.out.println(p.getHiredate());
		}
		
		ProfessorDTO pro = new ProfessorDTO();
		
		pro.setProfno(9991);
		pro.setName("name");
		pro.setId("id");
		pro.setHiredate("2026-01-13");
		
		int result = professorDAO.saveProfessor(pro);
		if(result > 0)
			System.out.println("저장 성공~!");
		
		
	}

}
