package be_study.db.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBSampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		findproduct();
//		selectDept();
//		selectDeptWhere();
//		findDeptByDeptnoPrint(20);
//		findDeptByDeptnoPrint(40);
//		findDeptByDeptnoPrint(10);

		Professor d1 = findDeptByDeptno(20);
		System.out.println(d1.toString());

		// 없는 데이터 찾기
		Professor d2 = findDeptByDeptno(70);
		if (d2 != null)
			System.out.println(d2.toString());

		Professor d3 = findDeptByDname("SALES");
		System.out.println(d3.toString());

		Professor d4 = findDeptByDname("DEEPSLEEP");
		if (d4 == null) {
			System.out.println("해당 부서명 데이터 없음");
		} else {
			System.out.println(d4.toString());
		}
		
		List<Professor> deptList = findDeptList();
		if(deptList == null) {
			System.out.println("데이터 없어");
		} else {
			for(Professor d : deptList) { //향상된 for문 deptList에서 하나씩 뽑아서 d에다 저장
				System.out.println(d.toString());
			}
		}
		
		List<Professor> deptList2 = findDeptList2();
//		if(deptList2.size() == 0) { //초기화 O 추가된 데이터가 X 비었다
//		}
		if( deptList2 != null && deptList2.size() > 0) {
			//조회된 데이터가 있는 경우 처리할 코드
			for(Professor d : deptList2) { 
				System.out.println(d.toString());
			}
		}
	}

	public static void findproduct() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null;// sql 실행 후 select 결과를 저장하는 객체

		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 실행 쿼리 준비
		String sqlQuery = " select * from product ";

		// 쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery); // 실행 준비 / 데이터
			rs = psmt.executeQuery(); // 쿼리 실행

			while (rs.next()) { // 다음에 읽어올 데이터가 있는가? true : 다음 데이터가 있다.
				System.out.print(rs.getInt("p_code") + " ");
				System.out.print(rs.getString("p_name") + " ");
				System.out.println(rs.getInt("p_price"));
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
	}

	// readDept findDept findDeptList
	public static void selectDept() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null;// sql 실행 후 select 결과를 저장하는 객체

		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 실행 쿼리 준비 (불러올 테이블)
		String sqlQuery = " select * from dept ";

		// 쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery); // 실행 준비 / 데이터
			rs = psmt.executeQuery(); // 쿼리 실행

			while (rs.next()) { // 다음에 읽어올 데이터가 있는가? true : 다음 데이터가 있다.
//				System.out.print(rs.getInt(1) + " ");
//				System.out.print(rs.getString(2) + " ");
//				System.out.println(rs.getString(3));
				// 순서로도 불러올 수 있으나 DB쪽에서 순서가 바꿔거나 하면 문제 생길 수 있으니 사용 X

				System.out.print(rs.getInt("deptno") + " ");
				System.out.print(rs.getString("dname") + " ");
				System.out.println(rs.getString("loc"));
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
	}

	// where 문 붙여 조건 붙여 출력하기
	public static void selectDeptWhere() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null;// sql 실행 후 select 결과를 저장하는 객체

		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 실행 쿼리 준비 (불러올 테이블)
		String sqlQuery = " select * from dept where deptno = 30";

		// 쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery); // 실행 준비 / 데이터
			rs = psmt.executeQuery(); // 쿼리 실행

			while (rs.next()) { // 다음에 읽어올 데이터가 있는가? true : 다음 데이터가 있다.

				System.out.print(rs.getInt("deptno") + " ");
				System.out.print(rs.getString("dname") + " ");
				System.out.println(rs.getString("loc"));
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
	}

	// ? 문 사용해 where 사용하기
	public static void findDeptByDeptnoPrint(int deptno) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null;// sql 실행 후 select 결과를 저장하는 객체

		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

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

			while (rs.next()) { // 다음에 읽어올 데이터가 있는가? true : 다음 데이터가 있다.

				System.out.print(rs.getInt("deptno") + " ");
				System.out.print(rs.getString("dname") + " ");
				System.out.println(rs.getString("loc"));
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
	}

	// 외부 클래스 Dept를 만들어 deptno 데이터 찾아 테이블 리턴하기
	public static Professor findDeptByDeptno(int deptno) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null;// sql 실행 후 select 결과를 저장하는 객체

		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 미리 new Dept로 만들면 없는데이터가 아니라 DEFAULT값을 가진 테이블이 생성되어
		// 예기치 않은 오류나 실수를 범할 수 있으므로 확실하게 null로 생성
		Professor dept = null;

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
				dept = new Professor();

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
	public static Professor findDeptByDname(String dname) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null;// sql 실행 후 select 결과를 저장하는 객체

		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		Professor dept = null;

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
				dept = new Professor();

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
	public static List<Professor> findDeptList() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null;// sql 실행 후 select 결과를 저장하는 객체

		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		List<Professor> deptList = null;

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
				Professor dept = new Professor();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));

				if (deptList == null) {
					deptList = new ArrayList<Professor>();
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
	
	public static List<Professor> findDeptList2() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null;// sql 실행 후 select 결과를 저장하는 객체

		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		List<Professor> deptList = new ArrayList<>();

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
				Professor dept = new Professor();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));

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
