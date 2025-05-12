package MLMS;

import java.util.*;

public class Student extends User {
    private List<Course> enrolledCourses = new ArrayList<>();
    private Map<Course, Double> grades = new HashMap<>();

    public Student(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public void login() {
        System.out.println(getName() + " (Student) has logged in.");
    }

    @Override
    public void logout() {
        System.out.println(getName() + " (Student) has logged out.");
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
    }

    public void viewGrades() {
        System.out.println("Grades for " + getName() + ":");
        for (Map.Entry<Course, Double> entry : grades.entrySet()) {
            System.out.printf("  %s: %.2f\n", entry.getKey().getTitle(), entry.getValue());
        }
    }

    public void setGrade(Course course, double grade) {
        grades.put(course, grade);
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public Map<Course, Double> getGrades() {
        return grades;
    }
}
