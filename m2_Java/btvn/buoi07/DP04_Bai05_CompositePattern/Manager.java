package DP04_Bai03_CompositePattern;

import java.util.List;
import java.util.ArrayList;

public class Manager implements Employee {

	private String name;
	private String position;
	private List<Employee> subordinates = new ArrayList<>();

	public Manager(String name, String position) {
		this.name = name;
		this.position = position;
	}

	public void add(Employee e) {
		subordinates.add(e);
	}

	public void remove(Employee e) {
		subordinates.remove(e);
	}

	@Override
	public void showDetails(String indent) {
		System.out.println(indent + "+ " + name + " (" + position + ")");
		for (Employee e : subordinates) {
			e.showDetails(indent + " ");
		}
	}

}
