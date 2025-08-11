package pkg;

public class Employee {
	private int Emp_id;
	private String Emp_name;
	private String Dept;
	private int Emp_salary;
	
	public Employee()
	{
	}

	public Employee(int Emp_id, String Emp_name, String Dept, int Emp_salary) {
		this.Emp_id = Emp_id;
		this.Emp_name=Emp_name;
		this.Dept = Dept;
		this.Emp_salary = Emp_salary;
	}

	public int getEmp_id() {
		return Emp_id;
	}

	public void setEmp_id(int Emp_id) {
		this.Emp_id = Emp_id;
	}
	

	public String getEmp_name() {
		return Emp_name;
	}

	public void setEmp_name(String Emp_name) {
		this.Emp_name = Emp_name;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String Dept) {
		this.Dept = Dept;
	}

	public int getEmp_salary() {
		return Emp_salary;
	}

	public void setEmp_salary(int Emp_salary) {
		this.Emp_salary = Emp_salary;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + Emp_id + ", emp_name=" + Emp_name + ", dept=" + Dept + ", emp_salary=" + Emp_salary
				+ "]";
	}

	
	
	

}
