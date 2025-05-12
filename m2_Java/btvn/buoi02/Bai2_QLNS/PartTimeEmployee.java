package QLNS;

public class PartTimeEmployee extends Employee {
	private int hoursWorked;
	private double hourlyRate;

	public PartTimeEmployee(String id, String name, int hoursWorked, double hourlyRate) {
		super(id, name);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	@Override
	void caculateSalary() {
		setSalary(hoursWorked * hourlyRate);
	}

}
