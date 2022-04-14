package com.training.mars;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	int n; // Array Size Declaration
	System.out.println("Enter the number of elements: ");
	n = scanner.nextInt(); // Array Size Initialization
	
	Integer arr[] = new Integer[n]; // Array Declaration
	System.out.println("Enter the elements of the array: ");
	for(int i = 0;i < n; i++) //Array Initialization
	{
		arr[i] = scanner.nextInt();	
	}
	
	int temp = 0; // Temporary variable to store the element
	
	for(int i = 0; i < arr.length; i++) // Holds each Array element
	{
		for(int j = i+1; j < arr.length; j++) //compares with remaining Array elements
		{
			if(arr[i] > arr[j])  // Compare and swap
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	System.out.println();
	
	// Displaying elements of array after sorting
	System.out.println("Elements of array sorted in ascending order: ");
	for(int i = 0; i < arr.length; i++)
	{
		System.out.print(arr[i] + " ");
	}
	
	scanner.close();
	
}
}

