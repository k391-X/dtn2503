package MLMS;

import java.util.*;

public class Instructor extends User {
    private List<Course> courseList = new ArrayList<>();

    public Instructor(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public void login() {
        System.out.println(getName() + " (Instructor) has logged in.");
    }

    @Override
    public void logout() {
        System.out.println(getName() + " (Instructor) has logged out.");
    }

    public Course createCourse(String courseId, String title) {
        Course course = new Course(courseId, title, this);
        courseList.add(course);
        return course;
    }

    public void gradeStudent(Course course, Student student, double grade) {
        course.setGrade(student, grade);
    }

    public List<Course> getCourseList() {
        return courseList;
    }
}

