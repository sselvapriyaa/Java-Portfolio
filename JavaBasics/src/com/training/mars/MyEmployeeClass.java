package com.training.mars;
import com.training.mars.Employee;
public class MyEmployeeClass {
	public static void main(String args[]) {
		Employee e1 = new Employee();
		e1.setId("111");
		e1.setName("Priya");
		e1.setDepartment("Computer Science");
		e1.setAge(40);
		System.out.println(e1.getEmployeeInfo());
		
		Employee e2 = new Employee();
		e2.setId("112");
		e2.setName("Gladwin");
		e2.setDepartment("Math");
		e2.setAge(10);
		System.out.println(e2.getEmployeeInfo());
		


}
}
