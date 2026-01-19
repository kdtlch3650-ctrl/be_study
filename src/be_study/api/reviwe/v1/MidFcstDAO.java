package be_study.api.reviwe.v1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//	7.DB 접근 데이터 처리 담당 DAO 만들기 (DeptDAO등에서 복붙)
//	SQL에서 테이블 만들기
//	String sqlQuery = "IN SERT INTO MID_TA VALUES(?,?,?,?,?,?)";(db 저장용 sql 명령어)
//	8.DBConnectionManager db패키지에서 가져오기(저장용)
public class MidFcstDAO {
	//SQL에 쓸 테이블 예시
//	CREATE TABLE MID_TA
//	(
//	    --no
//	    tm_fc VARCHAR2(16),
//	    reg_id VARCHAR2(8),
//	    ta_min4 NUMBER,
//	    ta_max4 NUMBER,
//	    ta_min5 NUMBER,
//	    ta_max5 NUMBER,
//	    CONSTRAINT MID_TA_PK PRIMARY KEY (tm_fc, reg_id)
//	);
	
	//Insert	
	public int saveMidTa(MidTaDTO midTaDTO) {
		//DB에 저장
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

//		INSERT는 행 갯수 반환이니 int로
		int result = 0;

		// 실행 쿼리 준비
		String sqlQuery = "INSERT INTO MID_TA VALUES(?,?,?,?,?,?)";

		// 쿼리 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);

			// 파라미터 세팅 (쿼리에 있는 ? 위치 채우기)
			// 순서 신경쓰기!!
			psmt.setString(1, midTaDTO.getTmFc());
			psmt.setString(2, midTaDTO.getRegId());
			psmt.setInt(3, midTaDTO.getTaMin4());
			psmt.setInt(4, midTaDTO.getTaMax4());
			psmt.setInt(5, midTaDTO.getTaMin5());
			psmt.setInt(6, midTaDTO.getTaMax5());

			//INSERT는 executeUpdate
			result = psmt.executeUpdate();

			//문제 생기면 떠넘김 기본 오류 표기
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return result;
	}
}
