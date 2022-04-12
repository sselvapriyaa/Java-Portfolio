package com.training.mars;

public class Employee {
	private String id;
	private String name;
	private String department;
	private int age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getEmployeeInfo() { // instance method
		return "Employee id: "+this.id+ "\n"+ "Name: "+this.name +"\n"+ "Department: "+this.department+ "\n"+ "Age:"+this.age+ "\n";
	}
}
