package be_study.db.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
	
	public Product findProductByPCode(int pCode) {

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		Product product = null;

		// 실행 쿼리 준비
		String sqlQuery = " select * from product where p_code = ? ";

		// 쿼리 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);

			// 파라미터 세팅 (쿼리에 있는 ? 위치 채우기)
			psmt.setInt(1, pCode);

			rs = psmt.executeQuery();

			// 조회 결과가 1개 행만 나오는 상황
			if (rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다.
				// 데이터가 있다
				product = new Product();

				product.setpCode( rs.getInt("p_code"));
				product.setpName( rs.getString("p_name"));
				product.setpPrice( rs.getInt("p_price"));
			}
			// if 가 거짓이면 데이터가 없다...

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return product;
	}
	
	public List<Product> findProductList() {

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; // db연결하여 sql 명령 실행해주는 객체
		ResultSet rs = null; // sql 실행 후 select 결과를 저장하는 객체

		conn = DBConnectionManager.connectDB();

		List<Product> productList = null;

		// 실행 쿼리 준비
		String sqlQuery = " select * from product ";

		// 쿼리 실행 후 후속 데이터 처리
		try {

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			// 조회 결과가 1개 행만 나오는 상황
			while (rs.next()) { // 다음에 읽어올 데이터가 있는가? true 다음 데이터가 있다.
				// 데이터가 있다

				Product product = new Product();

				product.setpCode( rs.getInt("p_code"));
				product.setpName( rs.getString("p_name"));
				product.setpPrice( rs.getInt("p_price"));

				if (productList == null) {
					productList = new ArrayList<Product>();
				}
				productList.add(product); // 최종 return 할 dept목록 list에 추가
			}
			// if 가 거짓이면 데이터가 없다...

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return productList;
	}
	
}
