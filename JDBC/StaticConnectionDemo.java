import java.sql.Connection;
import java.sql.DriverManager;

public class StaticConnectionDemo {
	public static Connection getConnection() {
		Connection con = null;
		try{
		//step -1 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step -2
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
