package oop;

import java.util.ArrayList;
import java.util.List;

public class Department {


    private int departmentId;
    private String departmentName;
    private List<Course> courseList;

    public Department(int departmentId, String departmentName){
        this.departmentId=departmentId;
        this.departmentName=departmentName;
        this.courseList=new ArrayList<>();
    }
    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Department(String name, int id) {
        this.departmentName = name;
        this.departmentId=id;
         List<Course> courseList = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }

}
