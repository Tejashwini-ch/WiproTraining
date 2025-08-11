package courseregistration;

import java.util.ArrayList;

public class Student extends Person implements RegisterTable {
    private ArrayList<Course> registeredCourses;

    public Student(String id, String name) {
        super(id, name);
        this.registeredCourses = new ArrayList<>();
    }

    @Override
    public void registerCourse(Course course) throws CourseAlreadyRegisteredException {
        if (registeredCourses.contains(course)) {
            throw new CourseAlreadyRegisteredException("Course already registered: " + course);
        }
        registeredCourses.add(course);
    }

    @Override
    public void dropCourse(Course course) throws CourseNotFoundException {
        if (!registeredCourses.contains(course)) {
            throw new CourseNotFoundException("Course not found: " + course);
        }
        registeredCourses.remove(course);
    }

    public ArrayList<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + getId() + ", Name: " + getName());
    }
}
