package KHTH;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Instructor ins01 = new Instructor("I01", "Nguyen Van A", 37);
		
		Student stu01 = new Student("S01", "Tran Thi B", 15);
		Student stu02 = new Student("S02", "Nguyen Van Muoi", 10);
		Student stu03 = new Student ("S03", "Dinh Van Ba", 14);
		
		Course cou01 = new Course("C01", "Java", ins01);
		Course cou02 = new Course("C02", "OOP", ins01);
		
		stu01.registerCourse(cou01);
		stu01.registerCourse(cou02);
		stu02.registerCourse(cou02);
		
//		stu01.removeCourse(cou02);
		
		System.out.println(cou01);
		System.out.println(cou02);
		
	}

}
