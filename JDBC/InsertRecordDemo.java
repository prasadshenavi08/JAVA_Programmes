import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecordDemo {
	public static void main(String[] args) throws SQLException {
		try{
			//step-1 Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step-2 Establish conncetion											db name	username password
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
			//step-3 Create Statement
			Statement stmt = con.createStatement();
			
			//step-4 Excute the Query
			stmt.executeUpdate("insert into student values(101, 'prasad', 77 , 250)");
			
			System.out.println("Record is Inserted");
			
			//step-5 Close connection
			con.close();
			
		}catch(ClassNotFoundException e1) {
			
		}finally {
			System.out.println("Code is Excute");
		}
	}
}
