package lecture12;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
public class MySQLDBConnection {
	private static MySQLDBConnection instance = new MySQLDBConnection();
	private static String DB_URL = "jdbc:mysql://localhost/university";
	private static String USER = "root";
	private static String PASS = "root";
	
	private Connection CreateConnection() {
		Connection conn =null;
		try {
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		}
		catch(SQLException ie) {
			ie.printStackTrace();
		}
		return conn;
	}
	
	
	public static Connection getConnection() {
		return instance.CreateConnection();
	}
}
