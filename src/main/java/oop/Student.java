package oop;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String studentId;

    private List<Course> enrolledCourses;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
        enrolledCourses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
    }
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }
    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

}

