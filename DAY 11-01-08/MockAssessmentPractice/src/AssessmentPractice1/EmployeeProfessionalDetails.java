package AssessmentPractice1;

public class EmployeeProfessionalDetails {

    public static class Professional {
        private String empId;
        private String empMail;
        private String empDept;
        private String empLocation;

        public Professional(String empId, String empMail, String empDept, String empLocation) {
            this.empId = empId;
            this.empMail = empMail;
            this.empDept = empDept;
            this.empLocation = empLocation;
        }

        public String getEmpId() {
            return empId;
        }

        public String getEmpMail() {
            return empMail;
        }

        public String getEmpDept() {
            return empDept;
        }

        public String getEmpLocation() {
            return empLocation;
        }

        @Override
        public String toString() {
            return "EmployeeProfessionalDetails\n" +
                   "empId=" + empId + ",\n" +
                   "empMail=" + empMail + ",\n" +
                   "empDept=" + empDept + ",\n" +
                   "empLocation=" + empLocation;
        }
    }
}