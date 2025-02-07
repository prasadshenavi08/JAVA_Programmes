import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class insertRecordPara {
	public static void main(String[] args) throws SQLException {
		try{
			//step-1 Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step-2 Establish conncetion											db name	username password
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
			//step-3 Create Statement
//			Statement stmt = con.createStatement();
			PreparedStatement pstmt = con.prepareStatement("insert into student values(?,?,?,?)");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Roll Number : ");
			int r = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Student Name : ");
			String n = sc.nextLine();
			
			System.out.println("Enter Student Marks : ");
			int m = sc.nextInt();
			
			System.out.println("Enter Student Total Marks : ");
			int t = sc.nextInt();
			
			pstmt.setInt(1, r);
			pstmt.setString(2, n);
			pstmt.setInt(3, m);
			pstmt.setInt(4, t);
			
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
