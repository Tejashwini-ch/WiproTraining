package CollectionsPackage;

public class Employee {
	private int Id;
	private String name;
	private String department;
	
	public Employee(int id,String name, String department) {
		this.Id=id;
		this.name=name;
		this.department=department;
	}

	public int getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", department=" + department + "]";
	}

	
}
