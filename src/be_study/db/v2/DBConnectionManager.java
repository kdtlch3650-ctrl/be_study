package be_study.db.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {
	
	//DBConnectionManager dbM = new DBConnectionManager;
	//dbM.connectDB();
	//public Connection connectDB() {
	
	//DBConnectionManager.connectDB()
	public static Connection connectDB() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
