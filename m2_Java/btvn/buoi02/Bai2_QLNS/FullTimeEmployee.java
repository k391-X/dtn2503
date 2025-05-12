package QLNS;

public class FullTimeEmployee extends Employee{

	private double fixedSalary;
	
	public FullTimeEmployee(String id, String name, double fixedSalary) {
		super(id, name);
		this.fixedSalary = fixedSalary;
	}

	@Override
	void caculateSalary() {
		setSalary(fixedSalary); 
	}
	
}
