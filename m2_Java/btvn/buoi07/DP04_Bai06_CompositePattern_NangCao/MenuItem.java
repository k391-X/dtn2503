package DP04_Bai04_CompositePattern_NangCao;

public class MenuItem implements MenuComponent {
	private String name;

	public MenuItem(String name) {
		this.name = name;
	}

	@Override
	public void show(String indent) {
		System.out.println(indent + "- " + name);
	}

}
