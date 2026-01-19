package be_study.quiz.quiz51_r;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MinuDustWeekDAO {

	public int saveMinuDustWeekDAO(MinuDustWeekDTO minuDustWeekDTO) {
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

//		INSERT는 행 갯수 반환이니 int로
		int result = 0;

		// 실행 쿼리 준비
		String sqlQuery = "INSERT INTO MINU_DUST_WEEK VALUES( SEQ_MINU_DUST_WEEK_PK.nextval,?,?,?,?,?)";

		// 쿼리 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);

			// 파라미터 세팅 (쿼리에 있는 ? 위치 채우기)
			// 순서 신경쓰기!!

			psmt.setString(1, minuDustWeekDTO.getPresnatnDt());
			psmt.setString(2, minuDustWeekDTO.getFrcstOneCn());
			psmt.setString(3, minuDustWeekDTO.getFrcstOneDt());
			psmt.setString(4, minuDustWeekDTO.getFrcstTwoCn());
			psmt.setString(5, minuDustWeekDTO.getFrcstTwoDt());

			result = psmt.executeUpdate();

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
