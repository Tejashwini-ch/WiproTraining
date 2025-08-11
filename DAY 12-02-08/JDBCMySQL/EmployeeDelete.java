package JDBCMySQL;

import java.sql.Connection;
import java.sql.Statement;

public class EmployeeDelete {
    public void deleteRecord() {
        try {
            Connection conn = new EmployeeConnection().getConnection();
            Statement s = conn.createStatement();

            //sql query to delete a record
            String query = "DELETE FROM employee WHERE empId = 1033";

            int rows = s.executeUpdate(query);
            System.out.println(rows + " record(s) deleted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}