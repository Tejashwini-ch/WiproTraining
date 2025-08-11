package JDBCMySQL;

import java.util.Scanner;

public class EmployeeImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Employee Menu");
            System.out.println("--------------");
            System.out.println("1.Insert a new Record");
            System.out.println("\n 2.Delete a record");
            System.out.println("\n 3.Update the record");
            System.out.println("\n 4.Display the records");
            System.out.println("\n 5.Exit");
            System.out.print("\nEnter your choice (1-5): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    new EmployeeInsert().insertRecord();
                    break;
                case 2:
                    new EmployeeDelete().deleteRecord();
                    break;
                case 3:
                    new EmployeeUpdate().updateRecord();
                    break;
                case 4:
                    new EmployeeDisplay().displayRecord();
                    break;
                case 5:
                	System.out.println("Exiting...GoodBye!");
                	break;
                default:
                    System.out.println("Invalid choice. Please enter 1-4.");
                    break;
            }
        } while (choice != 5);
    }
}