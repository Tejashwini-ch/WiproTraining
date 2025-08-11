package JDBCMySQL;

import java.sql.Connection;
import java.sql.Statement;

public class EmployeeInsert {

    public void insertRecord() {
        try {
            Connection conn = new EmployeeConnection().getConnection();
            Statement s = conn.createStatement();
            //sql query to insert into the employee
            //String query = "INSERT INTO employee (empId, empName, empSalary) VALUES (1022, 'Haripriya', 75789)";
            String query = "INSERT INTO employee VALUES (1033,'Prakash',17000),(1034,'Harini',54000)";
            int rows = s.executeUpdate(query);
            System.out.println(rows + " record(s) inserted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}