package com.practice;

public class FindLargestNumberinArrayPractice {

	public static void main(String[] args) {
		// creating Array
		int input[] = { 10, 20, 40, -60, 70, 45 };
		int largest = input[0];
		for (int number = 0; number <= input.length - 1; number++) {
			if (input[number] > largest) {
				largest = input[number];

			}

		}
		System.out.println("Largest number in an array is " + largest);

	}

}
