package courseregistration;

public class Test {
    public static void main(String[] args) throws Exception {
        RegistrationManager manager = new RegistrationManager();

        Course javaCourse = new Course("C101", "Java Programming");
        manager.addCourse(javaCourse);

        Student s1 = new Student("S001", "Alice");
        manager.addStudent(s1);

        s1.registerCourse(javaCourse);
        System.out.println(s1.getRegisteredCourses());
    }
}
