package be_study.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import be_study.quiz.quiz51_r.DBConnectionManager;

public class VilageDAO {
	public int saveVilageDAO(VilageDTO vilageDTO) {

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

//		INSERT는 행 갯수 반환이니 int로
		int result = 0;

		// 실행 쿼리 준비
		String sqlQuery = "INSERT INTO Vilage_TABLE VALUES( Vilage_TABLE_PK.nextval,?,?,?,?,?)";

		// 쿼리 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);

			// 파라미터 세팅 (쿼리에 있는 ? 위치 채우기)
			// 순서 신경쓰기!!
			for (int i = 0; i < vilageDTO.getItems().size(); i++) {
				Item item = vilageDTO.getItems().get(i);

				psmt.setString(1, vilageDTO.getBase_date());
				psmt.setString(2, item.getFcstDate());
				psmt.setString(3, item.getFcstTime());
				psmt.setInt(4, item.getNx());
				psmt.setInt(5, item.getNy());

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
