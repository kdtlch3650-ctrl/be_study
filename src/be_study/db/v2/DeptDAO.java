package be_study.db.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//DAO (Date Access Object) 데이터 접속 오브젝트
public class DeptDAO {
	// 외부 클래스 Dept를 만들어 deptno 데이터 찾아 테이블 리턴하기
	public static Dept findDeptByDeptno(int deptno) {
		

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null;// sql 실행 후 select 결과를 저장하는 객체
		
		conn = DBConnectionManager.connectDB();

		// 미리 new Dept로 만들면 없는데이터가 아니라 DEFAULT값을 가진 테이블이 생성되어
		// 예기치 않은 오류나 실수를 범할 수 있으므로 확실하게 null로 생성
		Dept dept = null;

		// 실행 쿼리 준비 (불러올 테이블)
		String sqlQuery = " select * from dept where deptno = ? ";
		// 왼쪽 부터 ? 번호를 매김 그후 파라미터 세팅에서
		// 위치 채움 psmt.setInt(1, deptno);

		// 쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery); // 실행 준비 / 데이터

			// 파라미터 세팅 ( 쿼리에 있는 ? 위치 채우기)
			psmt.setInt(1, deptno);

			rs = psmt.executeQuery(); // 쿼리 실행

			if (rs.next()) { // 다음에 읽어올 데이터가 있는가? true : 다음 데이터가 있다.
				// 키로 매개변수를 받아 사용하기에 데이터가 여려개 있을 수 없음
				// while이 아닌 if문으로 있는지만 체크
				dept = new Dept();

				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// DB 연결 종료
		try {
			if (rs != null) {
				rs.close(); // Null인 객체를 대상으로 close() 메소드를 호출하면 -> NullPointException
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dept;
	}

	// 외부 클래스 Dept를 만들어 dname 데이터 찾아 테이블 리턴하기
	public static Dept findDeptByDname(String dname) {
		

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null;// sql 실행 후 select 결과를 저장하는 객체

		// DB 연결
		conn = DBConnectionManager.connectDB();

		Dept dept = null;

		// 실행 쿼리 준비 (불러올 테이블)
		String sqlQuery = " select * from dept where dname = ? ";
		// 왼쪽 부터 ? 번호를 매김 그후 파라미터 세팅에서
		// 위치 채움 psmt.setInt(1, deptno);

		// 쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery); // 실행 준비 / 데이터

			// 파라미터 세팅 ( 쿼리에 있는 ? 위치 채우기)
			psmt.setString(1, dname);

			rs = psmt.executeQuery(); // 쿼리 실행

			if (rs.next()) { // 다음에 읽어올 데이터가 있는가? true : 다음 데이터가 있다.
				// 키로 매개변수를 받아 사용하기에 데이터가 여려개 있을 수 없음
				// while이 아닌 if문으로 있는지만 체크
				dept = new Dept();

				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// DB 연결 종료
		try {
			if (rs != null) {
				rs.close(); // Null인 객체를 대상으로 close() 메소드를 호출하면 -> NullPointException
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dept;
	}

	// 테이블 전체 불러오기!!
	public static List<Dept> findDeptList() {
		
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null;// sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		List<Dept> deptList = null;

		// 실행 쿼리 준비 (불러올 테이블)
		String sqlQuery = " select * from dept ";
		// 왼쪽 부터 ? 번호를 매김 그후 파라미터 세팅에서
		// 위치 채움 psmt.setInt(1, deptno);

		// 쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery); // 실행 준비 / 데이터

			// 파라미터 세팅 ( 쿼리에 있는 ? 위치 채우기)
			// psmt.setString(1, dname);

			rs = psmt.executeQuery(); // 쿼리 실행

			while (rs.next()) { // 다음에 읽어올 데이터가 있는가? true : 다음 데이터가 있다.
				// 데이터가 있다.

				// dept 조회한 '하나'의 행 데이터
				Dept dept = new Dept();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));

				if (deptList == null) {
					deptList = new ArrayList<Dept>();
				}
				deptList.add(dept); // 최종 리턴 할 dept 목록 list에 한 행 추가
			} // 반복
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// DB 연결 종료
		try {
			if (rs != null) {
				rs.close(); // Null인 객체를 대상으로 close() 메소드를 호출하면 -> NullPointException
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return deptList;
	}
}
