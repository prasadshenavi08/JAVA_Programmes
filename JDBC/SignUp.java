import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SignUp {
	public static void main(String[] args) throws SQLException {
		try{
			//step-1 Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step-2 Establish conncetion
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
			//step-3 Create Statement
			PreparedStatement pstmt = con.prepareStatement("insert into users values(?,?,?,?,?,?)");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter User ID : ");
			int r = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter User Full Name : ");
			String n = sc.nextLine();
			
			System.out.println("Enter User Email : ");
			String e = sc.nextLine();
			
			System.out.println("Enter User Mobile Number : ");
			String m = sc.nextLine();
			
			System.out.println("Enter the Username");
			String un = sc.next();
			
			System.out.println("Enter the Password");
			String pw = sc.next();
			
			pstmt.setInt(1, r);
			pstmt.setString(2, n);
			pstmt.setString(3, e);
			pstmt.setString(4, m);
			pstmt.setString(5, un);
			pstmt.setString(6, pw);
			
			//step-4 Excute the Query
			pstmt.executeUpdate();
			System.out.println("Record is Inserted");
			
			//step-5 Close connection
			con.close();
			
		}catch(ClassNotFoundException e1) {
			
		}finally {
			System.out.println("Code is Excute");
		}
	}
}
