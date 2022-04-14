package com.training.mars;
//import java.util.Scanner;

public class BasicsDemo {

	public static void main(String[] args) {
		
		//Scanner scanner =  new Scanner(System.in);
		//guess(scanner);
		
		/*System.out.println("Enter age: ");
		int age = scanner.nextInt();
		
		if(age < 18) {
			System.out.println("Not eligible to vote!");
		}
		else {
			System.out.println("Eligible to vote!");
		}
		scanner.close();

	}*/
	//private static void guess(Scanner scanner) {
	//int number = scanner.nextInt();
		//pattern1();
		pattern2();
//}
	}
	/*private static void pattern1() {
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}*/
	private static void pattern2() {
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print(j);
				//j++;
			}
			System.out.println();
}
}
	
}

//1. Take input from the user
//2. If it matches with your lucky number then print "you guesses it right!!"
//3. else print "Better luck next time!!"

// Print the pattern
// 1
// 12
// 123

// 1
// 23
// 456 