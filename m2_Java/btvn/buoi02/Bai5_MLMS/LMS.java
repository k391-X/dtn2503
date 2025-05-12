package MLMS;

import java.util.*;

public class LMS {
    private List<User> users = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void printAllGrades() {
        for (Course c : courses) {
            c.printGrades();
        }
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Course> getCourses() {
        return courses;
    }
}

