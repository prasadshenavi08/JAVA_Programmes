import java.sql.*;

public class ReadRecordDemo {
	public static void main(String[] args) {
		try{	
			Connection con = StaticConnectionDemo.getConnection();
			
			//step-3 Create Statement
			PreparedStatement pstmt = con.prepareStatement("select * from student");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) +rs.getString("name")+ rs.getInt("marks") + rs.getInt("total"));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
