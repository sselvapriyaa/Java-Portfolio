package com.training.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StudentCompareEquals {

	public static void main(String[] args) {
		Set<Student> hashSet = new HashSet<>();
		Student stud1 = new Student("Selva", 12, "B");
		Student stud2 = new Student("Priya", 32, "C");
		Student stud3 = new Student("Anand", 15, "A");
		Student stud4 = new Student("Gladwin", 20, "A");
		Student stud5 = new Student("Selva", 12, "B");
		
		/*Student stud1 = new Student("Selva", 32, "B");
		Student stud2 = new Student("Priya", 12, "C");
		Student stud3 = new Student("Anand", 9, "A");
		Student stud4 = new Student("Gladwin", 23, "A");
		Student stud5 = new Student("Selva", 12, "B");*/
		
		hashSet.add(stud1);
		hashSet.add(stud2);
		hashSet.add(stud3);
		hashSet.add(stud4);
		hashSet.add(stud5);
		System.out.println("Hash Set implementation");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		for(Student students: hashSet)
		{
			System.out.println("Name: "  +students.getName() + " Roll_No: " 
		    +students.getRollNo() + " Grade: " +students.getGrade());
		}
		

		Set<Student> studentSet = new TreeSet<>();
		
		studentSet.add(stud1);
		studentSet.add(stud2);
		studentSet.add(stud3);
		studentSet.add(stud4);
		studentSet.add(stud5);
		
		System.out.println("Tree Set implementation");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
	
		for(Student student: studentSet)
		{
			System.out.println("Name: "  +student.getName());
			/*System.out.println("Name: "  +student.getName() +" Roll_No: " 
				    +student.getRollNo() );*/
			
		}
		
		/*List<Student> studentList = new ArrayList<>();
		
		studentList.add(stud1);
		studentList.add(stud2);
		studentList.add(stud3);
		studentList.add(stud4);*/
		//studentList.add(stud5);
		
		/*System.out.println("Array List implementation");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");*/
		//Collections.sort(studentList);
		/*Collections.sort(studentList, new NameComparator());
		for(Student student: studentList)
		{
			System.out.println("Name: "  +student.getName() + " Roll_No: " 
				    +student.getRollNo());
		
	}*/
	}
}



