package CollectionsPackage;
import java.util.*;
public class EmployeeImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Employee> employeeList=new ArrayList<>();
		//now we have to add new employees
		employeeList.add(new Employee(1001,"Alice","CSE"));
		employeeList.add(new Employee(1002,"Bob","ECE"));
		employeeList.add(new Employee(1003,"Catherine","CIV"));
		employeeList.add(new Employee(1004,"Dolly","EEE"));
		employeeList.add(new Employee(1005,"Esther","MEC"));
		
		//Displaying all employees
		System.out.println("List of all Employees");
		for(Employee emp:employeeList) {//we dont write int here becoz we have declare all the values in Employee classs
			System.out.println(emp);
		}
		
		//Search by id
		System.out.println("Enter the ID to Search: ");
		int searchId=sc.nextInt();
		boolean found=false;
		for(Employee emp:employeeList) {
			if(emp.getId()==searchId) {
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("Employee with ID " + searchId + " not found.");
        }
		
		// Remove by ID
		System.out.println("Enter the department which yo want to remove");
		int removeId=sc.nextInt();
		Employee toRemove=null;
		for(Employee emp:employeeList) {
			if(emp.getId()==removeId) {
				toRemove=emp;
				break;
			}
		}
		if (toRemove != null) {
            employeeList.remove(toRemove);
            System.out.println("Employee removed.");
        } else {
            System.out.println("Employee with ID " + removeId + " not found.");
        }
		
		//to remove by string
		System.out.println("Enter the department name you want to remove:");
		String removeDepartment = sc.next();
		Employee toRemoveDept = null;

		for (Employee emp : employeeList) {
		    if (emp.getDepartment().equalsIgnoreCase(removeDepartment)) {
		    	//here while comparing we use equals ignore case means if we give dept 
		    	//in Capital or lower letter if it matches with dept it removes it.
		        toRemoveDept = emp;
		        break;
		    }
		}

		if (toRemove != null) {
		    employeeList.remove(toRemoveDept);
		    System.out.println("Employee from department " + removeDepartment + " removed.");
		} else {
		    System.out.println("No employee found from department " + removeDepartment + ".");
		}
		
		//final list
		System.out.println("\nUpdated Employee List:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
	}

}
