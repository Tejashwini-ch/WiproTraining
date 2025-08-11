package pkg;

public class EmployeeImpl {
	public static void main(String[] args) {
		Employee emp1 = new Employee(01, "Tejashwini", "CSE", 10000);
		Employee emp2 = new Employee(02, "Chandu", "ECE", 20000);
		Employee emp3 = new Employee(03, "Shanmukha", "CIV", 30000);
		Employee emp4 = new Employee(04, "George", "MEC", 40000);
		Employee emp5 = new Employee(05, "Catherene", "IT", 50000);
		
		Employee emp6 = new Employee();
		emp6.setEmp_id(06);
		emp6.setEmp_name("Siddhartha");
		emp6.setDept("CSE");
		emp6.setEmp_salary(60000);
		
		Employee emp7 = new Employee();
		emp7.setEmp_id(7);
		emp7.setEmp_name("George");
		emp7.setDept("ECE");
		emp7.setEmp_salary(70000);

		Employee emp8 = new Employee();
		emp8.setEmp_id(8);
		emp8.setEmp_name("Hamsini");
		emp8.setDept("CIV");
		emp8.setEmp_salary(80000);

		Employee emp9 = new Employee();
		emp9.setEmp_id(9);
		emp9.setEmp_name("Ivana");
		emp9.setDept("MEC");
		emp9.setEmp_salary(90000);

		Employee emp10 = new Employee();
		emp10.setEmp_id(10);
		emp10.setEmp_name("Juliet");
		emp10.setDept("IT");
		emp10.setEmp_salary(100000);
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		System.out.println(emp5);
		System.out.println(emp6);
		System.out.println(emp7);
		System.out.println(emp8);
		System.out.println(emp9);
		System.out.println(emp10);

	}

}
