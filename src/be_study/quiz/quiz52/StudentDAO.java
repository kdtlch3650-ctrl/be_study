package be_study.quiz.quiz52;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	public List<StudentDTO> findStudentList() {

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();
		
		List<StudentDTO> studentList = new ArrayList<StudentDTO>();

		// 실행 쿼리 준비
		String sqlQuery = " select studno, name, id, grade, jumin, TO_CHAR(birthday,'YYYY-MM-DD') birthday,tel, height, weight, deptno1, deptno2, profno from student ";

		// 쿼리 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			// 조회 결과가 1개 행만 나오는 상황
			while (rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다.
				// 데이터가 있다

				StudentDTO studentDTO = new StudentDTO();
				
				studentDTO.setStudno(rs.getInt("studno"));
				studentDTO.setName(rs.getString("name"));
				studentDTO.setId(rs.getString("id"));
				studentDTO.setGrade(rs.getInt("grade"));
				studentDTO.setJumin(rs.getString("jumin"));
//				studentDTO.setBirthday(rs.getString("birthday"));
				studentDTO.setBirthday(convertStringToLocalDate(rs.getString("birthday")));
				studentDTO.setTel(rs.getString("tel"));
				studentDTO.setHeight(rs.getInt("height"));
				studentDTO.setWeight(rs.getInt("weight"));
				studentDTO.setDeptno1(rs.getInt("deptno1"));
				studentDTO.setDeptno2(rs.getInt("deptno2"));
				studentDTO.setProfno(rs.getInt("profno"));
				
				studentList.add(studentDTO); // 최종 return 할 dept목록 list에 추가
			}
			// if 가 거짓이면 데이터가 없다...

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return studentList;
	}
	
	public List<StudentDTO> findStudentList(int grade) {

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();
		
		List<StudentDTO> studentList = new ArrayList<StudentDTO>();

		// 실행 쿼리 준비
		String sqlQuery = " select studno, name, id, grade, jumin, TO_CHAR(birthday,'YYYY-MM-DD') birthday,tel, height, weight, deptno1, deptno2, profno from student "
				+ "where grade = ?";

		// 쿼리 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, grade);
			rs = psmt.executeQuery();

			// 조회 결과가 1개 행만 나오는 상황
			while (rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다.
				// 데이터가 있다

				StudentDTO studentDTO = new StudentDTO();
				
				studentDTO.setStudno(rs.getInt("studno"));
				studentDTO.setName(rs.getString("name"));
				studentDTO.setId(rs.getString("id"));
				studentDTO.setGrade(rs.getInt("grade"));
				studentDTO.setJumin(rs.getString("jumin"));
//				studentDTO.setBirthday(rs.getString("birthday"));
				studentDTO.setBirthday(convertStringToLocalDate(rs.getString("birthday")));
				studentDTO.setTel(rs.getString("tel"));
				studentDTO.setHeight(rs.getInt("height"));
				studentDTO.setWeight(rs.getInt("weight"));
				studentDTO.setDeptno1(rs.getInt("deptno1"));
				studentDTO.setDeptno2(rs.getInt("deptno2"));
				studentDTO.setProfno(rs.getInt("profno"));
				
				
				studentList.add(studentDTO); // 최종 return 할 dept목록 list에 추가
			}
			// if 가 거짓이면 데이터가 없다...

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return studentList;
	}
	public static LocalDate convertStringToLocalDate(String str) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate ld = LocalDate.parse(str, dtf);

		return ld;
	}
	
}
