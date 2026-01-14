package be_study.quiz.quiz45;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Quiz45 {

	public static void main(String[] args) {
		System.out.println("1. 단일 행을 읽어서 리턴해서 출력하기");
		Product p1 = findProductByDcode(104);
		if (p1 == null) {
			System.out.println("해당 부서명 데이터 없음");
		} else {
			System.out.println(p1.toString());
		}
		
		System.out.println("2. 객체 리스트 단위로 리턴해서 출력하기");
		
		List<Product> productList = findProduct();
//		if(deptList2.size() == 0) { //초기화 O 추가된 데이터가 X 비었다
//		}
		if( productList != null && productList.size() > 0) {
			//조회된 데이터가 있는 경우 처리할 코드
			for(Product d : productList) { 
				System.out.println(d.toString());
			}
		}

	}

	public static Product findProductByDcode(int p_code) {
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

		Product product = null;

		// 실행 쿼리 준비 (불러올 테이블)
		String sqlQuery = " select * from product where p_code = ? ";
		// 왼쪽 부터 ? 번호를 매김 그후 파라미터 세팅에서
		// 위치 채움 psmt.setInt(1, deptno);

		// 쿼리 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery); // 실행 준비 / 데이터

			// 파라미터 세팅 ( 쿼리에 있는 ? 위치 채우기)
			psmt.setInt(1, p_code);

			rs = psmt.executeQuery(); // 쿼리 실행

			if (rs.next()) { // 다음에 읽어올 데이터가 있는가? true : 다음 데이터가 있다.
				// 키로 매개변수를 받아 사용하기에 데이터가 여려개 있을 수 없음
				// while이 아닌 if문으로 있는지만 체크
				product = new Product();

				product.setP_code(rs.getInt("p_code"));
				product.setP_name(rs.getString("p_name"));
				product.setP_price(rs.getInt("p_price"));

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

		return product;
	}
	
	public static List<Product> findProduct() {
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

		List<Product> productList = new ArrayList<>();

		// 실행 쿼리 준비 (불러올 테이블)
		String sqlQuery = " select * from product ";
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
				Product product = new Product();
				product.setP_code(rs.getInt("p_code"));
				product.setP_name(rs.getString("p_name"));
				product.setP_price(rs.getInt("p_price"));

				productList.add(product); // 최종 리턴 할 dept 목록 list에 한 행 추가
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

		return productList;
	}	
}

class Product {
	int p_code;
	String p_name;
	int p_price;
	
	public Product() {};
	
	public Product(int p_code, String p_name, int p_price) {
		super();
		this.p_code = p_code;
		this.p_name = p_name;
		this.p_price = p_price;
	}
	
	public int getP_code() {
		return p_code;
	}
	public void setP_code(int p_code) {
		this.p_code = p_code;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getP_price() {
		return p_price;
	}
	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

	@Override
	public String toString() {
		return "product [p_code=" + p_code + ", p_name=" + p_name + ", p_price=" + p_price + "]";
	}
	
	
}
