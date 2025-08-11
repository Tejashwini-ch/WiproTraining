package AssessmentPractice1;

public class EmployeeLeaveDetails {
    int earnedLeaves;
    int casualLeaves;
    int sickLeaves;

    public EmployeeLeaveDetails(int earnedLeaves, int casualLeaves, int sickLeaves) {
        this.earnedLeaves = earnedLeaves;
        this.casualLeaves = casualLeaves;
        this.sickLeaves = sickLeaves;
    }

    public int getEarnedLeaves() {
        return earnedLeaves;
    }

    public int getCasualLeaves() {
        return casualLeaves;
    }

    public int getSickLeaves() {
        return sickLeaves;
    }

    public int getTotalLeaves() {
        return earnedLeaves + casualLeaves + sickLeaves;
    }

    @Override
    public String toString() {
        return "EmployeeLeaveDetails " +
               "Earned Leaves=" + earnedLeaves +
               ",\n Casual Leaves=" + casualLeaves +
               ",\n Sick Leaves=" + sickLeaves +
               ",\n Total Leaves=" + getTotalLeaves() ;
    }
}
	


