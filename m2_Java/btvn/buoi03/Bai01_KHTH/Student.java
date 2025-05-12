package KHTH;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
	private String studentId;
	private List<Course> courses; 

	public Student(String studentId, String name, int age) {
		super(name, age);
		this.studentId = studentId;
		this.courses = new ArrayList<>();
	}
	
	public void registerCourse(Course course) {
		if (!courses.contains(course)) {
			courses.add(course);
			course.addStudent(this);
		}
	}
	
	public void removeCourse(Course course) {
		courses.remove(course);
		course.removeStudent(this);
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + "," + super.toString() + " ]";
	}

}
