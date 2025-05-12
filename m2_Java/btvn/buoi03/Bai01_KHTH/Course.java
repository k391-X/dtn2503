package KHTH;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String courseId;
	private String courseName;
	private Instructor instructor;
	private List<Student> students;
	
	public Course(String courseId, String courseName, Instructor instructor) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.instructor = instructor;
		this.students = new ArrayList<>();
	}
	

	public List<Student> getStudents() {
		return students;
	}
	
	public void addStudent(Student student) {
		if (!students.contains(student)) {
			students.add(student);
			student.registerCourse(this);
		}
	}
	
	public void removeStudent(Student student) {
		students.remove(student);
	}
	
	public void printStudents() {
		System.out.println("Danh sách học viên khoá "+this.courseName+":");
		for(Student student: students) {
			System.out.println(student);
		}
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}


	public Instructor getInstructor() {
		return instructor;
	}


	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}


	public String getCourseName() {
		return courseName;
	}



	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}



	public String getCourseId() {
		return courseId;
	}



	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}



	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", instructor=" + instructor
				+ ", students=" + students + "]";
	}
	
}
