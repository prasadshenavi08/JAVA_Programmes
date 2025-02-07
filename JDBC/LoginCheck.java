import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginCheck {
	public static void main(String[] args) throws SQLException {
		try{
		//step -1 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step -2
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		
		//step -3
		PreparedStatement pstmt = con.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Username");
		String un = sc.next();
		System.out.println("Enter the Password");
		String pw = sc.next();
		
		pstmt.setString(1, un);
		pstmt.setString(2, pw);
		
		ResultSet rs =  pstmt.executeQuery();
		if(rs.next()) {
			System.out.println("Valid Username and Password");
			//System.out.println(rs.getString(1));
			//System.out.println(rs.getString(2));
		}else {
			System.out.println("Invalid Username and Password");
		}
		}
		catch(ClassNotFoundException e1) {
			
		}finally {
			System.out.println("Code is Excute");
		}
	}
}
