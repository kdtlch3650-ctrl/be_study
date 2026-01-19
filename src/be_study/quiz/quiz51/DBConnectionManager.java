package be_study.quiz.quiz51;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnectionManager {

	// DBConnectionManager dbM = new DBConnectionManager();
	// dbM.connectDB();
	// public Connection connectDB() {

	// DBConnectionManager.connectDB()
	public static Connection connectDB() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null;

		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}

	public static void disconnectDB(Connection conn, PreparedStatement psmt, ResultSet rs) {
		// DB 연결 종료
		try {
			if (rs != null) {
				rs.close(); // Null인 객체를 대상으로 close() 메소드를 호출하면? -> NullPointerException
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

}
