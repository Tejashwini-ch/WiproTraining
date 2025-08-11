package JDBCMySQL;

import java.sql.Connection;
import java.sql.Statement;

public class EmployeeUpdate {

    public void updateRecord() {
        try {
            Connection conn = new EmployeeConnection().getConnection();
            Statement s=conn.createStatement();

            //sql query to update the query
            String query = "UPDATE employee SET empName = 'Mr.ChanduVardhan.', empSalary = 85000 WHERE empId = 1031";
            int rows = s.executeUpdate(query);
            System.out.println(rows + " record(s) updated.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}