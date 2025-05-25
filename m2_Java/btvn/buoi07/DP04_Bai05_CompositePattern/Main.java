package DP04_Bai03_CompositePattern;

public class Main {

	public static void main(String[] args) {
		// Nhan vien thuong
		Employee dev1 = new Staff("An", "Developer");
		Employee dev2 = new Staff("Binh", "Developer");
		Employee hr1 = new Staff("Chi", "HR");

		// Quan ly phong ky thuat
		Manager techLead = new Manager("Dung", "Tech Lead");
		techLead.add(dev1);
		techLead.add(dev2);

		// Quan ly tong
		Manager ceo = new Manager("Ha", "CEO");
		ceo.add(techLead);
		ceo.add(hr1);

		// In ra toan bo so do cong ty
		ceo.showDetails("");

	}

}
