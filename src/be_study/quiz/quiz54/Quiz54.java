package be_study.quiz.quiz54;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Quiz54 {
	public static void main(String[] args) {
		
		List<StudentMypageDTO> s1 = findStudentMypageInfoByStudno(101,102);
		System.out.println(s1);
	}
	public static List<StudentMypageDTO> findStudentMypageInfoByStudno(int studno,int studno2) {

		// DB연결 및 사용시 필요한 객체
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		conn = DBConnectionManager.connectDB();
		// 쿼리 준비
		// String query = "select * from student ";
		String query = "select *\r\n"
				+ "from student sd, hakjum h, score sc\r\n"
				+ "where sd.studno = sc.studno\r\n"
				+ "and sc.total Between h.min_point and h.max_point\r\n"
				+ "and deptno1 in(?,?)";

		List<StudentMypageDTO> studentList = new ArrayList<StudentMypageDTO>();

		try {
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체

			psmt.setInt(1, studno);
			psmt.setInt(2, studno2);
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
				
				// 해당 행에 컬럼 단위로 데이터 접근
				StudentMypageDTO s = new StudentMypageDTO();

				s.setStudno(rs.getInt("studno"));
				s.setName(rs.getString("name"));
				s.setTotal(rs.getInt("total"));
				s.setGrade(rs.getString("grade"));
				
				studentList.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DBConnectionManager.disconnectDB(conn, psmt, rs);

		return studentList;
	}
}
