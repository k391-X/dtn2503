package KHTH;

public class Instructor extends Person {
	private String instructorId;
	
	public Instructor(String instructorId, String name, int age) {
		super(name, age);
		this.instructorId = instructorId;
	}

	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + "," + super.toString() +"]";
	}
	
	
}
