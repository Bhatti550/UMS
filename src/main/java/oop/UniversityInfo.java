package oop;

import java.util.ArrayList;
import java.util.List;

public class UniversityInfo {
    private static String universityName;
    private static String location;
    private List<Faculty> faculties;
    private List<Department> departments;
    private List<Student> students;
    private List<Course> courses;
    public UniversityInfo(String name, String location) {
        UniversityInfo.universityName = name;
        UniversityInfo.location =location;
        faculties = new ArrayList<>();
        departments = new ArrayList<>();
        students = new ArrayList<>();
        courses=new ArrayList<>();
        String stingFormat=String.format("University Name = %s%n Location = %s", name,location);
        System.out.println(stingFormat);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    public List<Student> getStudents(){
        return students;
    }
    public List<Department> departments(){
        return departments;
    }
    List<Course> getCourses(){
        return courses;
    }
}
