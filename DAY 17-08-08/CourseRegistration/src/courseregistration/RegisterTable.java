package courseregistration;

public interface RegisterTable {
    void registerCourse(Course course) throws CourseAlreadyRegisteredException;
    void dropCourse(Course course) throws CourseNotFoundException;
}
