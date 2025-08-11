package AssessmentPractice1;

public class EmployeeSalaryDetails {
	double ctc;
	double baseSalary;
	double bonus;
	double allowance;

	public EmployeeSalaryDetails(double ctc, double baseSalary, double bonus, double allowance) {
		this.ctc = ctc;
		this.baseSalary = baseSalary;
		this.bonus = bonus;
		this.allowance = allowance;
	}

	public double getCtc() {
		return ctc;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public double getBonus() {
		return bonus;
	}

	public double getAllowance() {
		return allowance;
	}

	public double getTotalSalary() {
		return baseSalary + bonus + allowance;
	}

	@Override
    public String toString() {
        return "EmployeeSalaryDetails \nCTC=" + ctc +
               "\n Base Salary=" + baseSalary +
               "\n Bonus=" + bonus +
               "\n Allowance=" + allowance +
               "\n Total Salary=" + getTotalSalary();
    }


}
