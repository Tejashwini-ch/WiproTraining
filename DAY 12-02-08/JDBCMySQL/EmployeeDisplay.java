package JDBCMySQL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDisplay {

    public static void displayRecord() {

        try {
            // Get connection from EmployeeConnection class
            Connection conn= new EmployeeConnection().getConnection();
            Statement s = conn.createStatement();

            // SQL query to display the records in employee
            String query = "SELECT * FROM employee";

            // Execute query
            ResultSet rs = s.executeQuery(query);

            // Loop through all records
            while (rs.next()) {
                int id = rs.getInt("empId");
                String name = rs.getString("empName");
                double salary = rs.getDouble("empSalary");

                System.out.println("ID: " + id + ", Name: " + name + ", Salary: ₹" + salary);
            }

            // Close resources
            rs.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}