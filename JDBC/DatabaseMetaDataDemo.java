import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.DatabaseMetaData;

public class DatabaseMetaDataDemo {
	public static void main(String[] args) {
		try {
			//Step 1 -> Register the driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("Driver is loaded ");
			//Step 2 -> Obtain Connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			
			//System.out.println("Connection established ");
			DatabaseMetaData dbmd = con.getMetaData();
			System.out.println("Database major version : " + dbmd.getDatabaseMajorVersion());
			System.out.println(dbmd.getDatabaseProductName());
			System.out.println(dbmd.getDriverName());
		}
		catch(Exception e) {
			
		}
	}
}
