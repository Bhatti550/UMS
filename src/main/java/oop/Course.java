package oop;


import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private int id;
    private Faculty faculty;

    private List<Student> enrolledStudents;
    private final List<Lecture> lectureList;
    private final List<Assignment> assignmentList;

    public Course(String name, int id) {
        this.name = name;
        this.id=id;
        enrolledStudents = new ArrayList<>();
        lectureList=new ArrayList<>();
        assignmentList=new ArrayList<>();
    }
    public void addLecture(Lecture lecture) {
        lectureList.add(lecture);
    }

    public void addAssignment(Assignment assignment) {
        assignmentList.add(assignment);
    }

    public void assignFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public List<Lecture> getLectures() {
        return lectureList;
    }

    public List<Assignment> getAssignments() {
        return assignmentList;
    }
}
