package MLMS;

import java.util.*;

public class Course {
    private String courseId;
    private String title;
    private Instructor instructor;
    private List<Student> students = new ArrayList<>();
    private Map<Student, Double> grades = new HashMap<>();

    public Course(String courseId, String title, Instructor instructor) {
        this.courseId = courseId;
        this.title = title;
        this.instructor = instructor;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void setGrade(Student student, double grade) {
        grades.put(student, grade);
        student.setGrade(this, grade);
    }

    public void printGrades() {
        System.out.println("Grades for course: " + title);
        for (Map.Entry<Student, Double> entry : grades.entrySet()) {
            System.out.printf("  %s: %.2f\n", entry.getKey().getName(), entry.getValue());
        }
    }

    public String getCourseId() {
        return courseId;
    }

    public String getTitle() {
        return title;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Map<Student, Double> getGrades() {
        return grades;
    }
}

