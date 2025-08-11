package JDBCMySQL;

import java.sql.*;

public class CallableInsertCar {
    static Connection con = null;

    public static void main(String[] args) throws Exception {
       

        try {
            
            String url = "jdbc:mysql://localhost:3306/java_selenium";
            String username = "root";
            String password = "root";

            // Load MySQL JDBC driver
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            // Establish connection
            con = DriverManager.getConnection(url, username, password);

            // Prepare CallableStatement
            CallableStatement cstmt = con.prepareCall("{call insertCarDetails(?, ?, ?)}");

            // First car
            cstmt.setString(1, "Jaquar");
            cstmt.setString(2, "F-Type");
            cstmt.setInt(3, 2020);
            cstmt.execute();

            // Second car
            cstmt.setString(1, "Tata");
            cstmt.setString(2, "Nexon");
            cstmt.setInt(3, 2018);
            cstmt.execute();

            // Third car
            cstmt.setString(1, "Benz");
            cstmt.setString(2, "AMG GT");
            cstmt.setInt(3, 2022);
            cstmt.execute();

            System.out.println("Car records inserted successfully.");

        } catch (SQLException se) {
            System.err.println("SQL Error occurred.");
            se.printStackTrace();
        }
    }
}