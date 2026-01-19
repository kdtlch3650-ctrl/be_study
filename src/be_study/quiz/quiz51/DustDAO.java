package be_study.quiz.quiz51;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DustDAO {
//	(
//			searchDate VARCHAR2(10)
//			,informCode VARCHAR2(20)
//			,informOverall VARCHAR2(500)
//			,informGrade VARCHAR2(500)
//			,dataTime VARCHAR2(100)
//			,imageUrl3 VARCHAR2(600)	
//		);

	public int saveDust(DustDTO dustDTO) {
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

//		INSERT는 행 갯수 반환이니 int로
		int result = 0;

		// 실행 쿼리 준비
		String sqlQuery = "INSERT INTO Dust_TA VALUES(?,?,?,?,?,?,?)";

		// 쿼리 실행 후 후속 데이터 처리
		try {


			psmt = conn.prepareStatement(sqlQuery);

			// 파라미터 세팅 (쿼리에 있는 ? 위치 채우기)
			// 순서 신경쓰기!!
			for (int i = 0; i < dustDTO.getItems().size(); i++) {
				Item item = dustDTO.getItems().get(i);

				psmt.setString(1, dustDTO.getSearchDate());
				psmt.setString(2, dustDTO.getInformCode());
				psmt.setString(3, item.getInformOverall());
				psmt.setString(4, item.getInformGrade());
				psmt.setString(5, item.getDataTime());
				psmt.setString(6, item.getImageUrl3());
				psmt.setInt(7, i);
				

				result += psmt.executeUpdate();
			}
			// INSERT는 executeUpdate

			// 문제 생기면 떠넘김 기본 오류 표기
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		return result;
	}
}
