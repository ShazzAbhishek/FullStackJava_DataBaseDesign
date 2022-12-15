import java.sql.*;

public class IssueBookDao {
	public static boolean checkBook(String emailid, int bookid) {
		System.out.println("isnide checkBook");
		boolean status = false;
		boolean status1 = false;
		// This confirms that both book and users exist in db...
		try {
			Connection conn = Database.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from book where bookid=?");
			System.out.println("inside checkBook below prepared attement");
			ps.setInt(1,bookid);
		    ResultSet rs = ps.executeQuery();
			status = rs.next();
			PreparedStatement pslib = conn.prepareStatement("select * from members where email=?");
			System.out.println("inside checkBook below prepared attement "+pslib);
			pslib.setString(1,emailid);
		    ResultSet rslib = pslib.executeQuery();
			status1 = rslib.next();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status && status1;
	}
	
	public static int save(String emailid,int bookid){
		System.out.println("inside save method of issue book dao");
		int status = 0;
		try {
			Connection conn = Database.getConnection();
			status = updatebook(emailid,bookid);
//			if(status > 0) {
//			System.out.println("inside save above prepared attement");
//			PreparedStatement ps = conn.prepareStatement("insert into book_access(emailid,bookid) values(?,?)");
//			System.out.println("inside save below prepared attement");
//			ps.setString(1,emailid);
//			ps.setInt(2,bookid);
////			ps.setString(3,studentname);
////			ps.setString(4,studentcontact);
//			status = ps.executeUpdate();
//			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public static int updatebook(String emailid,int bookid) {
		System.out.println("inside update");
		int status = 0;
		int quantity = 0;
		//issued = 0;
		try {
			Connection conn = Database.getConnection();
			System.out.println("inside updatebook above prepared attement");
			PreparedStatement ps = conn.prepareStatement("select copies from book where bookid=?");
			ps.setInt(1,bookid);
			ResultSet rs = ps.executeQuery();
			System.out.println("inside updatebook below prepared attement");
			if(rs.next()) {
				quantity = rs.getInt("copies");
				System.out.println("quantity"+quantity);
			}
			
			if(quantity > 0) {
			System.out.println("inside updatebook insert above prepared attement");	
			PreparedStatement ps1 = conn.prepareStatement("insert into book_access(email,bookid) values(?,?)");
			ps1.setString(1,emailid);
			ps1.setInt(2,bookid);
			status = ps1.executeUpdate();
			System.out.println("inside updatebook insert below prepared attement");
//			PreparedStatement ps2 = conn.prepareStatement("select copies from book where bookid=?");
//			ps2.setInt(3,bookid);
//			status = ps2.executeUpdate();
			System.out.println("inside updatebook update above prepared attement");	
			PreparedStatement ps3 = conn.prepareStatement("update book set copies=? where bookid=?");
			ps3.setInt(1,quantity-1);
			ps3.setInt(2,bookid);
			status = ps3.executeUpdate();
			System.out.println("inside updatebook update below prepared attement");	
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
