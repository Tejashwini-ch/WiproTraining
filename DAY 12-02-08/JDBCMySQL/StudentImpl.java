package JDBCMySQL;
 
import java.sql.Connection;

import java.sql.DriverManager;
 
public class StudentImpl {

	Connection con=null;

	public Connection getConnection() {

		try {

			// Replace with your database name

	        String url="jdbc:mysql://localhost:3306/java_selenium";
 
	        // Replace with your MySQL username

	        String username = "root";
 
	        // Replace with your MySQL password

	        String password = "root";
 
				// Load MySQL Type-4 driver class

	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Establish connection

	            con = DriverManager.getConnection(url, username, password);

	        }catch(Exception e) {e.printStackTrace();}

		return con;

	}

}

 