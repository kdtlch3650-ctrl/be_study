package be_study.db.v3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {

	public int saveProfessor(StudentDTO professorDTO) {
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		List<StudentDTO> professorList = new ArrayList<StudentDTO>();

		// 실행 쿼리 준비
		int result = 0;
		//LocalDateTime버전
		//자바에서 timestamp로 변환해 넣음
//		String sqlQuery = " INSERT INTO professor "
//				+ "VALUES (?,?,?, 'position', 100,?,0,0,NULL,NULL";

		//String 타입
		//String 들어가는 곳에 TO_DATE 넣어 쿼리에서 date 타입 변환 
		String sqlQuery = " INSERT INTO professor "
				+ "VALUES (?,?,?, 'position', 100,TO_DATE(?,'YYYY-MM-DD'),0,0,NULL,NULL)";
		// 쿼리 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, professorDTO.getProfno());
			psmt.setString(2, professorDTO.getName());
			psmt.setString(3, professorDTO.getId());
			
			//LocalDateTime -> timestamp로 바꿔서 저장 (convertLocalDateTimeToTimestamp)
//			ConvertDateUtil.convertLocalDateTimeToTimestamp(professorDTO.getHiredate());
//			psmt.setTimestamp(4, ConvertDateUtil.convertLocalDateTimeToTimestamp(professorDTO.getHiredate()););
			
			//String
			psmt.setString(4, professorDTO.getHiredate());
			result = psmt.executeUpdate();
			
				
				
			
			// if 가 거짓이면 데이터가 없다...

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}
	
	
	public List<StudentDTO> findProfessorList() {

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		List<StudentDTO> professorList = new ArrayList<StudentDTO>();

		// 실행 쿼리 준비
		String sqlQuery = " select profno, name, id, TO_CHAR(HIREDATE, 'YYYY-MM-DD') HIREDATE from professor ";

		// 쿼리 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			// 조회 결과가 1개 행만 나오는 상황
			while (rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다.
				// 데이터가 있다

				StudentDTO professor = new StudentDTO();
				
				professor.setProfno(rs.getInt("profno"));
				professor.setName(rs.getString("name"));
				professor.setId(rs.getString("id"));
				
				//professor.setHiredate(rs.getDate("hiredate"));
				//          LocalDateTime          java.sql.Date     타입다름불가
//				professor.setHiredate(ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("hiredate")));
				professor.setHiredate(rs.getString("hiredate"));
				
				professorList.add(professor); // 최종 return 할 dept목록 list에 추가
			}
			// if 가 거짓이면 데이터가 없다...

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return professorList;
	}
	
}