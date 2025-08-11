package JDBCMySQL;

import java.sql.*;

public class PreparedStatementExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/java_selenium"; // Replace with your DB URL
        String user = "root";
        String password = "root";

        String insertSQL = "INSERT INTO users (name, email) VALUES (?, ?)";
        String updateSQL = "UPDATE users SET email = ? WHERE name = ?";
        String deleteSQL = "DELETE FROM users WHERE name = ?";


        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(insertSQL);
             PreparedStatement pstmtDel = conn.prepareStatement(deleteSQL);
             PreparedStatement pstmtUpd= conn.prepareStatement(updateSQL)){

            // Set values for the placeholders
        	int rowsInserted = 0;

            pstmt.setString(1, "Dolly");
            pstmt.setString(2, "Dolly@example.com");
      
            pstmt.setString(1, "Esther");
            pstmt.setString(2, "Esther@example.com");
            pstmt.executeUpdate();

            
            pstmt.setString(1, "Funky");
            pstmt.setString(2, "Funky@example.com");


            rowsInserted += pstmt.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
/*package JDBCMySQL;

import java.sql.*;

public class PreparedStatementExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/java_selenium"; // Replace with your DB URL
        String user = "root";                                      // Replace with your DB username
        String password = "root";                                  // Replace with your DB password

        String insertSQL = "INSERT INTO users (name, email) VALUES (?, ?)";
        String updateSQL = "UPDATE users SET email = ? WHERE name = ?";
        String deleteSQL = "DELETE FROM users WHERE name = ?";

        try (
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmtInsert = conn.prepareStatement(insertSQL);
            PreparedStatement pstmtUpdate = conn.prepareStatement(updateSQL);
            PreparedStatement pstmtDelete = conn.prepareStatement(deleteSQL)
        ) {
            int rowsInserted = 0;

            // ✅ Insert multiple users
            String[][] users = {
                {"Dolly", "Dolly@example.com"},
                {"Esther", "Esther@example.com"},
                {"Funky", "Funky@example.com"}
            };

            for (String[] userData : users) {
                pstmtInsert.setString(1, userData[0]); // name
                pstmtInsert.setString(2, userData[1]); // email
                rowsInserted += pstmtInsert.executeUpdate();
            }

            System.out.println(rowsInserted + " row(s) inserted.");

            // ✅ Update Esther's email
            pstmtUpdate.setString(1, "esther.new@example.com"); // new email
            pstmtUpdate.setString(2, "Esther");                 // name to match
            int rowsUpdated = pstmtUpdate.executeUpdate();
            System.out.println(rowsUpdated + " row(s) updated.");

            // ✅ Delete Funky
            pstmtDelete.setString(1, "Funky");
            int rowsDeleted = pstmtDelete.executeUpdate();
            System.out.println(rowsDeleted + " row(s) deleted.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}*/
