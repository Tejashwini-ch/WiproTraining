package AssessmentPractice1;

import java.util.*;

public class EmployeeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample data
        EmployeePersonalDetails personal = new EmployeePersonalDetails("Tejashwini", 22, "9876543210", "Hyderabad");
        List<EmployeeProfessionalDetails.Professional> empDetails = new ArrayList<>();
        empDetails.add(new EmployeeProfessionalDetails.Professional("E1001","teju@gmail.com","IT","Hyderabad"));
        empDetails.add(new EmployeeProfessionalDetails.Professional("E1002","chandu@gmail.com","Support","Bangalore"));
        empDetails.add(new EmployeeProfessionalDetails.Professional("E1003","shannu@gmail.com","Testing","Chennai"));

        EmployeeSalaryDetails salary = new EmployeeSalaryDetails(1000000, 60000.35, 10000.2, 5000.40);
        EmployeeLeaveDetails leaves = new EmployeeLeaveDetails(12, 8, 5);

        List<EmployeeProjectDetails.Project> projectList = new ArrayList<>();
        projectList.add(new EmployeeProjectDetails.Project("Text Phishing", "Checks whether the given text is phishing or not", "Backend Developer"));
        projectList.add(new EmployeeProjectDetails.Project("Sorting visulaizer", "Provides Sorting for all algorithms ", "Frontend Developer"));
        projectList.add(new EmployeeProjectDetails.Project("Flavour Fiesta", "It is a website where we can order food online", "Full Stack Developer"));

        int choice;
        do {
            System.out.println("\n-----------Employee Menu---------------");
            System.out.println("1. Display Employee Personal Details.");
            System.out.println("2. Display Employee Professional Details.");
            System.out.println("3. Display Employee Salary Details.");
            System.out.println("4. Display Employee Leave Details");
            System.out.println("5. Display Employee Projects Undertaken.");
            System.out.println("6. Exit the Menu.");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Personal Details ---");
                    System.out.println(personal);
                    break;
                case 2:
                    System.out.println("\n--- Professional Details ---");
                    for(EmployeeProfessionalDetails.Professional e:empDetails) {
                    	System.out.println(e);
                    	System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("\n--- Salary Details ---");
                    System.out.println(salary);
                    break;
                case 4:
                    System.out.println("\n--- Leave Details ---");
                    System.out.println(leaves);
                    break;
                case 5:
                    System.out.println("\n--- Projects Undertaken ---");
                    for (EmployeeProjectDetails.Project p : projectList) {
                        System.out.println(p);
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}
