import java.sql.*;

public class UserDao {	
	//public static int save (String name, String password, String email, String address, String city, String contact) {
	  public static int save (String pin,String firstname,String lastname,String email, String phone, String logintype)
	  {
		int status = 0;
		try {
			Connection conn = Database.getConnection();
			if (logintype.equals("lib"))
			{
			PreparedStatement ps = conn.prepareStatement("insert into librarians(pin,firstname,lastname,email,phone) values(?,?,?,?,?)");
			ps.setString(1,pin);
			ps.setString(2,firstname);
			ps.setString(3,lastname);
			ps.setString(4,email);
			ps.setString(5,phone);
			System.out.println("Above executeUpdate of UserDao");
			status = ps.executeUpdate();
			System.out.println("below executeUpdate of UserDao");
			}
			else if(logintype.equals("user")) {
				PreparedStatement ps = conn.prepareStatement("insert into members(pin,firstname,lastname,email,phone) values(?,?,?,?,?)");
				ps.setString(1,pin);
				ps.setString(2,firstname);
				ps.setString(3,lastname);
				ps.setString(4,email);
				ps.setString(5,phone);
				System.out.println("Above executeUpdate of UserDao");
				status = ps.executeUpdate();
				System.out.println("below executeUpdate of UserDao");
				
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public static int delete (String id, String logintype) {
		int status = 0;
		try {
			Connection conn = Database.getConnection();
			if (logintype.equals("lib")) {
			PreparedStatement ps = conn.prepareStatement("delete from librarians where email=?");
			ps.setString(1,id);
			System.out.println("inside user dao delete above execute update");
			status = ps.executeUpdate();
			System.out.println("inside user dao delete below execute update");
			}
			else if(logintype.equals("user")) {
				PreparedStatement ps = conn.prepareStatement("delete from members where email=?");
				ps.setString(1,id);
				System.out.println("inside user dao delete above execute update");
				status = ps.executeUpdate();
				System.out.println("inside user dao delete below execute update");	
				
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public static boolean validate (String name, String password){
		boolean status = false;
		try {
			Connection conn = Database.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from librarian where name=? and password=?");
			ps.setString(1,name);
			ps.setString(2,password);
			ResultSet rs = ps.executeQuery();
			status=rs.next();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
