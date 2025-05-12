package QLNS;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new FullTimeEmployee("FT001", "Nguyen Van A", 15000000));
		employeeList.add(new FullTimeEmployee("FT002", "Tran Thi B", 18000000));
		employeeList.add(new FullTimeEmployee("FT003", "Nguyen Quang C", 20000000));

		employeeList.add(new PartTimeEmployee("PT001", "Le Van D", 100, 120000));
		employeeList.add(new PartTimeEmployee("PT002", "Pham Thi E", 80, 100000));
		employeeList.add(new PartTimeEmployee("PT003", "Pham Xuan F", 50, 80000));

		double totalSalary = 0;

		for (Employee employee : employeeList) {
			employee.caculateSalary();
			employee.display();
			totalSalary += employee.getSalary();
		}

		System.out.println("Tổng lương: " + String.format("%.0f", totalSalary));

	}

}
