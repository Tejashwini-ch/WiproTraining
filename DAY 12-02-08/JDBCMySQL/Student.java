package JDBCMySQL;

import java.sql.*;

public class Student {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_selenium";
        String username = "root";
        String password = "root";

        // 1. Create table with 10 fields
        String createTableQuery = "CREATE TABLE IF NOT EXISTS student (" +
                "id INT PRIMARY KEY, " +
                "name VARCHAR(50), " +
                "age INT, " +
                "gender VARCHAR(10), " +
                "email VARCHAR(100), " +
                "phone VARCHAR(15), " +
                "address VARCHAR(100), " +
                "course VARCHAR(50), " +
                "year INT, " +
                "grade CHAR(1))";

        // 2. Insert 10 records
        String insertQuery = "INSERT INTO student VALUES " +
                "(1001, 'Alice', 20, 'Female', 'alice@example.com', '1234567890', 'City A', 'CS', 2, 'A')," +
                "(1002, 'Bob', 21, 'Male', 'bob@example.com', '1234567891', 'City B', 'IT', 3, 'B')," +
                "(1003, 'Charlie', 22, 'Male', 'charlie@example.com', '1234567892', 'City C', 'ECE', 4, 'C')," +
                "(1004, 'Diana', 23, 'Female', 'diana@example.com', '1234567893', 'City D', 'MECH', 1, 'A')," +
                "(1005, 'Eve', 24, 'Female', 'eve@example.com', '1234567894', 'City E', 'CIVIL', 2, 'B')," +
                "(1006, 'Frank', 25, 'Male', 'frank@example.com', '1234567895', 'City F', 'CS', 3, 'C')," +
                "(1007, 'Grace', 26, 'Female', 'grace@example.com', '1234567896', 'City G', 'IT', 4, 'A')," +
                "(1008, 'Henry', 27, 'Male', 'henry@example.com', '1234567897', 'City H', 'ECE', 1, 'B')," +
                "(1009, 'Ivy', 28, 'Female', 'ivy@example.com', '1234567898', 'City I', 'MECH', 2, 'C')," +
                "(1010, 'Jack', 29, 'Male', 'jack@example.com', '1234567899', 'City J', 'CIVIL', 3, 'A')";

        // 3. Delete 2nd and 4th records (IDs: 1002, 1004)
        String deleteQuery = "DELETE FROM student WHERE id IN (1002, 1004)";

        // 4. Update 5th record (ID: 1005)
        String updateQuery = "UPDATE student SET age = 25, email = 'eve.new@example.com', grade = 'A' WHERE id = 1005";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection(url, username, password);
            Statement st = c.createStatement();

            // Create table
            st.executeUpdate(createTableQuery);
            System.out.println(" Table created successfully.");

            // Insert records
            int inserted = st.executeUpdate(insertQuery);
            System.out.println(" " + inserted + " records inserted.");

            // Delete records
            int deleted = st.executeUpdate(deleteQuery);
            System.out.println(" " + deleted + " records deleted.");

            // Update record
            int updated = st.executeUpdate(updateQuery);
            System.out.println(" " + updated + " record updated.");

            // Display all records
            ResultSet rs = st.executeQuery("SELECT * FROM student");
            System.out.println("\n Student Records:");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + ", " +
                    rs.getString("name") + ", " +
                    rs.getInt("age") + ", " +
                    rs.getString("gender") + ", " +
                    rs.getString("email") + ", " +
                    rs.getString("phone") + ", " +
                    rs.getString("address") + ", " +
                    rs.getString("course") + ", " +
                    rs.getInt("year") + ", " +
                    rs.getString("grade")
                );
            }

            st.close();
            c.close();
            System.out.println("\n🔒 Connection closed.");
        } catch (ClassNotFoundException e) {
            System.err.println("❌ JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("❌ SQL Error: " + e.getMessage());
        }
    }
}