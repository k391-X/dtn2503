package QLSV;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		
		inputStudentList(studentList);
		gpa32(studentList);
		gpaDesc(studentList);
		gpaDescBubbleSort(studentList);
	}
	
	static void inputStudentList(List<Student> list) {
        list.add(new Student("S01", "An", 20, 3.5));
        list.add(new Student("S02", "Bình", 21, 2.8));
        list.add(new Student("S03", "Chi", 22, 3.9));
        list.add(new Student("S04", "Dũng", 20, 3.1));
        list.add(new Student("S05", "Em", 19, 3.3));
        list.add(new Student("S06", "Phúc", 21, 2.5));
        list.add(new Student("S07", "Giang", 23, 3.7));
        list.add(new Student("S08", "Hoa", 22, 3.0));
        list.add(new Student("S09", "Khoa", 20, 3.8));
        list.add(new Student("S10", "Lan", 21, 3.4));		
	}
	
	static void gpa32(List<Student> list) {
		System.out.println("Danh sách sinh viên có gpa lớn hơn 3.2:");
		for (Student student: list) {
			if ( student.getGpa() > 3.2 ) {
				System.out.println(student);
			}
		}
	}
	
	static void gpaDesc(List<Student> list) {
		System.out.println("Danh sách sinh viên sắp xếp theo gpa giảm dần: ");
		list.sort((a, b) -> Double.compare(b.getGpa(), a.getGpa()));
		for (Student student: list) {
			System.out.println(student);
		}
	}
	
	static void bubbleSortGpa(List<Student> list) {
		System.out.println("Danh sách sinh viên sắp xếp theo gpa giảm dần: ");
		for (int i = 0; i < list.size(); i++) {
			for (int j = list.size() - 1; j > 0; j--) {
				if (list.get(j).getGpa() < list.get(i).getGpa()) {
					
				}
			}
		}
	}
	
	static void gpaDescBubbleSort(List<Student> list) {
	    System.out.println("Danh sách sinh viên sắp xếp theo GPA giảm dần:");
	    int n = list.size();
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - 1 - i; j++) {
	            if (list.get(j).getGpa() < list.get(j + 1).getGpa()) {
	                // Hoán đổi sinh viên
	                Student temp = list.get(j);
	                list.set(j, list.get(j + 1));
	                list.set(j + 1, temp);
	            }
	        }
	    }

	    // In danh sách sau khi sắp xếp
	    for (Student s : list) {
	        System.out.println(s);
	    }
	}

}
