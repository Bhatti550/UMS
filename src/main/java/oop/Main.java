package oop;

public class Main {
    public static void main(String[] args) {
        UniversityInfo university = new UniversityInfo("COMSATS","Lahore");
        // --> Adding Faculty.
        Faculty faculty1 = new Faculty("Jawad Naeem", 40, "F1001");
        Faculty faculty2 = new Faculty("Rizwan Ali", 35, "F1002");
        // --> Adding Department.
        Department department1 = new Department(201, "Computer Science");
        Department department2=new Department(202,"Electrical Engineering");
        // --> Adding Courses.
        Course course1 = new Course("Java Programming", 301);
        Course course2 = new Course("Database Management", 302);
        // --> Adding Student
        Student student1 = new Student("Hasan Raza", 20, "S2001");
        Student student2 = new Student("Afnan", 22, "S2002");
        // --> Adding Faculty into University.
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);
        // --> Adding  course into Department.
        department1.addCourse(course1);
        department1.addCourse(course2);
        // --> Assign Course to  Specific nFaculty.
        course1.assignFaculty(faculty1);
        course2.assignFaculty(faculty2);
        // --> Course Taught by Specific Faculty.
        faculty1.teachCourse(course1);
        faculty1.teachCourse(course2);
        faculty2.teachCourse(course2);
        // --> Adding Department into University.
        university.addDepartment(department1);
        university.addDepartment(department2);
        // --> Student Enroll for Specific Course.
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);
        // --> Adding Person.
        university.addStudent(student1);
        university.addStudent(student2);
        university.addPerson(student1);
        university.addPerson(student2);
        university.addPerson(faculty1);
        university.addPerson(faculty2);
        //--> Adding Lecture for Specific Course.
        Lecture lecture1 = new Lecture("Introduction to Java");
        Assignment assignment1 = new Assignment("First Java Assignment");
        course1.addAssignment(assignment1);
        course2.addLecture(lecture1);
        // --> Different Output on Different Use Cases
        System.out.println("List of Faculty Members:");
        for (Faculty faculty : university.getFaculties()) {
            System.out.println("Name: " + faculty.getName());
            System.out.println("Age: " + faculty.getAge());
            System.out.println("Faculty ID: " + faculty.getFacultyId());
            System.out.println("Courses Taught:");
            for (Course course : faculty.getCoursesTaught()) {
                System.out.println("- " + course.getName());
            }
            System.out.println("------------------------------------");
        }
        System.out.println("List of Department:");
        for (Department departments: university.departments()) {
            System.out.println("Name: " + departments.getDepartmentName());
            System.out.println("Department ID: " + departments.getDepartmentId());
            System.out.println("------------------------------------");
        }
        System.out.println("List of Students with Enrolled Courses:");
        for (Student student : university.getStudents()) {
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Student ID: " + student.getStudentId());
            System.out.println("Enrolled Courses:");
            for (Course course : student.getEnrolledCourses()) {
                System.out.println(course.getName());
            }
            System.out.println("------------------------------------");
        }
        for (Person person : university.getPeople()) {
            if (person instanceof Student) {
                System.out.println("Student Person");
            } else if (person instanceof Faculty) {
                System.out.println("Faculty Person");
            }
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("------------------------------------");
        }
        // Print lectures and assignments for a course
        System.out.println("Lectures for " + course2.getName() + ":");
        for (Lecture lecture : course2.getLectures()) {
            System.out.println(lecture.getTopic());
            System.out.println("------------------------------------");
        }

        System.out.println("Assignments for " + course1.getName() + ":");
        for (Assignment assignment : course1.getAssignments()) {
            System.out.println(assignment.getTitle());
            System.out.println("------------------------------------");
        }
    }
}