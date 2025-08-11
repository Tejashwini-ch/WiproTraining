package JDBCMySQL;
 
import java.sql.*;
public class JDBCConnection{
    public static void main(String[] args)
    {
        // Database URL, username, and password
 
        // Replace with your database name
        String url
            = "jdbc:mysql://localhost:3306/java_selenium";
 
        // Replace with your MySQL username
        String username = "root";
 
        // Replace with your MySQL password
        String password = "root";
 
        // Updated query syntax for modern databases
        String query
            = "INSERT INTO employee(empId, empName,empSalary) VALUES (1008, 'Harry',950000)";
 
        // Establish JDBC Connection
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
 
            // Establish connection
            Connection c = DriverManager.getConnection(url, username, password);
 
            // Create a statement
            Statement st = c.createStatement();
 
            // Execute the query
            int count = st.executeUpdate(query);
            System.out.println(
                "Number of rows affected by this query: "
                + count);
 
            // Close the connection
            st.close();
            c.close();
            System.out.println("Connection closed.");
        }
        catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: "
                               + e.getMessage());
        }
        catch (SQLException e) {
            System.err.println("SQL Error: "
                               + e.getMessage());
        }
    }
}
