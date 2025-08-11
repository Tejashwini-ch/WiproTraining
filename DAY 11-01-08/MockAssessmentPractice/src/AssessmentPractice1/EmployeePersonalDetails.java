package AssessmentPractice1;

public class EmployeePersonalDetails {
	String empName;
	int empAge;
	String empNumber;
	String empLocation;
	public EmployeePersonalDetails(String empName, int empAge, String empNumber, String empLocation) {

		this.empName = empName;
		this.empAge = empAge;
		this.empNumber = empNumber;
		this.empLocation = empLocation;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public String getEmpNumber() {
		return empNumber;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	@Override
	public String toString() {
		return "EmployeePersonalDetails \nempName=" + empName + 
				",\n empAge=" + empAge + 
				",\n empNumber=" + empNumber
				+ ",\n empLocation=" + empLocation ;
	}
	

}
