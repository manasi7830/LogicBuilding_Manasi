package com.practice;

public class LargestElementInArray {

	public static void main(String[] args) {
		// Array
		int input[] = { 10, 20, 30, -50, 60, 70 };
		// Considering the number on 0th index as largest number
		int largest = input[0];
		// traversing array
		for (int i = 1; i <= input.length - 1; i++) {
			if (input[i] > largest) {
				largest = input[i];
			}
		}
		System.out.println(largest);

	}

}
