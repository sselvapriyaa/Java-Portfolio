package com.training.mars;

public class MyClass {
	static int age;
	public static void main(String args[]) {
		System.out.println("This is my first JAVA file");
		System.out.println("New change");
		
		byte number = 12;
		System.out.println("Byte value is " +number);
		short shortValue = 48;
		int intValue = 89;
		byte newByte = (byte)intValue;// Explicit typecasting
		int newInt = shortValue; //  Implicit typecasting
		
		int charValue = 'a';
		System.out.println("Character value is " +charValue);
		//int age = 27;
		System.out.println("Age of the person is " +age);
		
		Person p1 = new Person();
		p1.setHeight(170);
		p1.setWeight(80);
		System.out.println(p1.getPersonInfo());
		
		
		Person p2 = new Person();
		p2.setHeight(180);
		p2.setWeight(75);
		System.out.println(p2.getPersonInfo());
		
		
		 
	}

}


