import java.sql.*;

public class ReturnBookDao {
	public static int delete(String emailid, int bookid){
		int status = 0;
		try {
			Connection conn = Database.getConnection();
			
			status = updatebook(bookid);
			
			if(status > 0) {
				PreparedStatement ps = conn.prepareStatement("delete from book_access where email=? and bookid=?");
				ps.setString(1,emailid);
				ps.setInt(2,bookid);
				status = ps.executeUpdate();
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public static int updatebook(int bookid) {
		int status = 0;
//		int quantity = 0, issued = 0;
//		try {
//			Connection conn = Database.getConnection();
//			// get the number of copies from book table
//			
//			PreparedStatement ps = conn.prepareStatement("select quantity,issued from books where callno=?");
//			ps.setInt(1,bookid);
//			ResultSet rs = ps.executeQuery();
//			if(rs.next()) {
//				quantity = rs.getInt("quantity");
//				issued = rs.getInt("issued");
//			}
			
			
			int quantity = 0;
			//issued = 0;
			try {
				Connection conncopies = Database.getConnection();
				System.out.println("inside updatebook above prepared attement");
				PreparedStatement pscopies = conncopies.prepareStatement("select copies from book where bookid=?");
				pscopies.setInt(1,bookid);
				ResultSet rscopies = pscopies.executeQuery();
				System.out.println("inside updatebook below prepared attement");
				if(rscopies.next()) {
					quantity = rscopies.getInt("copies");
					System.out.println("quantity of copies inside return book dao"+quantity);
				}
			// update the copies in the book table
			
			if(quantity > 0) {
				PreparedStatement ps2 = conncopies.prepareStatement("update book set copies=? where bookid=?");
				ps2.setInt(1,quantity+1);
				ps2.setInt(2,bookid);
				status = ps2.executeUpdate();
			}
			conncopies.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
