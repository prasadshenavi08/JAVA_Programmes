import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {
	public static void main(String[] args) throws SQLException {
		try{
			//step-1 Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step-2 Establish conncetion											db name	username password
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
			//step-3 Create Statement
			Statement stmt = con.createStatement();
			
			//step-4 Excute the Query
		//	stmt.executeUpdate("drop table if exists student");
			stmt.executeUpdate("Create table if not exists student (roll int , name varchar(20), marks int , total int)");
			System.out.println("Table is Created");
			
			//step-5 Close connection
			con.close();
			
		}catch(ClassNotFoundException e1) {
			
		}finally {
			System.out.println("Code is Excute");
		}
	}
}
