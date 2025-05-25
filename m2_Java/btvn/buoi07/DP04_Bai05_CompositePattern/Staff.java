package DP04_Bai03_CompositePattern;

public class Staff implements Employee {
	private String name;
	private String position;

	public Staff(String name, String position) {
		this.name = name;
		this.position = position;
	}

	@Override
	public void showDetails(String indent) {
		System.out.println(indent + "- " + name + " (" + position + ")");

	}

}
