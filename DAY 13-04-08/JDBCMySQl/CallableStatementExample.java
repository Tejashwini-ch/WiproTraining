package JDBCMySQL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableStatementExample {
    static Connection con = null;

    public static void main(String args[]) throws Exception {
        try {
            String url = "jdbc:mysql://localhost:3306/java_selenium";
            String username = "root";
            String password = "root";

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);

            // ✅ Prepare one CallableStatement
            CallableStatement cstmt = con.prepareCall("{call myProcedure(?, ?, ?)}");

            // Insert 1st employee
            cstmt.setInt(1, 1051);           // empId
            cstmt.setString(2, "Johnny");    // empName
            cstmt.setInt(3, 21000);          // salary
            cstmt.execute();

            // Insert 2nd employee
            cstmt.setInt(1, 1052);
            cstmt.setString(2, "Teddy");
            cstmt.setInt(3, 6800);
            cstmt.execute();

            // Insert 3rd employee
            cstmt.setInt(1, 1053);
            cstmt.setString(2, "Pintu");
            cstmt.setInt(3, 1900);
            cstmt.execute();

            System.out.println("Rows inserted ....");

        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}