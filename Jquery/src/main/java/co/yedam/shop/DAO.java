package co.yedam.shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	
	public Connection conn;
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "demo";
	private String password = "demo";
	
	public DAO( ) {
		//생성자 호출 시 connection 객체 생성
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("연결성공!!!");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("연결실패!!!");
			e.printStackTrace();
		}
		
	}
	
	// connection 객체 반환
	public void disconnect( ) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e ) {
				e.printStackTrace();
			}
		}
	}

}
