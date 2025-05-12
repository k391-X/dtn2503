package MLMS;

public class Main {
    public static void main(String[] args) {
        LMS lms = new LMS();

        Instructor instructor = new Instructor("I001", "Nguyen Van A", "nguyenvana@lms.com");
        Student s1 = new Student("S001", "Tran Thi B", "tranthidinh@lms.com");
        Student s2 = new Student("S002", "Cao Van C", "caovancl@lms.com");

        lms.addUser(instructor);
        lms.addUser(s1);
        lms.addUser(s2);

        Course javaCourse = instructor.createCourse("C001", "Java Basics");
        lms.addCourse(javaCourse);

        s1.enrollCourse(javaCourse);
        s2.enrollCourse(javaCourse);

        instructor.gradeStudent(javaCourse, s1, 8.5);
        instructor.gradeStudent(javaCourse, s2, 9.2);

        lms.printAllGrades();
    }
}
