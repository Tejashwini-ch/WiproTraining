package AssessmentPractice1;

public class EmployeeProjectDetails {
	public static class Project {
        String projectName;
        String projectDescription;
        String role;

        public Project(String projectName, String projectDescription, String role) {
            this.projectName = projectName;
            this.projectDescription = projectDescription;
            this.role = role;
        }

        @Override
        public String toString() {
            return "Project Name: " + projectName +
                   "\nDescription: " + projectDescription +
                   "\nRole: " + role + "\n";
        }
    }

	

}
