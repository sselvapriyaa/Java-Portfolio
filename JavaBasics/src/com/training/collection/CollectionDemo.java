package com.training.collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		//Set<Integer> values = new HashSet<> ();
		//List<Integer> values = new ArrayList<> ();
		
		/*List<String> names = new ArrayList<>();
		names.add("Selva");
		names.add("Priya");
		names.add("Anand");*/
				
		
		/*values.add(2);
		values.add(6);
		values.add(8);
		values.add(3);
		values.add(2);
		
		for(int num: values) {
			System.out.println(num);
		}*/
		Student stud1 = new Student("Selva", 12, "B");
		Student stud2 = new Student("Priya", 10, "C");
		Student stud3 = new Student("Anand", 12, "A");
		Student stud4 = new Student("Kevin", 13, "B");
		Student stud5 = new Student("Selva", 12, "B");
		
		//Set<Student> studentSet = new HashSet<>();
		Set<String> names = new TreeSet<>();
		
		//Map<String, Student> studentMap = new HashMap<>();
		names.add("Selva");
		names.add("Anand");
		names.add("Priya");
		

		/*studentSet.add(stud1);
		studentSet.add(stud2);
		studentSet.add(stud3);
		studentSet.add(stud4);
		studentSet.add(stud5);*/
		
		/*studentMap.put("1", stud1);
		studentMap.put("2", stud2);
		studentMap.put("3", stud3);
		studentMap.put("4", stud4);*/
		
		/*for(Map.Entry<String, Student> entry : studentMap.entrySet()) {
			//String key = entry.getKey();
			Student student = entry.getValue();
			System.out.println("NAME: " +student.getName() + " GRADE: "+ student.getGrade());
		}*/
		
		
		/*List<Student> studentList = new ArrayList<>();
		
		studentList.add(stud1);
		studentList.add(stud2);
		studentList.add(stud3);
		studentList.add(stud4);*/
		
		/*for(String name: names) {
			System.out.println(name);
		}*/
		
		/*for(Student student: studentList) {
		System.out.println(student.getName());
	}*/
		/*for(Student student: studentSet) {
		System.out.println(student.getName());		
	}*/
		/*for(String student: names) {
			System.out.println(student.getName());
	}*/
	}
}
