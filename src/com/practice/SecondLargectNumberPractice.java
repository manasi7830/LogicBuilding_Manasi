package com.practice;

public class SecondLargectNumberPractice {

	public static void main(String[] args) {
		// Creating input array
		int input[] = { 1, 3, 2, 7, 5 };
		// Creating variable and assigning min value
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		// Traversing through array and comparing values with largest and second largest
		for (int number : input) {
			if (number > largest) {
				secondLargest = largest;
				largest = number;
			} else if (number > secondLargest && number != largest) {
				secondLargest = number;
			}
		}

		System.out.println("Second largest number in an Array is " + secondLargest);

	}

}
