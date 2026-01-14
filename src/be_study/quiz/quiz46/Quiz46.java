package be_study.quiz.quiz46;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Quiz46 {

	public static void main(String[] args) {
		
		List<Professor> professorList = findProfessorListByDeptno(103);
//		if(deptList2.size() == 0) { //초기화 O 추가된 데이터가 X 비었다
//		}
		if( professorList != null && professorList.size() > 0) {
			//조회된 데이터가 있는 경우 처리할 코드
			for(Professor d : professorList) { 
				System.out.println(d.toString());
			}
		}

	}
	
	public static List<Professor> findProfessorListByDeptno(int deptno) {
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

		List<Professor> professorList = new ArrayList<>();

		// 실행 쿼리 준비 (불러올 테이블)
		String sqlQuery = " select * from professor where deptno = ? ";
		// 왼쪽 부터 ? 번호를 매김 그후 파라미터 세팅에서
		// 위치 채움 psmt.setInt(1, deptno);

		// 쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery); // 실행 준비 / 데이터

			// 파라미터 세팅 ( 쿼리에 있는 ? 위치 채우기)
			psmt.setInt(1, deptno);

			rs = psmt.executeQuery(); // 쿼리 실행

			while (rs.next()) { // 다음에 읽어올 데이터가 있는가? true : 다음 데이터가 있다.
				// 데이터가 있다.

				// dept 조회한 '하나'의 행 데이터
				Professor dept = new Professor();
				dept.setProfno(rs.getInt("profno"));
				dept.setName(rs.getString("name"));
				dept.setId(rs.getString("id"));
				dept.setPosition(rs.getString("position"));
				dept.setPay(rs.getInt("pay"));
				dept.setDeptno(rs.getInt("deptno"));

				professorList.add(dept); // 최종 리턴 할 dept 목록 list에 한 행 추가
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

		return professorList;
	}

}

class Professor {
	int profno;
	String name;
	String id;
	String position;
	int pay;
	int deptno;
	
	
	
	public Professor() {
		super();
	}

	public Professor(int deptno) {
		super();
		this.deptno = deptno;
	}
	
	public int getProfno() {
		return profno;
	}
	public void setProfno(int profno) {
		this.profno = profno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "Professor [profno=" + profno + ", name=" + name + ", id=" + id + ", position=" + position + ", pay="
				+ pay + ", deptno=" + deptno + "]";
	}
	
	
}