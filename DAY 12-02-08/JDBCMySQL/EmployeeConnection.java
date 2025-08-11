package JDBCMySQL;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmployeeConnection {
	Connection con = null;

	public Connection getConnection() {

		try {

			String url = "jdbc:mysql://localhost:3306/java_selenium";

			String username = "root";

			String password = "root";

			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url, username, password);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;

	}

}
