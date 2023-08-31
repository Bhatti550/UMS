package oop;

import java.util.ArrayList;
import java.util.List;

public class UniversityInfo {
    private static String universityName;
    private static String location;
    private final List<Faculty> faculties;
    private final List<Department> departments;
    private final List<Student> students;
    private final List<Course> courses;


    private final List<Person> people;
    public UniversityInfo(String name, String location) {
        UniversityInfo.universityName = name;
        UniversityInfo.location =location;
        faculties = new ArrayList<>();
        departments = new ArrayList<>();
        students = new ArrayList<>();
        courses=new ArrayList<>();
        people=new ArrayList<>();
        System.out.println("------------------------------------");
        String stingFormat=String.format("University Name = %s%nLocation = %s",name,location);
        System.out.println(stingFormat);
        System.out.println("------------------------------------");
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
    public void addPerson(Person person) {
        people.add(person);
    }
    public List<Person> getPeople() {
        return people;
    }
}
