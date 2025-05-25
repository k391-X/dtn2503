package DP04_Bai04_CompositePattern_NangCao;

import java.util.List;
import java.util.ArrayList;

public class SubMenu implements MenuComponent {

	private String name;
	private List<MenuComponent> children = new ArrayList<>();

	public SubMenu(String name) {
		this.name = name;
	}

	public void add(MenuComponent component) {
		children.add(component);
	}

	public void remove(MenuComponent component) {
		children.remove(component);
	}

	@Override
	public void show(String indent) {
		System.out.println(indent + "+ " + name);
		for (MenuComponent child : children) {
			child.show(indent + " ");
		}

	}

}
