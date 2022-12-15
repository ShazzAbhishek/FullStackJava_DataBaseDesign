import java.sql.*;

public class Database {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("inside driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/LMSMaster","postgres", "Abhi1234");
			if (conn != null) {
	                System.out.println("Connected to the database!");
	            } else {
	                System.out.println("Failed to make connection!");
	            }
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName()+": "+e.getMessage());
	        System.exit(0);
		}
		return conn;
	}
}
