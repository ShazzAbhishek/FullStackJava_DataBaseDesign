import java.sql.*;

public class BookDao {
	public static int save(int bookID, String bookTitle, String author, String publisher, int copies) {
		int status = 0;
		try {
			Connection conn = Database.getConnection();
			PreparedStatement ps = conn.prepareStatement("insert into book(bookid,booktitle,copies,Author,Publisher) values(?,?,?,?,?)");
			ps.setInt(1,bookID);
			ps.setString(2,bookTitle);
			ps.setInt(3,copies);
			ps.setString(4,author);
			ps.setString(5,publisher);
			System.out.println("inside BookDao above executeUpdate");
			status = ps.executeUpdate();
			System.out.println("inside BookDao below executeUpdate");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
