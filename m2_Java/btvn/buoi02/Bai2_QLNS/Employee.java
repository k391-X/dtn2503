package QLNS;

public abstract class Employee {
	private String id;
	private String name;
	private double salary;

	public Employee() {

	}

	public Employee(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	abstract void caculateSalary();

	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + String.format("%.0f", salary));
	}
}
