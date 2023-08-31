package oop;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person {
    private String facultyId;

    private List<Course> coursesTaught;

    public Faculty(String name, int age, String facultyId) {
        super(name, age);
        this.facultyId = facultyId;
        coursesTaught = new ArrayList<>();
    }

    public void teachCourse(Course course) {
        coursesTaught.add(course);
    }
    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public List<Course> getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(List<Course> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }
}

